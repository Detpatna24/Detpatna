package cms.com.det.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import cms.com.det.dto.DashboardStudentFormData;
import cms.com.det.dto.WorkflowRemarks;

@Component
public interface DashboardService {

	
	int save(DashboardStudentFormData dashboardstudentformdata);

	DashboardStudentFormData getFormDataByApplicationNumber(Integer applicationNumber);

	void update(DashboardStudentFormData formData);

	void updateAdmissionWorkflowId(Integer applicationnumber, Integer status);

	 List<Map<String, Object>>findbyid();
	// List<Map<String, Object>> admissionInChargeStudentsList();
	
	int saveRemarks(WorkflowRemarks workflowRemarks);
	
	void updateWorkflowStatusbyprincipal(String[] checkboxIds, String AdmissionWorkflowId,String remarks);
	
	
}
