package cms.com.det.controller;

import java.time.Year;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cms.com.det.dto.AcademicDetailsForm;
import cms.com.det.dto.Admissiondetailsform;
import cms.com.det.dto.DashboardStudentAdress;
import cms.com.det.dto.DashboardStudentFormData;
import cms.com.det.dto.Feepayment;
import cms.com.det.service.Academicdetailsservice;
import cms.com.det.service.Admissiondetailservice;
import cms.com.det.service.DashboardService;
import cms.com.det.service.DashboardStudentAdresService;
import cms.com.det.service.DistrictService;
import cms.com.det.service.Feepaymentservice;

@Controller
public class detdashboardController {

	@Autowired
	DashboardService service;

	@Autowired
	DashboardStudentAdresService addressservice;

	@Autowired
	Academicdetailsservice academicdetailsservice;

	@Autowired
	Admissiondetailservice admissiondetailservice;

	@Autowired
	DistrictService districtService;

	@Autowired
	Feepaymentservice feepaymentservice;

	@Autowired
	public detdashboardController(DashboardService service, DashboardStudentAdresService addressservice) {
		this.service = service;
		this.addressservice = addressservice;
	}

	@GetMapping("/institutedashboard")
	public String institutedashboard(Model model) {

		return "/institute/institute_dashboard";
	}

	@GetMapping("/institutionalprofile")
	public String institutionalprofile(Model model) {

		return "/institute/institutional_profile";
	}

	@GetMapping("/personaldetails")
	public String personaldetails(Model model,
			@RequestParam(value = "applicationNumber", required = false) Integer applicationNumber,
			@RequestParam(name = "registrationnumber", required = false) String registrationNumber) {

		DashboardStudentFormData dashboardstudentformdata = new DashboardStudentFormData();
		DashboardStudentAdress dashboardstudentaddress = new DashboardStudentAdress();

		model.addAttribute("districts", districtService.findDistrictAll());

		model.addAttribute("applicationNumber", applicationNumber);
		model.addAttribute("registrationnumber", registrationNumber);

		model.addAttribute("dashboardstudentformdata", dashboardstudentformdata);
		model.addAttribute("dashboardstudentaddress", dashboardstudentaddress);

		return "/institute/personal_details";
	}

	@PostMapping("/personaldetalissave")
	public String saveStudentData(@ModelAttribute DashboardStudentFormData formData,
			@ModelAttribute DashboardStudentAdress dashboardStudentAddress,
			@RequestParam(value = "applicationNumber", required = false) Integer applicationNumber,

			@RequestParam("formAction") String formAction, Model model) {

		Map<String, String> response = new HashMap<>();
		String registrationnumber = generateRegistrationNumber();
		formData.setstudentid(registrationnumber);
		int application = service.save(formData);

		dashboardStudentAddress.setapplicationnumber(application);
		dashboardStudentAddress.setId(registrationnumber);

		model.addAttribute("applicationNumber", application);
		model.addAttribute("registrationnumber", registrationnumber);
		addressservice.save(dashboardStudentAddress);

		System.out.println("redirect:/viewpersonaldetails?applicationNumber=" + application + "&registrationnumber="
				+ registrationnumber);

		return "redirect:/viewpersonaldetails?applicationNumber=" + application + "&registrationnumber="
				+ registrationnumber;

	}

	@GetMapping("/viewpersonaldetails")
	public String viewStudentData(
			@RequestParam(value = "applicationNumber", required = false) Integer applicationnumber,
			@RequestParam(value = "registrationnumber", required = false) String registrationNumber, Model model) {

		// Fetch data from the database based on applicationNumber and
		// registrationNumber
		DashboardStudentFormData formData = service.getFormDataByApplicationNumber(applicationnumber);
		DashboardStudentAdress dashboardStudentAddress = addressservice
				.getAddressByApplicationNumber(applicationnumber);
		// applicationnumber
		// applicationnumber
		// Add fetched data to the model to pre-fill the form
		model.addAttribute("formData", formData);
		model.addAttribute("dashboardStudentAddress", dashboardStudentAddress);
		model.addAttribute("applicationNumber", applicationnumber);
		model.addAttribute("registrationNumber", registrationNumber);

		return "/institute/view_personaldetails";
	}

	@PostMapping("/viewdetalissave")
	public String viewdetalissave(
			@RequestParam(value = "applicationNumber", required = false) Integer applicationnumber,
			@RequestParam(value = "registrationnumber", required = false) String registrationNumber, Model model,
			@ModelAttribute DashboardStudentFormData formData,
			@ModelAttribute DashboardStudentAdress dashboardStudentAddress) {

		Long applicationNumber1 = Long.valueOf(applicationnumber);

		formData.setstudentid(registrationNumber);
		formData.setapplicationnumber(applicationNumber1);
		System.out.println("update request controller ");
		service.update(formData);
		System.out.println("student data updated ");

		model.addAttribute("formData", formData);
		model.addAttribute("dashboardStudentAddress", dashboardStudentAddress);
		model.addAttribute("applicationNumber", applicationnumber);
		model.addAttribute("registrationNumber", registrationNumber);

		return "redirect:/viewpersonaldetails?applicationNumber=" + applicationnumber + "&registrationnumber="
				+ registrationNumber;
	}

