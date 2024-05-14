package cms.com.det.controller;

import java.time.Year;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cms.com.det.dto.AcademicDetailsForm;
import cms.com.det.dto.Admissiondetailsform;
import cms.com.det.dto.DashboardStudentAdress;
import cms.com.det.dto.DashboardStudentFormData;
import cms.com.det.dto.Feepayment;
import cms.com.det.dto.WorkflowRemarks;
import cms.com.det.repo.Dashboardrepo;
import cms.com.det.service.Academicdetailsservice;
import cms.com.det.service.Academicsessionservice;
import cms.com.det.service.Admissiondetailservice;
import cms.com.det.service.DashboardService;
import cms.com.det.service.DashboardStudentAdresService;
import cms.com.det.service.DistrictService;
import cms.com.det.service.Feepaymentservice;
import cms.com.det.service.ITIservice;
import cms.com.det.service.Tradeservice;

@Controller
public class detdashboardController {

	@Autowired
	Dashboardrepo dashboardrepo;

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
	Tradeservice tradeservice;

	@Autowired
	ITIservice itiservice;

	@Autowired
	Academicsessionservice academicsessionservice;

	@Autowired
	public detdashboardController(DashboardService service, DashboardStudentAdresService addressservice) {
		this.service = service;
		this.addressservice = addressservice;
	}

	@GetMapping("/admissioninchargedashboard")
	public String admissioninchargedashboard(Model model) {

		return "/admissionincharge/admission_incharge_dashboard";
	}

	@GetMapping("/admissioninchargeadmissiondetail")
	public ModelAndView institutionalprofile(Model model) {

		ModelAndView modelAndView = new ModelAndView("/admissionincharge/admission_incharge_admissiondetail");
		List<String> tradeOfferedby = Arrays.asList("NCVT", "SCVT");

		int page = 1;
		int size = 50;
		List<Map<String, Object>> dashboardStudentformdata = service.findbyid();

		modelAndView.addObject("currentPage", page);
		modelAndView.addObject("pageSize", size);
		modelAndView.addObject("dashboardStudentformdata", dashboardStudentformdata);
		modelAndView.addObject("academicsession", academicsessionservice.findAll());
		modelAndView.addObject("tradeOfferedby", tradeOfferedby);
		modelAndView.addObject("tradename", tradeservice.findAll());

		return modelAndView;

	}

	@PostMapping("/admissioninchargeadmissiondetailsubmit")
	public String handleAction(@RequestParam(value = "checkboxid[]", required = false) String[] checkboxid,
			@RequestParam(value = "registrationid[]", required = false) String[] registrationid,
			@RequestParam(value = "sendSelectedValues", required = false) String sendSelectedValues,
			@RequestParam(value = "remarks", required = false) String remarks)

	{
		DashboardStudentFormData data = new DashboardStudentFormData();
		WorkflowRemarks work = new WorkflowRemarks();
		if (sendSelectedValues.equals("FORWARD_TO_PRINCIPAL_BY_ADMISSION_INCHARGE")) {
			System.out.println("inside forward_nodal_officer");
			data.setAdmissionWorkflowId("5");

		} /*
			 * else if (sendSelectedValues.equals("FORWARD_TO_STUDENT")) {
			 * data.setAdmissionWorkflowId("2");
			 * 
			 * }
			 */
		else if (sendSelectedValues.equals("reject")) {

			data.setAdmissionWorkflowId("11");

		}

		service.updateWorkflowStatusbyprincipal(checkboxid, data.getAdmissionWorkflowId(), remarks);

		return "redirect:/admissioninchargeadmissiondetail";
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

		return "/admissionincharge/personal_details";
	}

	@GetMapping("/upload")
//	@PreAuthorize("hasRole('ADMISSION_INCHARGE')")
	public String upload(Model model,
			@RequestParam(value = "applicationNumber", required = false) Integer applicationNumber,
			@RequestParam(name = "registrationnumber", required = false) String registrationNumber) {

		DashboardStudentFormData dashboardstudentformdata = new DashboardStudentFormData();
		DashboardStudentAdress dashboardstudentaddress = new DashboardStudentAdress();

		model.addAttribute("districts", districtService.findDistrictAll());

		model.addAttribute("applicationNumber", applicationNumber);
		model.addAttribute("registrationnumber", registrationNumber);

		model.addAttribute("dashboardstudentformdata", dashboardstudentformdata);
		model.addAttribute("dashboardstudentaddress", dashboardstudentaddress);

		return "/admissionincharge/upload";
	}

