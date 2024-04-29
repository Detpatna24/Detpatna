package cms.com.det.repo;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cms.com.det.dto.DashboardStudentFormData;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository
@Transactional

public class Dashboardrepo 
{
	@PersistenceContext
    private EntityManager entityManager;

    public int saveAndFlush(DashboardStudentFormData dashboardstudentformdata) {
        entityManager.persist(dashboardstudentformdata);
        entityManager.flush(); // Flush the changes to the database
        return dashboardstudentformdata.getapplicationnumber().intValue(); 
    }

	public DashboardStudentFormData getFormDataByApplicationNumber(Integer applicationnumber) {
		// TODO Auto-generated method stub
        return entityManager.find(DashboardStudentFormData.class, applicationnumber);
	}

	
	
	public void update(DashboardStudentFormData dashboardstudentformdata)
	{
        DashboardStudentFormData managedEntity = entityManager.find(DashboardStudentFormData.class, dashboardstudentformdata.getapplicationnumber());
        if (managedEntity == null) {
            entityManager.persist(dashboardstudentformdata);
        } else {
            entityManager.merge(dashboardstudentformdata);
        }
        entityManager.flush(); // Flush the changes to the database
    }

	}
	
	
	
	
	
	
	
	


