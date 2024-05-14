package cms.com.det.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cms.com.det.dto.DashboardStudentAdress;
import cms.com.det.dto.DashboardStudentFormData;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class StudentAdressrepo {

	@PersistenceContext
	private EntityManager entityManager;

	public void save(DashboardStudentAdress dashboardstudentAdress) {
		entityManager.persist(dashboardstudentAdress);
		entityManager.flush();
	}

	public DashboardStudentAdress getFormDataByApplicationNumber(String registrationNumber) {
		// TODO Auto-generated method stub
		return entityManager.find(DashboardStudentAdress.class, registrationNumber);

	}

	public void update(DashboardStudentAdress dashboardstudentAdress) {
		DashboardStudentAdress managedEntity = entityManager.find(DashboardStudentAdress.class,dashboardstudentAdress.getId());
		if (managedEntity == null) {
			entityManager.persist(dashboardstudentAdress);
		} else {
			entityManager.merge(dashboardstudentAdress);
		}
		entityManager.flush(); // Flush the changes to the database
	}
}
