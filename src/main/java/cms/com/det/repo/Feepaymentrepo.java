package cms.com.det.repo;

import org.springframework.stereotype.Repository;

import cms.com.det.dto.Feepayment;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class Feepaymentrepo {

	@PersistenceContext
	private EntityManager entityManager;

	public void save(Feepayment feepayment) {
		entityManager.persist(feepayment);
		entityManager.flush();

	}

	public Feepayment getFormDataByApplicationNumber(Integer applicationnumber) {
		return entityManager.find(Feepayment.class, applicationnumber);

	}

	public void update(Feepayment feepayment) {
		Feepayment managedEntity = entityManager.find(Feepayment.class, feepayment.getApplicationnumber());
		if (managedEntity == null) {
			entityManager.persist(feepayment);
		} else {
			entityManager.merge(feepayment);
		}
		entityManager.flush();
	}

}
