package cms.com.det.service;

import org.springframework.stereotype.Component;

import cms.com.det.dto.Admissiondetailsform;

@Component
public interface Admissiondetailservice {

	Admissiondetailsform save(Admissiondetailsform admissiondetailsform);
}
