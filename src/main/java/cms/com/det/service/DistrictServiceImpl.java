package cms.com.det.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cms.com.det.model.District;
import cms.com.det.repo.DistrictRepo;
@Service
public class DistrictServiceImpl implements DistrictService {
	
	@Autowired
	DistrictRepo districtRepo;
	
	public List<District> findDistrictAll() {
		// TODO Auto-generated method stub
		return districtRepo.findAll();
	}

}
