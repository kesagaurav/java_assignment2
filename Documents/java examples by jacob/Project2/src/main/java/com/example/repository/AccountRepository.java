package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account,Integer> {

public List<Account> findAll();
	
//	@EntityGraph(value = "ClientUser.accList", type = EntityGraphType.FETCH)
//	public ClientUser findByUsername(String username);
	
	public Account findByAccountNumber(String accountNumber);

	
}
