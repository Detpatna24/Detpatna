package cms.com.det.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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

	@GetMapping("/pricipalregistration")
	public String instituteregistration(Model model) {
		Department department = new Department();
		model.addAttribute("department", department);
		return "/employee/pricipal_registration";
	}

	@GetMapping("/datatable")
	public ModelAndView datatable() {
		int page = 1;
		int size = 50;
		{
			ModelAndView modelAndView = new ModelAndView("student-table");
			List<Student> students = studentservice.findbyid();

			modelAndView.addObject("currentPage", page);
			modelAndView.addObject("pageSize", size);

			modelAndView.addObject("students", students);
			return modelAndView;
		}

	}

	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("messages"); 
		messageSource.setDefaultEncoding("UTF-8");
		return messageSource;
	}

}
