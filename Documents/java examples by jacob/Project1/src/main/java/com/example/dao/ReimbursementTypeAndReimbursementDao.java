package com.example.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.example.model.ReimbursementTypeAndReimbursementStatus;
import com.example.model.User;
import com.example.util.HibernateUtil;

public class ReimbursementTypeAndReimbursementDao {

	private HibernateUtil hutil;

	public ReimbursementTypeAndReimbursementDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReimbursementTypeAndReimbursementDao(HibernateUtil hutil) {
		super();
		this.hutil = hutil;
	}
	
	public void insert(ReimbursementTypeAndReimbursementStatus rts) {
		Session ses=hutil.getSession();
		Transaction tx=ses.beginTransaction();
		
		ses.save(rts);
		tx.commit();
		//ses.close();
	}
	
	public void update(ReimbursementTypeAndReimbursementStatus rts) {
		Session ses=hutil.getSession();
		Transaction tx=ses.beginTransaction();
		
		ses.update(rts);
		tx.commit();
		//ses.close();
		
	}
	
	public ReimbursementTypeAndReimbursementStatus selectById(int id) {
		Session ses=hutil.getSession();
		Transaction tx=ses.beginTransaction();
		
		ReimbursementTypeAndReimbursementStatus rts=ses.get(ReimbursementTypeAndReimbursementStatus.class, id);
		//ses.close();
		return rts;
	}
	
	
	public ReimbursementTypeAndReimbursementStatus selectByName(String description) {
		Session ses=hutil.getSession();
		
		//List<SuperVillian> vList=ses.createQuery("from SuperVillian where name='" + name + "'",SuperVillian.class).list();
		
		List<ReimbursementTypeAndReimbursementStatus> vList=ses.createCriteria(ReimbursementTypeAndReimbursementStatus .class).add(Restrictions.like("description",description)).list();
		
		if(vList.size()==0) {
			System.out.println("found nothing");
			return null;
		}
		return vList.get(0);
	}
	
	public List<ReimbursementTypeAndReimbursementStatus > selectAll(){
		Session ses=hutil.getSession();
		
		List<ReimbursementTypeAndReimbursementStatus > vList=ses.createQuery("from ReimbursementTypeAndReimbursementStatus  ",ReimbursementTypeAndReimbursementStatus .class).list();
		//ses.close();
		return vList;
	}
	
//	public  User  getUsername(String username) {
////		//List<User> list = new ArrayList<>
//		
//		Session ses=hutil.getSession();
//////		List<User> uList= ses.createQuery("username,password from User",User.class).list();
////		
//		
//		String query="from User where username ='"+ username+"'";
//		Query q=ses.createQuery(query, User.class);
//		 List<User> list=q.list();
//		 
//		 for(User us:list) {
//			 System.out.println(us.getUsername());
//			
//	}
//		
//
//		 return list.get(0);
//	
//	}
	
	
	public ReimbursementTypeAndReimbursementStatus getDescription(String description) {
		Session ses=hutil.getSession();
		
		String query="from ReimbursementTypeAndReimbursementStatus where description='"+description+ "'";
		Query q=ses.createQuery(query,ReimbursementTypeAndReimbursementStatus.class);
		List<ReimbursementTypeAndReimbursementStatus> list=q.list();
		
		for( ReimbursementTypeAndReimbursementStatus rts:list) {
			System.out.println(rts.getReimb_description());
		}
				
		
		
		
		
		return  list.get(0);
		
	}
	
	

	public ReimbursementTypeAndReimbursementStatus getAccount(double reimb_amount) {
		Session ses=hutil.getSession();
		
		String query="from ReimbursementTypeAndReimbursementStatus where reimb_amount='"+reimb_amount+ "'";
		Query q=ses.createQuery(query,ReimbursementTypeAndReimbursementStatus.class);
		List<ReimbursementTypeAndReimbursementStatus> list=q.list();
		
		for( ReimbursementTypeAndReimbursementStatus rts:list) {
			System.out.println(rts.getReimb_amount());
		}
				
		
		
		
		
		return  list.get(0);
		
	}
	
}
