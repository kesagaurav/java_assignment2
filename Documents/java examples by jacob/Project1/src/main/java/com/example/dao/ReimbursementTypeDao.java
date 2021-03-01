package com.example.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.model.Reimbursement;
import com.example.model.ReimbursementType;
import com.example.util.HibernateUtil;

public class ReimbursementTypeDao {
	private HibernateUtil hutil;
	public ReimbursementTypeDao() {
		// TODO Auto-generated constructor stub
	}
	public  ReimbursementTypeDao(HibernateUtil hutil) {
		super();
		this.hutil = hutil;
	}
	
	public void insert(ReimbursementType rmi) {
		Session ses = hutil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.save(rmi);
		tx.commit();
		//ses.close();
	}
	public void update(ReimbursementType rmi) {
		Session ses = hutil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.update(rmi);
		tx.commit();
		//ses.close();
	}
	public ReimbursementType  selectById(int id) {
		Session ses = hutil.getSession();
		ReimbursementType rmi = ses.get(ReimbursementType.class, id);
		//ses.close();
		return rmi;
	}
}
