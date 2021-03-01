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

import com.example.model.ClientUser;

import com.example.service.ClientUserService;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@RestController
@RequestMapping(value="/users")
@AllArgsConstructor(onConstructor=@__(@Autowired))
@NoArgsConstructor
public class ClientUserController {
private ClientUserService clientServ;
	
	@PostMapping()
	public ResponseEntity<String> insertFood(@RequestBody LinkedHashMap fMap) {
		String username = (String)fMap.get("username");
		String firstName = (String)fMap.get("firstName");
		String lastName = (String)fMap.get("lastName");
		String address = (String)fMap.get("address");
		int age = Integer.parseInt((String)fMap.get("age"));
		String emailAddress = (String)fMap.get("emailAddress");
		String contactNumber = (String)fMap.get("contactNumber");
		
		 System.out.println(username);
		/*
		 * { "username": "john", "firstName": "john", "lastName": "lao", "address":
		 * "Santa Paula", "age": "10", "emailAddress": "laojohnmatthew@gmail.com",
		 * "contactNumber": "2246237364" }
		 */
		 
		
		
		ClientUser cu = new ClientUser(username,firstName,lastName,address,age,emailAddress,contactNumber, null, null);
		clientServ.insertClient(cu);
		return new ResponseEntity<>("resource was created", HttpStatus.CREATED);
	}
	
	@GetMapping("/{username}")
	public ResponseEntity<ClientUser> getClientUserByUsername(@PathVariable("username") String username) {
		ClientUser cu = clientServ.getClientByUsername(username);
		if(cu == null) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(cu, HttpStatus.OK);
	}
	
	@DeleteMapping("/{username}")
	public ResponseEntity<String> deleteFood(@PathVariable("username") String name){
ClientUser cu=clientServ.getClientByUsername(name);
		clientServ.deleteClient(cu);
		return new  ResponseEntity<>("resource deleted",HttpStatus.GONE);
	}

	
	

}
