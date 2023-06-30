package org.example.service.account;

import org.example.dto.account.AccountRequest;
import org.example.dto.account.AccountResponse;
import org.example.entities.Account;
import org.example.repository.account.AccountRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	AccountRepository accountRepo;

	@Override
	public AccountResponse createAccount(AccountRequest request) {
		Account account = new Account();
		BeanUtils.copyProperties(request, account);
		accountRepo.save(account);
		return new AccountResponse(account);
	}
}
