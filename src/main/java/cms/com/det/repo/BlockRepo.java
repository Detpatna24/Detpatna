package cms.com.det.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cms.com.det.model.Block;

@Repository
public interface BlockRepo extends JpaRepository<Block, Integer>{

	
 
    @Query("SELECT b FROM Block b WHERE b.disttName = :disttName")
    List<Block> findByDistt_name(@Param("disttName") String disttName);

}