	@PostMapping("/personaldetalissave")
	public String saveStudentData(@ModelAttribute DashboardStudentFormData formData,
			@ModelAttribute DashboardStudentAdress dashboardStudentAddress,
			@RequestParam(value = "applicationNumber", required = false) Integer applicationNumber,

			@RequestParam("formAction") String formAction, Model model) {

		Map<String, String> response = new HashMap<>();
		String registrationnumber = generateRegistrationNumber();
		formData.setstudentid(registrationnumber);
		formData.setAdmissionWorkflowId("1");
		int application = service.save(formData);

		dashboardStudentAddress.setApplicationnumber(application);
		dashboardStudentAddress.setId(registrationnumber);

		addressservice.save(dashboardStudentAddress);

		model.addAttribute("applicationNumber", application);
		model.addAttribute("registrationnumber", registrationnumber);
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
				.getAddressByApplicationNumber(registrationNumber);
		// applicationnumber
		// applicationnumber
		model.addAttribute("districts", districtService.findDistrictAll());
		// Add fetched data to the model to pre-fill the form
		model.addAttribute("formData", formData);
		model.addAttribute("dashboardStudentAddress", dashboardStudentAddress);
		model.addAttribute("applicationNumber", applicationnumber);
		model.addAttribute("registrationNumber", registrationNumber);

		return "/admissionincharge/view_personaldetails";
	}

	@PostMapping("/viewdetalissave")
	public String viewdetalissave(
			@RequestParam(value = "applicationNumber", required = false) Integer applicationnumber,
			@RequestParam(value = "registrationnumber", required = false) String registrationNumber, Model model,
			@ModelAttribute DashboardStudentFormData formData,
			@ModelAttribute DashboardStudentAdress dashboardStudentAddress) {

		int applicationNumber1 = Integer.valueOf(applicationnumber);
		Long applicationNumber12 = Long.valueOf(applicationnumber);

		formData.setstudentid(registrationNumber);
		formData.setapplicationnumber(applicationNumber12);
		System.out.println("update request controller ");
		formData.setAdmissionWorkflowId("1");
		service.update(formData);

		dashboardStudentAddress.setApplicationnumber(applicationNumber1);
		dashboardStudentAddress.setId(registrationNumber);
		addressservice.update(dashboardStudentAddress);
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
		return "/admissionincharge/academic_details";

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

		AcademicDetailsForm formData = academicdetailsservice.getFormDataByApplicationNumber(applicationnumber);

		model.addAttribute("formData", formData);
		model.addAttribute("applicationNumber", applicationnumber);
		model.addAttribute("registrationNumber", registrationNumber);

		return "/admissionincharge/view_academic_details";
	}

	@PostMapping("/saveviewacademicdetails")
	public String saveviewacademicdetails(
			@RequestParam(value = "applicationNumber", required = false) Integer applicationnumber,
			@RequestParam(value = "registrationnumber", required = false) String registrationNumber, Model model,
			@ModelAttribute AcademicDetailsForm academicDetailsForm) {

		Long applicationNumber1 = Long.valueOf(applicationnumber);
		academicDetailsForm.setapplicationnumber(applicationNumber1);
		academicDetailsForm.setStudentid(registrationNumber);

		academicdetailsservice.update(academicDetailsForm);

		model.addAttribute("applicationNumber", applicationnumber);
		model.addAttribute("registrationNumber", registrationNumber);

		return "redirect:/viewacademicdetails?applicationNumber=" + applicationNumber1 + "&registrationnumber="
				+ registrationNumber;

	}

	@GetMapping("/admissiondetails")
	public String admissiondetails(Model model,
			@RequestParam(name = "applicationNumber", required = false) String applicationNumber,
			@RequestParam(name = "registrationnumber", required = false) String registrationnumber,
			Feepayment feepayment, Admissiondetailsform admissiondetails)

	{
		List<String> tradeOfferedby = Arrays.asList("NCVT", "SCVT");
		List<String> istraineedual = Arrays.asList("Yes", "No");
		List<String> traineetypes = Arrays.asList("Regular", "Private");
		model.addAttribute("itiname", itiservice.findAll());
		model.addAttribute("tradename", tradeservice.findAll());
		model.addAttribute("registrationnumber", registrationnumber);
		model.addAttribute("applicationNumber", applicationNumber);

		model.addAttribute("admissiondetails", admissiondetails);
		model.addAttribute("feepayment", feepayment);
		model.addAttribute("tradeOfferedby", tradeOfferedby);
		model.addAttribute("istraineedual", istraineedual);
		model.addAttribute("traineetypes", traineetypes);
		model.addAttribute("academicsession", academicsessionservice.findAll());
		model.addAttribute("districts", districtService.findDistrictAll());

		return "/admissionincharge/admission_details";
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
		return "redirect:/viewadmissiondetailsdetails?applicationNumber=" + applicationNumber1 + "&registrationnumber="
				+ registrationNumber;

	}