	@GetMapping("/academicdetails")
	public String academicdetails(Model model,
			@RequestParam(name = "applicationNumber", required = false) String applicationNumber,
			@RequestParam(name = "registrationnumber", required = false) String registrationnumber) {

		// System.out.println(applicationNumber);

		System.out.println(registrationnumber);

		AcademicDetailsForm academicDetailsForm = new AcademicDetailsForm();
		model.addAttribute("registrationnumber", registrationnumber);
		model.addAttribute("academicDetailsForm", academicDetailsForm);
		return "/institute/academic_details";

	}

	@PostMapping("/saveacademicdetails")
	public String saveAcademicDetails(
			@RequestParam(value = "applicationNumber", required = false) Integer applicationNumber,
			@RequestParam(name = "registrationnumber", required = false) String registrationNumber,
			@RequestParam("formAction") String formAction, Model model,
			@ModelAttribute AcademicDetailsForm academicDetailsForm) {

		System.out.println(registrationNumber);
		System.out.println(applicationNumber);

		Long applicationNumber1 = Long.valueOf(applicationNumber);
		academicDetailsForm.setapplicationnumber(applicationNumber1);
		academicDetailsForm.setStudentid(registrationNumber);
		model.addAttribute("academicDetailsForm", academicDetailsForm);

		academicdetailsservice.save(academicDetailsForm);

		return "redirect:/viewacademicdetails?applicationNumber=" + applicationNumber1 + "&registrationnumber="
				+ registrationNumber;

	}

	@GetMapping("/viewacademicdetails")
	public String viewacademicdetails(
			@RequestParam(value = "applicationNumber", required = false) Integer applicationnumber,
			@RequestParam(value = "registrationnumber", required = false) String registrationNumber, Model model,
			@ModelAttribute AcademicDetailsForm academicDetailsForm) {
		
		
		AcademicDetailsForm formData=academicdetailsservice.getFormDataByApplicationNumber(applicationnumber);
		
		model.addAttribute("formData", formData);
		model.addAttribute("applicationNumber", applicationnumber);
		model.addAttribute("registrationNumber", registrationNumber);
		
		
		
		return "redirect:/viewacademicdetails?applicationNumber=" + applicationnumber + "&registrationnumber="
				+ registrationNumber;
	}

	@GetMapping("/admissiondetails")
	public String admissiondetails(Model model,
			@RequestParam(name = "applicationNumber", required = false) String applicationNumber,
			@RequestParam(name = "registrationnumber", required = false) String registrationnumber)

	{
		Feepayment feepayment = new Feepayment();
		Admissiondetailsform admissiondetails = new Admissiondetailsform();
		model.addAttribute("registrationnumber", registrationnumber);
		model.addAttribute("admissiondetails", admissiondetails);
		model.addAttribute("feepayment", feepayment);
		return "/institute/admission_details";
	}

	@PostMapping("/admissiondetalissave")
	public String admissiondetalissave(@ModelAttribute Admissiondetailsform admissiondetails,
			@ModelAttribute Feepayment feepayment,
			@RequestParam(value = "applicationNumber", required = false) Integer applicationNumber,
			@RequestParam(name = "registrationnumber", required = false) String registrationNumber,
			@RequestParam(name = "formAction", required = false) String formAction, Model model) {

		Long applicationNumber1 = Long.valueOf(applicationNumber);

		admissiondetails.setStudentid(registrationNumber);
		admissiondetails.setApplicationnumber(applicationNumber1);

		feepayment.setStudentid(registrationNumber);
		feepayment.setApplicationnumber(applicationNumber1);

		admissiondetailservice.save(admissiondetails);
		feepaymentservice.save(feepayment);

		System.out.println("saved");
		model.addAttribute("admissiondetails", admissiondetails);
		model.addAttribute("feepayment", feepayment);
		return "redirect:/admissiondetails?applicationNumber=" + applicationNumber1 + "&registrationnumber="
				+ registrationNumber;

	}

	public static String generateRegistrationNumber() {

		String registrationPrefix = "BR";
		String cityCode = "PAT";
		Random random = new Random();
		String randomNumber = String.format("%06d", random.nextInt(1000000));

		int currentYear = Year.now().getValue();
		int lastTwoDigitsOfYear = currentYear % 100;
		int session = lastTwoDigitsOfYear - 1;

		String registration = registrationPrefix + session + lastTwoDigitsOfYear + cityCode + randomNumber;
		System.out.println(registration);
		return registration;
	}

}
