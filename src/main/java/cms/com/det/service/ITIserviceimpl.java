package cms.com.det.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cms.com.det.dto.ITIdto;
import cms.com.det.repo.ITIrepo;
import cms.com.det.repo.Traderepo;
@Service
public class ITIserviceimpl implements ITIservice{

	@Autowired
	ITIrepo repo;
	
	@Override
	public List<ITIdto> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<String> findByITIName(String ITI)
	{
		return repo.findByITIName(ITI);
		
	}
	
}
