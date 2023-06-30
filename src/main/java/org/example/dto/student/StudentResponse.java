package org.example.dto.student;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.entities.Account;
import org.example.entities.Student;
import org.springframework.beans.BeanUtils;

import java.util.Date;

@Data
@NoArgsConstructor
public class StudentResponse {
	private String id;
	private String name;
	private Date dob;
	private Integer mark;
	private Account account;

	public StudentResponse(Student student) {

	}
}
