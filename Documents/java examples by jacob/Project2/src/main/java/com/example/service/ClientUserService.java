package com.example.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.model.ClientUser;
import com.example.repository.ClientUserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor(onConstructor=@__(@Autowired))
@NoArgsConstructor 
public class ClientUserService {
private ClientUserRepository clientUserRepository;
	
	public ClientUser getClientByUsername(String username) {	
		return clientUserRepository.findByUsername(username);
	}
	
	public List<ClientUser> getAllClient(){
		return clientUserRepository.findAll();
	}
	
	public void insertClient(ClientUser user) {
		clientUserRepository.save(user);
	}

	
	public void deleteClient(ClientUser user) {
		clientUserRepository.delete(user);
	}
	
}
