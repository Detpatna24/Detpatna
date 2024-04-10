package cms.com.det.service;

import java.util.List;

import cms.com.det.dto.Student;

public interface StudentService {

	Student registerUser(Student student);

	Student LoginUser();

	 List<Student>findbyid();
	 
}
