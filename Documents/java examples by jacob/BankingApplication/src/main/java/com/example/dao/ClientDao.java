package com.example.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.model.ClientUser;
import com.example.util.HibernateUtil;

public class ClientDao {
	private HibernateUtil hUtil;
	public ClientDao() {
		// TODO Auto-generated constructor stub
	}
	public ClientDao(HibernateUtil hUtil) {
		super();
		this.hUtil = hUtil;
	}
	public void insert(ClientUser Client) {
		Session ses = hUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.save(Client);
		tx.commit();
		//ses.close();
	}
	public void update(ClientUser Client) {
		Session ses = hUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.update(Client);
		tx.commit();
		//ses.close();
	}
	public ClientUser selectById(int id) {
		Session ses = hUtil.getSession();
		ClientUser Client = ses.get(ClientUser.class, id);
		//ses.close();
		return Client;
	}
}
