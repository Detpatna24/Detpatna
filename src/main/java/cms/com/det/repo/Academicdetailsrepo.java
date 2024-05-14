package cms.com.det.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cms.com.det.dto.AcademicDetailsForm;
import cms.com.det.dto.DashboardStudentFormData;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
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

	public void update(AcademicDetailsForm academicdetailsorm) {
		AcademicDetailsForm managedEntity = entityManager.find(AcademicDetailsForm.class,
				academicdetailsorm.getapplicationnumber());
		if (managedEntity == null) {
			entityManager.persist(academicdetailsorm);
		} else {
			entityManager.merge(academicdetailsorm);
		}
		entityManager.flush();
	}

}
