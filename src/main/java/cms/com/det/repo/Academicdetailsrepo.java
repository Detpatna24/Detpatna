package cms.com.det.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cms.com.det.dto.AcademicDetailsForm;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class Academicdetailsrepo {

	@PersistenceContext
	private EntityManager entityManager;

	public void save(AcademicDetailsForm academicdetailsorm) {
		entityManager.persist(academicdetailsorm);
		entityManager.flush();
		
	}

	public AcademicDetailsForm getFormDataByApplicationNumber(Integer applicationnumber) {
		return entityManager.find(AcademicDetailsForm.class, applicationnumber);
	}

}
