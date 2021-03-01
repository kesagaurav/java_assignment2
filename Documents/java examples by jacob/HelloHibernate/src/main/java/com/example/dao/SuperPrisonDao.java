package com.example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import com.example.model.SuperPrison;
import com.example.model.SuperVillian;
import com.example.util.HibernateUtil;

public class SuperPrisonDao {
	private HibernateUtil hUtil;

	public SuperPrisonDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SuperPrisonDao(HibernateUtil hUtil) {
		super();
		this.hUtil = hUtil;
	}
	
	public void insert(SuperPrison prison) {
		Session ses=hUtil.getSession();
		Transaction tx=ses.beginTransaction();
		
		ses.save(prison);
		tx.commit();
		//ses.close();
	}
	
	public void update(SuperPrison prison) {
		Session ses=hUtil.getSession();
		Transaction tx=ses.beginTransaction();
		
		ses.update(prison);
		tx.commit();
		//ses.close();
		
	}
	
	public SuperPrison selectById(int id) {
		Session ses=hUtil.getSession();
		//Transaction tx=ses.beginTransaction();
		
		SuperPrison prison=ses.get(SuperPrison.class, id);
		//ses.close();
		return prison;
	}
	
	
	public SuperPrison selectByName(String name) {
		Session ses=hUtil.getSession();
		
		//List<SuperVillian> vList=ses.createQuery("from SuperVillian where name='" + name + "'",SuperVillian.class).list();
		
		List<SuperPrison> vList=ses.createCriteria(SuperPrison.class).add(Restrictions.like("name",name)).list();
		
		if(vList.size()==0) {
			System.out.println("found nothing");
			return null;
		}
		return vList.get(0);
	}
	
	public List<SuperPrison> selectAll(){
		Session ses=hUtil.getSession();
		
		List<SuperPrison> vList=ses.createQuery("from SuperPrison ",SuperPrison.class).list();
		//ses.close();
		return vList;
	}
}
