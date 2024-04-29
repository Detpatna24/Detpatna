package cms.com.det.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cms.com.det.dto.Admissiondetailsform;
import cms.com.det.repo.Admissiondetailsrepo;

@Service
public class Admissiondetailserviceimpl implements Admissiondetailservice{

	@Autowired
	Admissiondetailsrepo repo;
	
	@Override
	public Admissiondetailsform save(Admissiondetailsform admissiondetailsform) {
		// TODO Auto-generated method stub
		return repo.save(admissiondetailsform);
	}
	

}
