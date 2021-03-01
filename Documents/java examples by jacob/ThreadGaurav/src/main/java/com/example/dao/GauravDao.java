package com.example.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.hutil.Hibernatehutil;
import com.example.model.Gaurav;


public class GauravDao {
	private Hibernatehutil hutil;
	public GauravDao() {
		// TODO Auto-generated constructor stub
	}
	public GauravDao(Hibernatehutil hutil) {
		super();
		this.hutil = hutil;
	}
	public void insert(Gaurav rmi) {
		Session ses = hutil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.save(rmi);
		tx.commit();
		//ses.close();
	}
	public void update(Gaurav rmi) {
		Session ses = hutil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.update(rmi);
		tx.commit();
		//ses.close();
	}
}
