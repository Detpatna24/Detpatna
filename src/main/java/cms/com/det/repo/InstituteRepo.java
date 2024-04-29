package cms.com.det.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cms.com.det.model.InstituteComissionary;

@Repository
public interface InstituteRepo extends JpaRepository<InstituteComissionary,Integer> {
	
	
}
