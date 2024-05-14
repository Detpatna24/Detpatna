package cms.com.det.service;

import org.springframework.stereotype.Component;

import cms.com.det.dto.DashboardStudentAdress;
import cms.com.det.dto.DashboardStudentFormData;

@Component
public interface DashboardStudentAdresService {
	void save(DashboardStudentAdress dashboardstudentaddress);
	DashboardStudentAdress getAddressByApplicationNumber(String registrationNumber);
	void update(DashboardStudentAdress dashboardstudentaddress);
	
	
}
