package com.example.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.model.Account;
import com.example.model.ClientUser;
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
	public void insert(Account ac) {
		Session ses = hUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.save(ac);
		tx.commit();
		//ses.close();
	}
	public void update(Account ac) {
		Session ses = hUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.update(ac);
		tx.commit();
		//ses.close();
	}

}
