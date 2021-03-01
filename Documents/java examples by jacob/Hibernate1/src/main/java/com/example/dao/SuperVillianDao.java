package com.example.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.model.SuperHero;
import com.example.model.SuperVillian;
import com.example.util.HibernatehUtil;

public class SuperVillianDao {
	private HibernatehUtil hutil;

	public SuperVillianDao(HibernatehUtil hutil) {
		super();
		this.hutil = hutil;
	}
	
	public void insert(SuperVillian crime) {
		Session ses = hutil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.save(crime);
		tx.commit();
		//ses.close();
	}
	public void update(SuperVillian crime) {
		Session ses = hutil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.update(crime);
		tx.commit();
		//ses.close();
	}
	
	public void delete(SuperVillian crime) {
		Session ses = hutil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.delete(crime);
		tx.commit();
		//ses.close();
	}
}
