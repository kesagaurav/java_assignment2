package com.example.service;

import com.example.dao.LoginDao;
import com.example.model.Login;

public class LoginService {
private LoginDao udao;
	
	public LoginService() {
		super();
	}

	public LoginService(LoginDao  udao) {
		super();
		this.udao = udao;
	}
	
	public  Login  getUser(String username) {
		Login ls=udao.insert(username);
		
		if(ls==null)
		{
			throw new NullPointerException();
		}
		
		return ls;
		
	}
	
	
	public boolean userVerify(String username,String password) {
		boolean isVerified=false;
		Login ls=getUser(username);
		if(ls.getPassword().equals(password)) {
			isVerified=true;
		}
		return isVerified;
	}

}
