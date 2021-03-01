package com.example;

import com.example.dao.AccountDao;
import com.example.dao.ClientDao;
import com.example.model.Account;
import com.example.model.Client;
import com.example.util.HibernateUtil;

public class ClientAndAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			HibernateUtil hutil=new HibernateUtil();
			ClientDao cdao=new ClientDao(hutil);
			AccountDao adao=new AccountDao(hutil);
			
			Client c=new Client("gaurav","kesa","12-40-00","kg@gmail.com",12,"ok");
			Account a=new Account(1294049090,c);
		
		
	}

}