	@GetMapping("/viewadmissiondetailsdetails")
	public String viewadmissiondetailsdetails(
			@RequestParam(value = "applicationNumber", required = false) Integer applicationnumber,
			@RequestParam(value = "registrationnumber", required = false) String registrationNumber, Model model) {
		Admissiondetailsform formData = admissiondetailservice.getFormDataByApplicationNumber(applicationnumber);
		Feepayment feepaymentdata = feepaymentservice.getFormDataByApplicationNumber(applicationnumber);

		List<String> traineetypes = Arrays.asList("Regular", "Private");
		List<String> tradeOfferedby = Arrays.asList("NCVT", "SCVT");
		List<String> istraineedual = Arrays.asList("Yes", "No");

		model.addAttribute("traineetypes", traineetypes);
		model.addAttribute("formData", formData);
		model.addAttribute("feepaymentdata", feepaymentdata);
		model.addAttribute("applicationNumber", applicationnumber);
		model.addAttribute("registrationNumber", registrationNumber);
		model.addAttribute("itiname", itiservice.findAll());
		model.addAttribute("tradename", tradeservice.findAll());
		model.addAttribute("tradeOfferedby", tradeOfferedby);
		model.addAttribute("istraineedual", istraineedual);
		model.addAttribute("academicsession", academicsessionservice.findAll());
		model.addAttribute("districts", districtService.findDistrictAll());

		return "/admissionincharge/view_admission_details";
	}

	@PostMapping("/viewadmissiondetalissave")
	public String viewadmissiondetalissave(
			@RequestParam(value = "applicationNumber", required = false) Integer applicationnumber,
			@RequestParam(value = "registrationnumber", required = false) String registrationNumber, Model model,
			@ModelAttribute Admissiondetailsform admissiondetails, @ModelAttribute Feepayment feepayment) {

		Long applicationNumber1 = Long.valueOf(applicationnumber);
		admissiondetails.setApplicationnumber(applicationNumber1);
		feepayment.setApplicationnumber(applicationNumber1);

		admissiondetailservice.update(admissiondetails);
		feepaymentservice.update(feepayment);

		model.addAttribute("feepayment", feepayment);
		model.addAttribute("admissiondetails", admissiondetails);

		model.addAttribute("applicationNumber", applicationnumber);
		model.addAttribute("registrationNumber", registrationNumber);

		return "redirect:/viewadmissiondetailsdetails?applicationNumber=" + applicationnumber + "&registrationnumber="
				+ registrationNumber;
	}

	@GetMapping("/preview")
//	@PreAuthorize("hasRole('ADMISSION_INCHARGE')")
	public String preview(Model model,
			@RequestParam(name = "applicationNumber", required = false) Integer applicationNumber,
			@RequestParam(name = "registrationnumber", required = false) String registrationnumber) {

		// String str="BR2324PAT995007";
		DashboardStudentFormData dashboardStudentFormData = service.getFormDataByApplicationNumber(applicationNumber);
		DashboardStudentAdress dashboardStudentAddress = addressservice
				.getAddressByApplicationNumber(registrationnumber);
		AcademicDetailsForm academicDetailsForm = academicdetailsservice
				.getFormDataByApplicationNumber(applicationNumber);
		Admissiondetailsform admissiondetailsform = admissiondetailservice
				.getFormDataByApplicationNumber(applicationNumber);
		Feepayment feepaymentdata = feepaymentservice.getFormDataByApplicationNumber(applicationNumber);
		model.addAttribute("formData", admissiondetailsform);
		model.addAttribute("feepaymentdata", feepaymentdata);
		// applicationnumber
		// applicationnumber
		// Add fetched data to the model to pre-fill the form
		model.addAttribute("dashboardStudentFormData", dashboardStudentFormData);
		model.addAttribute("dashboardStudentAddress", dashboardStudentAddress);
		model.addAttribute("applicationNumber", applicationNumber);
		model.addAttribute("registrationNumber", registrationnumber);
		model.addAttribute("academicDetailsForm", academicDetailsForm);
		// System.out.println(applicationNumber);
		System.out.println(registrationnumber);
		// AcademicDetailsForm academicDetailsForm = new AcademicDetailsForm();
		model.addAttribute("firstName", "Hakim Singh");
		return "/admissionincharge/preview";

	}

