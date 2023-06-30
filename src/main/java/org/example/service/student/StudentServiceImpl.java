package org.example.service.student;

import org.example.dto.student.StudentRequest;
import org.example.dto.student.StudentResponse;
import org.example.entities.Student;
import org.example.repository.student.StudentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepository studentRepo;

	@Override
	public StudentResponse createStudent(StudentRequest request) {
		Student student = new Student();
		BeanUtils.copyProperties(request, student);
		studentRepo.save(student);
		return new StudentResponse(student);
	}
}
