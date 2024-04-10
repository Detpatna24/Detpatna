package cms.com.det.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cms.com.det.dto.DashboardStudentFormData;

public interface Dashboardrepo extends JpaRepository<DashboardStudentFormData, Long> {

}
