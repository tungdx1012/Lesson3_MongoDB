package org.example.controller;

import org.example.dto.student.StudentRequest;
import org.example.dto.student.StudentResponse;
import org.example.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
	StudentService studentService;

	//Create new Student
	@PostMapping(value = "/student", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StudentResponse> createStudent(@RequestBody StudentRequest request) {
		return ResponseEntity.ok(studentService.createStudent(request));
	}
}
