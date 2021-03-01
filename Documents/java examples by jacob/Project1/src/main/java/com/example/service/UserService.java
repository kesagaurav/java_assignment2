package com.example.service;

import com.example.model.User;
import com.example.util.HibernateUtil;

import java.util.List;

import com.example.dao.UserDao;
public class UserService {

	private UserDao udao;
	
	public UserService() {
		super();
	}

	public UserService(UserDao  udao) {
		super();
		this.udao = udao;
	}
	
	public  User getUser(String username) {
		User us=udao.getUsername(username);
		
		if(us==null)
		{
			throw new NullPointerException();
		}
		
		return us;
		
	}
	
	
	public boolean userVerify(String username,String password) {
		boolean isVerified=false;
		User us=getUser(username);
		if(us.getPassword().equals(password)) {
			isVerified=true;
		}
		return isVerified;
	}
}
