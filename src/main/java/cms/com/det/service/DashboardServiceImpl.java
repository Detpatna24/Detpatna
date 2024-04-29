package cms.com.det.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cms.com.det.dto.DashboardStudentFormData;
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
	

}
