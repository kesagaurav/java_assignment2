package com.example.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.model.Account;
import com.example.model.Client;
import com.example.util.HibernateUtil;

public class AccountDao {
	private HibernateUtil hUtil;
	public AccountDao() {
		// TODO Auto-generated constructor stub
	}
	public AccountDao(HibernateUtil hUtil) {
		super();
		this.hUtil = hUtil;
	}
	public void insert(Account cs) {
		Session ses = hUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.save(cs);
		tx.commit();
		//ses.close();
	}
	public void update(Account cs) {
		Session ses = hUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.update(cs);
		tx.commit();
		//ses.close();
	}
	public Account selectById(int id) {
		Session ses = hUtil.getSession();
		Account cs = ses.get(Account.class, id);
		//ses.close();
		return cs;
	}
}
