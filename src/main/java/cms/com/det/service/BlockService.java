package cms.com.det.service;

import java.util.List;

import org.springframework.stereotype.Component;

import cms.com.det.model.Block;

@Component
public interface BlockService {

	public List<Block> findBlockAll();

	 List<Block> findByDistt_name(String distt_name);
	 }
