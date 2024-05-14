package cms.com.det.repo;

import org.springframework.stereotype.Repository;

import cms.com.det.dto.Admissiondetailsform;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class Admissiondetailsrepo {

	@PersistenceContext
	private EntityManager entityManager;

	public void save(Admissiondetailsform admissiondetailsform) {
		entityManager.persist(admissiondetailsform);
		entityManager.flush();

	}

	public Admissiondetailsform getFormDataByApplicationNumber(Integer applicationnumber) {
		return entityManager.find(Admissiondetailsform.class, applicationnumber);
	}

	public void update(Admissiondetailsform admissiondetailsform) {
		Admissiondetailsform managedEntity = entityManager.find(Admissiondetailsform.class,
				admissiondetailsform.getApplicationnumber());
		if (managedEntity == null) {
			entityManager.persist(admissiondetailsform);
		} else {
			entityManager.merge(admissiondetailsform);
		}
		entityManager.flush();
	}

}
