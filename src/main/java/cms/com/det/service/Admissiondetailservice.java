package cms.com.det.service;

import org.springframework.stereotype.Component;

import cms.com.det.dto.Admissiondetailsform;

@Component
public interface Admissiondetailservice {

	public void save(Admissiondetailsform admissiondetailsform);
	void update(Admissiondetailsform admissiondetailsform);
	Admissiondetailsform getFormDataByApplicationNumber(Integer applicationnumber);
}
