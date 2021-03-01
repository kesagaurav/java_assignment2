package com.example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.example.model.SuperVillian;
import com.example.util.HibernateUtil;

public class SuperVillianDao {
		
	private HibernateUtil hUtil;

	public SuperVillianDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SuperVillianDao(HibernateUtil hUtil) {
		super();
		this.hUtil = hUtil;
	}
	
	public void insert(SuperVillian vill) {
		Session ses=hUtil.getSession();
		Transaction tx=ses.beginTransaction();
		
		ses.save(vill);
		tx.commit();
		//ses.close();
	}
	
	public void update(SuperVillian vill) {
		Session ses=hUtil.getSession();
		Transaction tx=ses.beginTransaction();
		
		ses.update(vill);
		tx.commit();
		//ses.close();
		
	}
	
	public SuperVillian selectById(int id) {
		Session ses=hUtil.getSession();
		//Transaction tx=ses.beginTransaction();
		
		SuperVillian vill=ses.get(SuperVillian.class, id);
		//ses.close();
		return vill;
	}
	
	
	public SuperVillian selectByName(String name) {
		Session ses=hUtil.getSession();
		
		//List<SuperVillian> vList=ses.createQuery("from SuperVillian where name='" + name + "'",SuperVillian.class).list();
		
		List<SuperVillian> vList=ses.createCriteria(SuperVillian.class).add(Restrictions.like("name",name)).list();
		
		if(vList.size()==0) {
			System.out.println("found nothing");
			return null;
		}
		return vList.get(0);
	}
	
	public List<SuperVillian> selectAll(){
		Session ses=hUtil.getSession();
		
		//List<SuperVillian> vList=ses.createQuery("from SuperVillian ",SuperVillian.class).list();
		//ses.close();
		
		List<SuperVillian> vList=ses.getNamedQuery("HQL_FIND_ALL_VILL").list();
		return vList;
	}
		
}
