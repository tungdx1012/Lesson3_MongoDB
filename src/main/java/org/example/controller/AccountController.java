package org.example.controller;

import org.example.dto.account.AccountRequest;
import org.example.dto.account.AccountResponse;
import org.example.service.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AccountController {
	@Autowired
	AccountService accountService;

	@PostMapping(value = "/account", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public AccountResponse createAccount(@RequestBody AccountRequest request) {
		return accountService.createAccount(request);
	}
}
