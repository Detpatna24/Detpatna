package cms.com.det.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cms.com.det.dto.Trade;

@Repository
public interface Traderepo extends JpaRepository<Trade,Integer>{

}
