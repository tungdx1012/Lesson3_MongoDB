package org.example.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@Document(collection = "student")
public class Student implements Serializable {
	@Id
	private String id;
	@Field(name = "name")
	private String name;
	@Field(name = "dob")
	private Date dob;
	@Field(name = "mark")
	private Integer mark;
	@Field(name = "account_id")
	private String accountId;
}
