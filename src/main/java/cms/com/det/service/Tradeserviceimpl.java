 package cms.com.det.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cms.com.det.dto.Trade;
import cms.com.det.repo.Traderepo;

@Service
public class Tradeserviceimpl implements Tradeservice{

	@Autowired
	Traderepo repo;
	
	@Override
	public List<Trade> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
