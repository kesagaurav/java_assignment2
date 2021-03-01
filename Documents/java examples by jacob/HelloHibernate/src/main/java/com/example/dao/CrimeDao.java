package com.example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.example.model.Crime;
import com.example.util.HibernateUtil;
public class CrimeDao {
private HibernateUtil hUtil;
	public CrimeDao() {
		// TODO Auto-generated constructor stub
	}
	public CrimeDao(HibernateUtil hUtil) {
		super();
		this.hUtil = hUtil;
	}
	public void insert(Crime crime) {
		Session ses = hUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.save(crime);
		tx.commit();
		//ses.close();
	}
	public void update(Crime crime) {
		Session ses = hUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.update(crime);
		tx.commit();
		//ses.close();
	}
	public Crime selectById(int id) {
		Session ses = hUtil.getSession();
		Crime crime = ses.get(Crime.class, id);
		//ses.close();
		return crime;
	}
}

