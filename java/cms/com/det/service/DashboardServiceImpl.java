package cms.com.det.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cms.com.det.dto.DashboardStudentFormData;
import cms.com.det.dto.InstituteDashboard;
import cms.com.det.repo.Dashboardrepo;

@Service
public class DashboardServiceImpl  implements DashboardService{

	@Autowired
	Dashboardrepo repo;
	
	

	@Override
	public DashboardStudentFormData register(DashboardStudentFormData dashboardstudentformdata) {
		// TODO Auto-generated method stub
		return repo.save(dashboardstudentformdata);
	}

	
	
	
	
}
