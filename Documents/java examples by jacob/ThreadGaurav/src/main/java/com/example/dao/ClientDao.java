package com.example.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.hutil.Hibernatehutil;
import com.example.model.Client;

public class ClientDao {
	private Hibernatehutil hutil;
	public ClientDao() {
		// TODO Auto-generated constructor stub
	}
	public ClientDao(Hibernatehutil hutil) {
		super();
		this.hutil = hutil;
	}
	public void insert(Client rmi) {
		Session ses = hutil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.save(rmi);
		tx.commit();
		//ses.close();
	}
	public void update(Client rmi) {
		Session ses = hutil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.update(rmi);
		tx.commit();
		//ses.close();
	}
}
