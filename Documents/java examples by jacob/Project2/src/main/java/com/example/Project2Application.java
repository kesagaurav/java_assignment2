package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dao.AccountDao;
import com.example.dao.ClientDao;
import com.example.model.Account;
import com.example.model.ClientUser;
import com.example.util.HibernateUtil;

@SpringBootApplication
public class Project2Application {
	private static HibernateUtil hutil=new HibernateUtil();
	private static ClientDao cDao=new ClientDao(hutil);
	private static AccountDao ADao=new AccountDao(hutil);
	
	
	
	public static void main(String[] args) {
		
		SpringApplication.run(Project2Application.class, args);
	
		
//		ClientUser cu=new ClientUser("kesagaurav3","kesa1","gaurav1","2-302-90",23,"kg@gmail.com","9849971504",null,null);
//		ClientUser cu1=new ClientUser("kesagaurav4","kesa2","gaurav2","21-302-90",24,"kg1@gmail.com","9849971409",null,null);
//		ClientUser cu2=new ClientUser("kesagaurav5","kesa3","gaurav3","22-302-90",25,"kg2@gmail.com","9849971594",null,null);

//		cDao.insert(cu);
//		cDao.insert(cu1);
//		cDao.insert(cu2);

		
		
		Account A=new Account("129908989",9000.00,null);
		Account b=new Account("129908989",9100.00,null);
		Account c=new Account("129908989",9200.00,null);
//	
		ADao.insert(A);
		ADao.insert(b);
		ADao.insert(c);
		
		
		List<Account> ac=new ArrayList();
		ac.add(A);
		ClientUser cu3=new ClientUser("kesagaurav3","kesa1","gaurav1","2-302-90",23,"kg@gmail.com","9849971504",null,ac);

		
	
	}




		
		
	
	
}
