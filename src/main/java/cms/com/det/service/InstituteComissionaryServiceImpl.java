package cms.com.det.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cms.com.det.model.InstituteComissionary;
import cms.com.det.repo.InstituteRepo;
@Service
public class InstituteComissionaryServiceImpl implements InstituteComissionaryService{
	
	
	@Autowired
	InstituteRepo instituteRepo;
	
	public List<InstituteComissionary> findComissionaryAll() {
		// TODO Auto-generated method stub
		return instituteRepo.findAll();
	}
}
