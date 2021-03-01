package com.example.dao;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.model.Reimbursement;
import com.example.model.User;
import com.example.util.HibernateUtil;

public class ReimbursementDao {

	private HibernateUtil hutil;
	public ReimbursementDao() {
		// TODO Auto-generated constructor stub
	}
	public ReimbursementDao(HibernateUtil hutil) {
		super();
		this.hutil = hutil;
	}
	public void insert(Reimbursement rmi) {
		Session ses = hutil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.save(rmi);
		tx.commit();
		//ses.close();
	}
	public void update(Reimbursement rmi) {
		Session ses = hutil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.update(rmi);
		tx.commit();
		//ses.close();
	}
	public Reimbursement  selectById(int id) {
		Session ses = hutil.getSession();
		Reimbursement rmi = ses.get(Reimbursement.class, id);
		//ses.close();
		return rmi;
	}
	
	
	public Reimbursement getById(int id) {
		Session ses = hutil.getSession();
		
		String query="from Reimbersement where id='"+id+'"';
		Query q=ses.createQuery(query,Reimbursement.class);
		 List<Reimbursement> list=q.list();
		 
		 for(Reimbursement rs:list) {
			 System.out.println(rs.getRemid());
			
	}
		
		return list.get(id);
		
	}
	
	
	
	public Object[] Join() {
		Session ses=hutil.getSession();
		Query q=ses.createQuery("select r.Reimbursement,r.remibid,s.remibstatusid from Reimbursement as r INNER JOIN r.reimbstatusid as s");
		List<Object[]> list=q.getResultList();
		
		for(Object[] arr:list) {
			System.out.println(Arrays.toString(arr));
		}
		
		
		
		return list.get(0);
		
	}
	
	
	
	
	
}
