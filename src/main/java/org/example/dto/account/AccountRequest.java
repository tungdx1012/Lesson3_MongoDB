package org.example.dto.account;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AccountRequest {
	private String id;
	private String username;
	private String password;
	private Integer status;
}
