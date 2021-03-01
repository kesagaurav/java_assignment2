package com.example.controller;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Account;
import com.example.model.ClientUser;
import com.example.service.AccountService;
import com.example.service.ClientUserService;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@RestController
@RequestMapping(value="/accounts")
@AllArgsConstructor(onConstructor=@__(@Autowired))
@NoArgsConstructor
public class AccountController {
private AccountService clientServ;
	
	@PostMapping()
	public ResponseEntity<String> insertFood(@RequestBody LinkedHashMap fMap) {
		String accountNumber = (String)fMap.get("accountNumber");
		//Double balance = Double.parseDouble((String)fMap.get("balance"));
		
	
		
		/*
		 * { "username": "john", "firstName": "john", "lastName": "lao", "address":
		 * "Santa Paula", "age": "10", "emailAddress": "laojohnmatthew@gmail.com",
		 * "contactNumber": "2246237364" }
		 */
		 
		
		//Account a = new Account(accountNumber,null);
		//clientServ.insertAccount(a);
		return new ResponseEntity<>("resource was created", HttpStatus.CREATED);
	}
//	
	@GetMapping("/{accountNumber}")
	public ResponseEntity<Account> getClientUserByUsername(@PathVariable("accountNumber") String accountNumber) {
		Account cu = clientServ.getAccountByAccountNumber(accountNumber);
		if(cu == null) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(cu, HttpStatus.OK);
	}
	
//	@DeleteMapping("/{username}")
//	public ResponseEntity<String> deleteFood(@PathVariable("username") String name){
//ClientUser cu=clientServ.getClientByUsername(name);
//		clientServ.deleteClient(cu);
//		return new  ResponseEntity<>("resource deleted",HttpStatus.GONE);
//	}

	
	

}
