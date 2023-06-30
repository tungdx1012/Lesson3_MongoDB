package org.example.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@Document(collection = "class")
public class Class implements Serializable {
	@Id
	private String id;
	@Field(name = "name")
	private String name;
	@Field(name = "studentIds")
	private List<String> studentIds;
}
