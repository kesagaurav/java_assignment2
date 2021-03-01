package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Account;
import com.example.repository.AccountRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor(onConstructor=@__(@Autowired))
@NoArgsConstructor 
public class AccountService {
private AccountRepository accountRepository;
	
	public Account getAccountByAccountNumber(String accountNumber) {	
		return accountRepository.findByAccountNumber(accountNumber);
	}
	
	// return type??
//	public ClientUser getAccountsByUsername(String username){
//		return accountRepository.findByUsername(username);
//	}
//	
	public void insertAccount(Account acc) {
		accountRepository.save(acc);
	}

}
