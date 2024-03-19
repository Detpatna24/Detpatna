package cms.com.det.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ResponseBody;

import cms.com.det.dto.Department;
import cms.com.det.dto.Student;
import cms.com.det.service.StudentService;

@Controller
public class DetmainController {
	@Autowired
	StudentService studentservice;

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		System.out.println("hello");
		return "Hello from Spring Boot!";

	}

	@GetMapping("/index")
	public String index() {
		return "index";
	}

	@GetMapping("/itimodules")
	public String itimodules() {
		return "itimodules";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/registration")
	public String studentregistration(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "registration";
	}

	@GetMapping("/departmentalregistration")
	public String departmentalregistration(Model model) {
		Department department = new Department();
		model.addAttribute("department", department);
		return "departmental_registration";
	}

}
