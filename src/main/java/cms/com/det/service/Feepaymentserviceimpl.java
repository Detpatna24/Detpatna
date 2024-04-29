package cms.com.det.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cms.com.det.dto.Feepayment;
import cms.com.det.repo.Feepaymentrepo;

@Service
public class Feepaymentserviceimpl implements Feepaymentservice{

	
	@Autowired
	Feepaymentrepo repo;
	
	@Override
	public Feepayment save(Feepayment feepayment) {
		// TODO Auto-generated method stub
		return repo.save(feepayment);
	}

}
