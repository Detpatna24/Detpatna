package cms.com.det.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cms.com.det.dto.Department;

@Controller
public class detdashboardController {

	
	@GetMapping("/institutedashboard")
	public String instituteregistration(Model model) {
		Department department = new Department();
		model.addAttribute("department", department);
		return "/institute/institute_dashboard";
	}
}
