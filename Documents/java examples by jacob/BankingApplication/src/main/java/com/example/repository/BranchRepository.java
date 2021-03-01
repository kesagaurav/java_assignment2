package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch,Integer> {
public List<Branch> findAll();
	
//	@EntityGraph(value = "ClientUser.accList", type = EntityGraphType.FETCH)
//	public ClientUser findByUsername(String username);
	
	
}


