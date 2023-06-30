package org.example.service.student;

import org.example.dto.student.StudentRequest;
import org.example.dto.student.StudentResponse;

public interface StudentService {
	public StudentResponse createStudent(StudentRequest request);
}
