package com.example.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.model.Family;
import com.example.util.HibernatehUtil;

public class FamilyDao {
	private HibernatehUtil hutil;

	public FamilyDao(HibernatehUtil hutil) {
		super();
		this.hutil = hutil;
	}
	
	public void insert(Family family) {
		Session ses = hutil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.save(family);
		tx.commit();
		//ses.close();
	}
	
	
	public void create() {
		Session ses = hutil.getSession();
		//Transaction tx = ses.beginTransaction();
		String query="from Family";
		Query q=ses.createQuery(query);
		List<Family> list=q.list();
		for(Family fam:list) {
			System.out.println(fam.getFather());
		}
	}
		//tx.commit();
		public void delete() {
			Session ses = hutil.getSession();
			Transaction tx = ses.beginTransaction();
//			String query="from Family where father='prakaash'";
			Query q=ses.createQuery(" delete from Family where father=:c");
			q.setParameter("c", "prakaash");
			int r=q.executeUpdate();
			System.out.println("deleted");
			System.out.println(r);
			tx.commit();
		}
		
		
		@SuppressWarnings("deprecation")
		public void update() {
			Session ses = hutil.getSession();
			Transaction tx = ses.beginTransaction();
			List<Family> list=new ArrayList<>();
			Query q=ses.createQuery("update Family set  id =:b father=:c,mother=:n");
			q.setParameter("c","prakaash");
			q.setParameter("n", "deepa");
			
			int r=q.executeUpdate();
			System.out.println(r+"objects updated");
			System.out.println(r);	
			tx.commit();
		
		}

		
		
		
	
	
	
}
