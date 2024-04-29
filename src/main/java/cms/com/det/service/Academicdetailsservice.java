package cms.com.det.service;

import org.springframework.stereotype.Component;

import cms.com.det.dto.AcademicDetailsForm;

@Component
public interface Academicdetailsservice {
	public void save(AcademicDetailsForm academicdetailsform);

	AcademicDetailsForm getFormDataByApplicationNumber(Integer applicationnumber);
	
	//AcademicDetailsForm getFormDataByApplicationNumber(Integer applicationnumber);
}
