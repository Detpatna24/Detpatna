package cms.com.det.service;

import java.util.List;

import cms.com.det.dto.ITIdto;

public interface ITIservice {

	public List<ITIdto> findAll();
 
	
	public List<String> findByITIName(String ITI);
}
