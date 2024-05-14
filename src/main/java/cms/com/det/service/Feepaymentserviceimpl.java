package cms.com.det.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cms.com.det.dto.Admissiondetailsform;
import cms.com.det.dto.Feepayment;
import cms.com.det.repo.Feepaymentrepo;

@Service
public class Feepaymentserviceimpl implements Feepaymentservice {

	@Autowired
	Feepaymentrepo repo;

	@Override
	public void save(Feepayment feepayment) {
		repo.save(feepayment);
	}

	@Override
	public void update(Feepayment feepayment) {
		repo.update(feepayment);

	}

	@Override
	public Feepayment getFormDataByApplicationNumber(Integer applicationnumber) {

		return repo.getFormDataByApplicationNumber(applicationnumber);
	}

}
