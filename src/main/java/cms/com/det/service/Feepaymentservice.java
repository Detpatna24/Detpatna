package cms.com.det.service;

import org.springframework.stereotype.Component;

import cms.com.det.dto.AcademicDetailsForm;
import cms.com.det.dto.Admissiondetailsform;
import cms.com.det.dto.Feepayment;

@Component
public interface Feepaymentservice {

	public void save(Feepayment feepayment);

	Feepayment getFormDataByApplicationNumber(Integer applicationnumber);

	
	void update(Feepayment feepayment);

}
