package org.example.dto.account;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.entities.Account;
import org.springframework.beans.BeanUtils;

@Data
@NoArgsConstructor
public class AccountResponse {
	private String id;
	private String username;
	private String password;
	private Integer status;

	public AccountResponse(Account account) {
		BeanUtils.copyProperties(account, this);
	}
}
