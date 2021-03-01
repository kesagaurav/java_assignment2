package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.ClientUser;

@Repository
public interface ClientUserRepository extends JpaRepository<ClientUser,Integer>{

public List<ClientUser> findAll();
	
	public ClientUser findByUsername (String username);

	
}
