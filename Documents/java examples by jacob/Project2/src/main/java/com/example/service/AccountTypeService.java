package com.example.service;

import java.util.List;

import com.example.model.AccountType;
import com.example.model.ClientUser;
import com.example.repository.AccountTypeRepository;
import com.example.repository.ClientUserRepository;

public class AccountTypeService {
private AccountTypeRepository AccountTypeRepository;
	
	public AccountType getClientByUsername(String typename) {	
		return AccountTypeRepository.findByTypeName(typename);
	}
	
	public List<AccountType> getAllAccountType(){
		return AccountTypeRepository.findAll();
	}
	
	public void insertAccountType(AccountType user) {
		AccountTypeRepository.save(user);
	}

	
	public void deleteClient(AccountType user) {
		AccountTypeRepository.delete(user);
	}
}
