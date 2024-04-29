package cms.com.det.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cms.com.det.model.Block;
import cms.com.det.repo.BlockRepo;

@Service
public class BlockServiceImpl implements BlockService{
	
	@Autowired
	BlockRepo blockRepo;
	
	public List<Block> findBlockAll() {
		// TODO Auto-generated method stub
		return blockRepo.findAll();
	}

	@Override
    public List<Block> findByDistt_name(String districtName) {
        return blockRepo.findByDistt_name(districtName);
    }

}
