package cms.com.det.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cms.com.det.dto.Student;

public interface StudentRepo  extends JpaRepository<Student, Long>{

}
