package com.example.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.model.Client;
import com.example.util.HibernateUtil;

public class ClientDao {

	private HibernateUtil hUtil;
	public ClientDao() {
		// TODO Auto-generated constructor stub
	}
	public ClientDao(HibernateUtil hUtil) {
		super();
		this.hUtil = hUtil;
	}
	public void insert(Client cs) {
		Session ses = hUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.save(cs);
		tx.commit();
		//ses.close();
	}
	public void update(Client cs) {
		Session ses = hUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.update(cs);
		tx.commit();
		//ses.close();
	}
	public Client selectById(int id) {
		Session ses = hUtil.getSession();
		Client cs = ses.get(Client.class, id);
		//ses.close();
		return cs;
	}
	
	
}
