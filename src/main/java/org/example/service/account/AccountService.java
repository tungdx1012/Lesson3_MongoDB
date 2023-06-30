package org.example.service.account;

import org.example.dto.account.AccountRequest;
import org.example.dto.account.AccountResponse;

public interface AccountService {
	AccountResponse createAccount(AccountRequest request);
}
