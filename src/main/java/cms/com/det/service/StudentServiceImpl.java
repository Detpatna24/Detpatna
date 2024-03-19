package cms.com.det.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cms.com.det.dto.Student;
import cms.com.det.repo.StudentRepo;

@Service
public class StudentServiceImpl  implements StudentService{

	@Autowired
	StudentRepo repo;
	
	@Override
	public Student registerUser(Student student) {
		// TODO Auto-generated method stub
		return repo.save(student);
	}

	@Override
	public Student LoginUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
