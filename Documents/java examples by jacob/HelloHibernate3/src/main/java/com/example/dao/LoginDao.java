package com.example.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.model.Login;

import com.example.util.HibernateUtil;

public class LoginDao {
	private HibernateUtil hutil;

	public LoginDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginDao(HibernateUtil hutil) {
		super();
		this.hutil = hutil;
	}
	
	public Login insert(String  username) {
		Session ses=hutil.getSession();
		String sql="Insert into values(?,?,?,?,?)";
		Query q=ses.createQuery(sql,Login.class);
			
		
		Transaction tx=ses.beginTransaction();
		
		ses.save(username);
		tx.commit();
		//ses.close();
		
		return null;
	}
	
	
}
