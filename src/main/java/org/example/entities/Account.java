package org.example.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Document(collection = "account")
public class Account implements Serializable {
	@Id
	private String id;
	@Field(name = "username")
	private String username;
	@Field(name = "password")
	private String password;
	@Field(name = "status")
	private Integer status;
}
