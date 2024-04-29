package cms.com.det.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cms.com.det.dto.Admissiondetailsform;

@Repository
public interface Admissiondetailsrepo  extends JpaRepository<Admissiondetailsform, Long>{

	Admissiondetailsform save(Admissiondetailsform admissiondetailsform);
	
}
