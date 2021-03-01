package com.example.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.model.Reimbursement;
import com.example.model.ReimbursementStatus;
import com.example.util.HibernateUtil;

public class ReimbursementStatusDao {
	private HibernateUtil hutil;
	public ReimbursementStatusDao() {
		// TODO Auto-generated constructor stub
	}
	public ReimbursementStatusDao(HibernateUtil hutil) {
		super();
		this.hutil = hutil;
	}
	public void insert(ReimbursementStatus rmi) {
		Session ses = hutil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.save(rmi);
		tx.commit();
		//ses.close();
	}
	public void update(ReimbursementStatus rmi) {
		Session ses = hutil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.update(rmi);
		tx.commit();
		//ses.close();
	}
	public ReimbursementStatus  selectById(int id) {
		Session ses = hutil.getSession();
		ReimbursementStatus rmi = ses.get(ReimbursementStatus.class, id);
		//ses.close();
		return rmi;
	}
}
