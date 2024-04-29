package cms.com.det.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import cms.com.det.dto.DashboardStudentAdress;

public interface StudentAdressrepo extends JpaRepository<DashboardStudentAdress, Long> {

	DashboardStudentAdress save(DashboardStudentAdress dashboardstudentadress);

    @Query("SELECT a FROM DashboardStudentAdress a WHERE a.applicationnumber = :applicationNumber AND a.id = :id")
    DashboardStudentAdress getByApplicationNumberAndId(@Param("applicationNumber") int applicationNumber, @Param("id") String id);

    
    
    @Query("SELECT s FROM DashboardStudentAdress s WHERE s.applicationnumber = :applicationnumber")
    
    DashboardStudentAdress getAddressByApplicationNumber(Integer applicationnumber);
	
	
	
}
