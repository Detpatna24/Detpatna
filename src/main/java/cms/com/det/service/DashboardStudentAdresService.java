package cms.com.det.service;

import org.springframework.stereotype.Component;

import cms.com.det.dto.DashboardStudentAdress;

@Component
public interface DashboardStudentAdresService {
	DashboardStudentAdress save(DashboardStudentAdress dashboardstudentaddress);
	DashboardStudentAdress getAddressByApplicationNumber(Integer applicationnumber);

	
	
}
