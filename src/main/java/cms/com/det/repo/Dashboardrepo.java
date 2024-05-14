package cms.com.det.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import cms.com.det.dto.DashboardStudentFormData;
import cms.com.det.dto.WorkflowRemarks;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional

public class Dashboardrepo {
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

	public void update(DashboardStudentFormData dashboardstudentformdata) {
		DashboardStudentFormData managedEntity = entityManager.find(DashboardStudentFormData.class,
				dashboardstudentformdata.getapplicationnumber());
		if (managedEntity == null) {
			entityManager.persist(dashboardstudentformdata);
		} else {
			entityManager.merge(dashboardstudentformdata);
		}
		entityManager.flush();
	}

	public void updateAdmissionWorkflowId(Integer applicationnumber, Integer status) {
		int updatedRows = entityManager.createQuery(
				"UPDATE DashboardStudentFormData p SET p.admissionWorkflowId = :status WHERE p.applicationnumber = :applicationnumber")
				.setParameter("applicationnumber", applicationnumber).setParameter("status", status).executeUpdate();

		System.out.println("Updated " + updatedRows + " rows.");
	}

	public List<Map<String, Object>> findAll() {
        List<Map<String, Object>> resultList = new ArrayList<>();

        List<Object[]> rows = entityManager.createQuery(
            "SELECT d.studentid, "
            + "d.studentName, "
            + "d.fatherName, "
            + "d.dateOfBirth, "
            + "a.tradeOfferedby, "
            + "a.tradename, "
            + "d.createdDate, "
            + "f.Total, "
            + "d.applicationnumber, "
            + "d.admissionWorkflowId, "
            + "g.workflowdescription "
            + "FROM Admissiondetailsform a "
            + "INNER JOIN DashboardStudentFormData d ON a.studentid = d.studentid "
            + "INNER JOIN Feepayment f ON f.studentid = d.studentid "
            + "INNER JOIN Admissionworkflow g ON g.admissionworkflowid = d.admissionWorkflowId"
        ).getResultList();

        for (Object[] row : rows) {
            Map<String, Object> rowMap = new HashMap<>();
            rowMap.put("studentid", row[0]);
            rowMap.put("studentName", row[1]);
            rowMap.put("fatherName", row[2]);
            rowMap.put("dateOfBirth", row[3]);
            rowMap.put("tradeOfferedby", row[4]);
            rowMap.put("tradename", row[5]);
            rowMap.put("createdDate", row[6]);
            rowMap.put("Total", row[7]);
            rowMap.put("applicationnumber", row[8]);
            rowMap.put("admissionWorkflowId", row[9]);
            rowMap.put("workflowdescription", row[10]);

            resultList.add(rowMap);
        }

        return resultList;
    }



	public int saveRemarks(WorkflowRemarks workflowRemarks) {
		entityManager.persist(workflowRemarks);
		entityManager.flush(); // Flush the changes to the database
		return workflowRemarks.getApplicationNumber();
	}

	public void updateWorkflowStatusbyprincipal(String[] checkboxIds, String AdmissionWorkflowId, String remarks) {

		for (String checkboxId : checkboxIds) {
			System.out.println(checkboxId);
			WorkflowRemarks workflowremarks = new WorkflowRemarks();
			workflowremarks.setRegistrationNumber(checkboxId);
			workflowremarks.setRemarks(remarks);
			int applicaitionnumber = getapplicationnumber(checkboxId);

			workflowremarks.setApplicationNumber(applicaitionnumber);

			int updatedRows = entityManager.createQuery(
					"UPDATE DashboardStudentFormData p SET p.admissionWorkflowId = :status WHERE p.studentid = :checkboxId")
					.setParameter("checkboxId", checkboxId).setParameter("status", AdmissionWorkflowId).executeUpdate();

			System.out.println("-----WOKRFLOW STATUS UPDATED BY PRINCIPAL-----" + updatedRows);

			int remarkssave = saveRemarks(workflowremarks);

			System.out.println("-----REMARKS UPDATED BY PRINCIPAL-----" + remarkssave);

		}

	}

	public int getapplicationnumber(String registrationnumber) {

		Query query = entityManager.createQuery(
				"SELECT p.applicationnumber FROM DashboardStudentFormData p WHERE p.studentid = :registrationnumber");
		query.setParameter("registrationnumber", registrationnumber);
		Long applicationNumber = (Long) query.getSingleResult();

		int application = applicationNumber.intValue();
		return application;
	}

	
	
	
	
	/*
	 * public List<Map<String, Object>> admissionInChargeStudentsList() {
	 * List<Map<String, Object>> resultList = new ArrayList<>();
	 * 
	 * List<Object[]> rows = entityManager.createQuery( "SELECT d.studentid, " +
	 * "d.studentName, " + "d.fatherName, " + "d.dateOfBirth, " +
	 * "a.tradeOfferedby, " + "a.tradename, " + "d.createdDate, " + "f.Total, " +
	 * "d.applicationnumber, " + "d.admissionWorkflowId, " +
	 * "g.workflowdescription " + "FROM Admissiondetailsform a " +
	 * "INNER JOIN DashboardStudentFormData d ON a.studentid = d.studentid " +
	 * "INNER JOIN Feepayment f ON f.studentid = d.studentid " +
	 * "INNER JOIN Admissionworkflow g ON g.admissionworkflowid = d.admissionWorkflowId "
	 * + "WHERE d.admissionWorkflowId IN ('1', '4')" ) .getResultList();
	 * 
	 * for (Object[] row : rows) { Map<String, Object> rowMap = new HashMap<>();
	 * rowMap.put("studentid", row[0]); rowMap.put("studentName", row[1]);
	 * rowMap.put("fatherName", row[2]); rowMap.put("dateOfBirth", row[3]);
	 * rowMap.put("tradeOfferedby", row[4]); rowMap.put("tradename", row[5]);
	 * rowMap.put("createdDate", row[6]); rowMap.put("Total", row[7]);
	 * rowMap.put("applicationnumber", row[8]); rowMap.put("admissionWorkflowId",
	 * row[9]); rowMap.put("workflowdescription", row[10]);
	 * 
	 * resultList.add(rowMap); }
	 * 
	 * return resultList; }
	 */

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
