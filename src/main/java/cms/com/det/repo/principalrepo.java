package cms.com.det.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cms.com.det.dto.DashboardStudentFormData;
@Repository
public interface principalrepo extends JpaRepository<DashboardStudentFormData, Long>{

}
