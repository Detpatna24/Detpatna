package cms.com.det.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cms.com.det.dto.Feepayment;

@Repository
public interface Feepaymentrepo extends JpaRepository<Feepayment, Integer>{

	
	Feepayment save(Feepayment feepayment);
}
