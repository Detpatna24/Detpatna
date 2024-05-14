package cms.com.det.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cms.com.det.dto.ITIdto;
import cms.com.det.model.Block;
@Repository
public interface ITIrepo extends JpaRepository<ITIdto,Integer>{

	
		@Query("SELECT b.MIS FROM ITIdto b WHERE b.ITI = :ITI")
		public List<String> findByITIName(@Param("ITI") String ITI);
	
	
	
}
