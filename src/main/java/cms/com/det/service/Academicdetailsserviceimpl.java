package cms.com.det.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cms.com.det.dto.AcademicDetailsForm;
import cms.com.det.repo.Academicdetailsrepo;

@Service
public class Academicdetailsserviceimpl implements Academicdetailsservice{

	@Autowired
	Academicdetailsrepo repo;
	
	@Override
	public void save(AcademicDetailsForm academicdetailsorm) {
		System.out.println("inside Academicdetailsserviceimpl");
		 repo.save(academicdetailsorm);
	}

	@Override
	public AcademicDetailsForm getFormDataByApplicationNumber(Integer applicationnumber) {
		// TODO Auto-generated method stub
		return repo.getFormDataByApplicationNumber(applicationnumber);
	}

	

}
