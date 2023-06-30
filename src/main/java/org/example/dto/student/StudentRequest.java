package org.example.dto.student;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.entities.Account;

import java.util.Date;

@Data
@NoArgsConstructor
public class StudentRequest {
	private String id;
	private String name;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dob;
	private Integer mark;
	private Account account;
}