	@PostMapping("/previewsave")
	// @PreAuthorize("hasRole('ADMISSION_INCHARGE')")
	public String previewsave(@RequestParam(value = "applicationNumber", required = false) Integer applicationnumber,
			@RequestParam(value = "registrationnumber", required = false) String registrationNumber,
			@RequestParam(value = "remarks", required = false) String remarks,
			@RequestParam(value = "status", required = false) Integer status) {

		service.updateAdmissionWorkflowId(applicationnumber, status);
		WorkflowRemarks workflowRemarks = new WorkflowRemarks();
		workflowRemarks.setApplicationNumber(applicationnumber);
		workflowRemarks.setRegistrationNumber(registrationNumber);
		workflowRemarks.setRemarks(remarks);
		service.saveRemarks(workflowRemarks);
		return "redirect:/admissioninchargedashboard";
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

	@GetMapping("/editpersonaldetails")
	public String editStudentData(
			@RequestParam(value = "applicationNumber", required = false) Integer applicationnumber,
			@RequestParam(value = "registrationnumber", required = false) String registrationNumber, Model model) {

		// Fetch data from the database based on applicationNumber and
		// registrationNumber
		DashboardStudentFormData formData = service.getFormDataByApplicationNumber(applicationnumber);
		DashboardStudentAdress dashboardStudentAddress = addressservice
				.getAddressByApplicationNumber(registrationNumber);
		// applicationnumber
		// applicationnumber

		model.addAttribute("districts", districtService.findDistrictAll());
		// Add fetched data to the model to pre-fill the form
		model.addAttribute("formData", formData);
		model.addAttribute("dashboardStudentAddress", dashboardStudentAddress);
		model.addAttribute("applicationNumber", applicationnumber);
		model.addAttribute("registrationNumber", registrationNumber);

		return "/admissionincharge/edit_personaldetails";
	}

	@GetMapping("/editacademicdetails")
	public String editacademicdetails(
			@RequestParam(value = "applicationNumber", required = false) Integer applicationnumber,
			@RequestParam(value = "registrationnumber", required = false) String registrationNumber, Model model,
			@ModelAttribute AcademicDetailsForm academicDetailsForm) {

		AcademicDetailsForm formData = academicdetailsservice.getFormDataByApplicationNumber(applicationnumber);

		model.addAttribute("formData", formData);
		model.addAttribute("applicationNumber", applicationnumber);
		model.addAttribute("registrationNumber", registrationNumber);

		return "/admissionincharge/edit_academic_details";
	}

	@GetMapping("/editadmissiondetails")
	public String editadmissiondetails(
			@RequestParam(value = "applicationNumber", required = false) Integer applicationnumber,
			@RequestParam(value = "registrationnumber", required = false) String registrationNumber, Model model) {
		Admissiondetailsform formData = admissiondetailservice.getFormDataByApplicationNumber(applicationnumber);
		Feepayment feepaymentdata = feepaymentservice.getFormDataByApplicationNumber(applicationnumber);

		List<String> traineetypes = Arrays.asList("Regular", "Private");
		List<String> tradeOfferedby = Arrays.asList("NCVT", "SCVT");
		List<String> istraineedual = Arrays.asList("Yes", "No");

		model.addAttribute("traineetypes", traineetypes);
		model.addAttribute("formData", formData);
		model.addAttribute("feepaymentdata", feepaymentdata);
		model.addAttribute("applicationNumber", applicationnumber);
		model.addAttribute("registrationNumber", registrationNumber);
		model.addAttribute("itiname", itiservice.findAll());
		model.addAttribute("tradename", tradeservice.findAll());
		model.addAttribute("tradeOfferedby", tradeOfferedby);
		model.addAttribute("istraineedual", istraineedual);
		model.addAttribute("academicsession", academicsessionservice.findAll());
		model.addAttribute("districts", districtService.findDistrictAll());

		return "/admissionincharge/edit_admission_details";
	}

	@GetMapping("/editupload")
//	@PreAuthorize("hasRole('ADMISSION_INCHARGE')")
	public String editupload(Model model,
			@RequestParam(value = "applicationNumber", required = false) Integer applicationNumber,
			@RequestParam(name = "registrationnumber", required = false) String registrationNumber) {

		DashboardStudentFormData dashboardstudentformdata = new DashboardStudentFormData();
		DashboardStudentAdress dashboardstudentaddress = new DashboardStudentAdress();

		model.addAttribute("districts", districtService.findDistrictAll());

		model.addAttribute("applicationNumber", applicationNumber);
		model.addAttribute("registrationnumber", registrationNumber);

		model.addAttribute("dashboardstudentformdata", dashboardstudentformdata);
		model.addAttribute("dashboardstudentaddress", dashboardstudentaddress);

		return "/admissionincharge/edit_upload";
	}

}
