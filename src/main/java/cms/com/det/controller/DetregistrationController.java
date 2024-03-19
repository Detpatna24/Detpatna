package cms.com.det.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import cms.com.det.dto.Department;
import cms.com.det.dto.Student;
import cms.com.det.service.StudentService;

import java.util.Map;

@Controller
public class DetregistrationController {

	@Autowired
	StudentService studentservice;

	@PostMapping("/registerstudent")
	public ResponseEntity<Map<String, String>> registerstudent(@ModelAttribute Student studentdto) {
		Map<String, String> response = new HashMap<>();

		try {

			String id = String.format("%08d", new Random().nextInt(100000000));

			System.out.println(id);
			studentdto.setTempid(id);

			LocalDateTime now = LocalDateTime.now();

			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			String formattedDateTime = now.format(formatter);

			System.out.println(formattedDateTime);
			studentdto.setCreated_date(formattedDateTime);
			studentdto.setUpdated_date(formattedDateTime);

			studentservice.registerUser(studentdto);
			response.put("message", "User registered successfully");

			return ResponseEntity.ok(response);

		} catch (RuntimeException e) {
			response.put("error", e.getMessage());
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
		}
	}

	@PostMapping("/registerdepartment")
	public ResponseEntity<Map<String, String>> registerdepartment(@ModelAttribute Department department) {

		Map<String, String> response = new HashMap<>();
		try {
			return ResponseEntity.ok(response);

		} catch (RuntimeException e) {
			response.put("error", e.getMessage());
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
		}

	}
}