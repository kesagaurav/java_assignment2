package com.example.dao;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import com.example.model.SuperHero;
import com.example.util.HibernatehUtil;

public class SuperHeroDao {

	private HibernatehUtil hutil;

	public SuperHeroDao(HibernatehUtil hutil) {
		super();
		this.hutil = hutil;
	}
	
	public void insert(SuperHero crime) {
		Session ses = hutil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.save(crime);
		tx.commit();
		//ses.close();
	}
	public void update(SuperHero crime) {
		Session ses = hutil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.update(crime);
		tx.commit();
		//ses.close();
	}
	
//	public void delete() {
//		Session ses = hutil.getSession();
//		Transaction tx = ses.beginTransaction();
//		String query="from SuperHero where firstname='gaurav'";
//		Query q=ses.createQuery(query);
//		int r=q.executeUpdate();
//		System.out.println("deleted");
//		System.out.println(r);
//		
//		//ses.delete(crime);
//		tx.commit();
//		//ses.close();
//	}
	
	
	public SuperHero create(SuperHero hero) {
		Session ses = hutil.getSession();
		String query="from SuperHero where firstname='gaurav'";
		Query q=ses.createQuery(query);
		List<SuperHero> list=q.list();
		for(SuperHero hero1:list) {
			System.out.println(hero1.getFirstname());
		}
		return hero;
		
		
		
		
	}
	
	
	public Object[] create1() {
		Session ses = hutil.getSession();
		String query=" select * from SuperHero";
		NativeQuery nq=ses.createSQLQuery(query);
		List<Object[]> list=nq.list();
		for(Object[] superhero:list) {
			//System.out.println(Arrays.deepToString(superhero));
			System.out.println(superhero[0] + " "  + superhero[2]);
		}
		return list.get(0);
		
	}
	
	
	
}
