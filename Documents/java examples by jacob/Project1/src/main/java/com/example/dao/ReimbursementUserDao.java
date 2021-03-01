package com.example.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.example.util.HibernateUtil;
import com.example.model.ReimbursementUserRole;

public class ReimbursementUserDao {
	private HibernateUtil hutil;
	public ReimbursementUserDao() {
		// TODO Auto-generated constructor stub
	}
	public  ReimbursementUserDao(HibernateUtil hutil) {
		super();
		this.hutil = hutil;
	}
	
	public void insert(ReimbursementUserRole rmi) {
		Session ses = hutil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.save(rmi);
		tx.commit();
		//ses.close();
	}
	public void update(ReimbursementUserRole rmi) {
		Session ses = hutil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.update(rmi);
		tx.commit();
		//ses.close();
	}
	public ReimbursementUserRole selectById(int id) {
		Session ses = hutil.getSession();
		ReimbursementUserRole rmi = ses.get(ReimbursementUserRole.class, id);
		//ses.close();
		return rmi;
	}
}
