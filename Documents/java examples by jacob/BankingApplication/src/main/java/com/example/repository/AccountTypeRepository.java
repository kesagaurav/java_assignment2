package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.AccountType;
import com.example.model.ClientUser;

@Repository
public interface AccountTypeRepository extends JpaRepository<AccountType,Integer>{

	public List<AccountType> findAll();
	public AccountType findByTypeName (String typename);

}
