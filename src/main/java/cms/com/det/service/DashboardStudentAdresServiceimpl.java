package cms.com.det.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cms.com.det.dto.DashboardStudentAdress;
import cms.com.det.dto.DashboardStudentFormData;
import cms.com.det.repo.StudentAdressrepo;


@Service
public class DashboardStudentAdresServiceimpl implements DashboardStudentAdresService{

	@Autowired
	StudentAdressrepo repo;

	
	
	 


	
	@Override
	public void save(DashboardStudentAdress dashboardstudentaddress) {
		// TODO Auto-generated method stub
		 repo.save(dashboardstudentaddress);
	}

	
	


	@Override
	public DashboardStudentAdress getAddressByApplicationNumber(String registrationNumber) {
		// TODO Auto-generated method stub
		return repo.getFormDataByApplicationNumber(registrationNumber);
	}





	@Override
	public void update(DashboardStudentAdress formData) {
		repo.update(formData);
		
	}
	

}
