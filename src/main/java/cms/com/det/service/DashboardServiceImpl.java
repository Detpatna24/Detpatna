package cms.com.det.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cms.com.det.dto.DashboardStudentFormData;
import cms.com.det.dto.WorkflowRemarks;
import cms.com.det.dto.Student;
import cms.com.det.repo.Dashboardrepo;

@Service
public class DashboardServiceImpl  implements DashboardService{

	@Autowired
	Dashboardrepo repo;
	@Override
	public int save(DashboardStudentFormData dashboardstudentformdata) {
		// TODO Auto-generated method stub
		return repo.saveAndFlush(dashboardstudentformdata);
	}
	@Override
	public DashboardStudentFormData getFormDataByApplicationNumber(Integer applicationnumber) {
		// TODO Auto-generated method stub
		return repo.getFormDataByApplicationNumber(applicationnumber);
	}
	@Override
	public void update(DashboardStudentFormData formData) {
		repo.update(formData);
		
	}
	
	@Override
	public void updateAdmissionWorkflowId(Integer applicationnumber, Integer status)
	{
		repo.updateAdmissionWorkflowId(applicationnumber,status);
	}
	

	@Override
	public int saveRemarks(WorkflowRemarks workflowRemarks)
	{
		return repo.saveRemarks(workflowRemarks);
	}
	@Override
	public  List<Map<String, Object>> findbyid() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	@Override
	public void updateWorkflowStatusbyprincipal(String[] checkboxIds, String AdmissionWorkflowId,String remarks) {
		repo.updateWorkflowStatusbyprincipal(checkboxIds, AdmissionWorkflowId,remarks);
		
	}
	
	
	/*
	 * @Override public List<Map<String, Object>> admissionInChargeStudentsList() {
	 * return repo.admissionInChargeStudentsList(); }
	 */
}
