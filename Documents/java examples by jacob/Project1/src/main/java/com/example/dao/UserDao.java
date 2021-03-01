package com.example.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.NativeQuery;

import com.example.model.Reimbursement;
import com.example.model.User;
import com.example.util.HibernateUtil;

public class UserDao  {
	private HibernateUtil hutil;

	public UserDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDao(HibernateUtil hutil) {
		super();
		this.hutil = hutil;
	}
	
	public void insert(User user) {
		Session ses=hutil.getSession();
		Transaction tx=ses.beginTransaction();
		
		ses.save(user);
		tx.commit();
		//ses.close();
	}
	
	public void update(User user) {
		Session ses=hutil.getSession();
		Transaction tx=ses.beginTransaction();
		
		ses.update(user);
		tx.commit();
		//ses.close();
		
	}
	
	public User selectById(int id) {
		Session ses=hutil.getSession();
		Transaction tx=ses.beginTransaction();
		
		User user=ses.get(User.class, id);
		//ses.close();
		return user;
	}
	
	
	public User selectByName(String name) {
		Session ses=hutil.getSession();
		
		//List<SuperVillian> vList=ses.createQuery("from SuperVillian where name='" + name + "'",SuperVillian.class).list();
		
		List<User> vList=ses.createCriteria(User.class).add(Restrictions.like("name",name)).list();
		
		if(vList.size()==0) {
			System.out.println("found nothing");
			return null;
		}
		return vList.get(0);
	}
	
	public List<User> selectAll(){
		Session ses=hutil.getSession();
		
		List<User> vList=ses.createQuery("from User ",User.class).list();
		//ses.close();
		return vList;
	}
	
	public  User  getUsername(String username) {
//		//List<User> list = new ArrayList<>
		
		Session ses=hutil.getSession();
////		List<User> uList= ses.createQuery("username,password from User",User.class).list();
//		
		
		String query="from User where username ='"+ username+"'";
		Query q=ses.createQuery(query, User.class);
		 List<User> list=q.list();
		 
		 for(User us:list) {
			 System.out.println(us.getUsername());
			
	}
		

		 return list.get(0);
	}		

	
		
	
	
}
	

