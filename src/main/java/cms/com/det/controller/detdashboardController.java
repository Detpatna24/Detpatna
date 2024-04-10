package cms.com.det.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cms.com.det.dto.DashboardStudentFormData;
import cms.com.det.dto.InstituteDashboard;
import cms.com.det.dto.InstituteDashboardupload;
import cms.com.det.service.DashboardService;

@Controller
public class detdashboardController {

	@Autowired
	DashboardService service;

	@GetMapping("/institutedashboard")
	public String institutedashboard(Model model) {
		/*
		 * InstituteDashboard dashboard = new InstituteDashboard();
		 * InstituteDashboardupload admissionDetails = new InstituteDashboardupload();
		 * DashboardStudentFormData dashboardstudentformdata= new
		 * DashboardStudentFormData(); model.addAttribute("admissionDetails",
		 * admissionDetails);
		 * model.addAttribute("dashboardstudentformdata",dashboardstudentformdata);
		 * model.addAttribute("dashboard", dashboard);
		 */
		return "/institute/institute_dashboard";
	}

	@GetMapping("/institutionalprofile")
	public String institutionalprofile(Model model) {

		return "/institute/institutional_profile";
	}
	
	@GetMapping("/admissiondetails")
	public String admissiondetails(Model model) {

		return "/institute/admission_details";
	}
	
	
	

	@PostMapping("/personaldetalissave")
	public ResponseEntity<Map<String, String>> saveStudentData(@RequestBody DashboardStudentFormData formData) {
		Map<String, String> response = new HashMap<>();

		service.register(formData);
		return ResponseEntity.ok(response);
	}
}
