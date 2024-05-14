package cms.com.det.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cms.com.det.dto.DashboardStudentFormData;
import cms.com.det.dto.WorkflowRemarks;
import cms.com.det.service.Academicsessionservice;
import cms.com.det.service.DashboardService;
import cms.com.det.service.Tradeservice;

@Controller
public class PrincipalDashBoardController {

	@Autowired
	DashboardService service;

	/*
	 * @Autowired ModelAndView modelAndView;
	 */
	@Autowired
	Tradeservice tradeservice;

	@Autowired
	Academicsessionservice academicsessionservice;

	@GetMapping("/principaladmissiondetail")
	public ModelAndView viewadmission(Model model) {
		ModelAndView modelAndView = new ModelAndView("/principal/principaladmissiondetail");
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

	@PostMapping("/principaladmissiondetailsubmit")
	public String handleAction(@RequestParam(value = "checkboxid[]", required = false) String[] checkboxid,
			@RequestParam(value = "registrationid[]", required = false) String[] registrationid,
			@RequestParam(value = "sendSelectedValues", required = false) String sendSelectedValues,
			@RequestParam(value = "remarks", required = false) String remarks)

	{
		DashboardStudentFormData data = new DashboardStudentFormData();
		WorkflowRemarks work = new WorkflowRemarks();
		if (sendSelectedValues.equals("FORWARD_TO_NODAL_OFFICER_BY_PRICIPAL")) {
			System.out.println("inside forward_nodal_officer");
			data.setAdmissionWorkflowId("6");

		} else if (sendSelectedValues.equals("sendback_admission_incharge")) {
			data.setAdmissionWorkflowId("4");

		} else if (sendSelectedValues.equals("reject")) {

			data.setAdmissionWorkflowId("11");

		}

		service.updateWorkflowStatusbyprincipal(checkboxid, data.getAdmissionWorkflowId(), remarks);

		return "redirect:/principaladmissiondetail";
	}

}
