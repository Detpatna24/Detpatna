package cms.com.det.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cms.com.det.dto.Academicsession;
import cms.com.det.repo.Academicsessionrepo;

@Service
public class Academicsessionserviceimpl implements Academicsessionservice{

	@Autowired
	Academicsessionrepo repo;
	
	@Override
	public List<Academicsession> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
