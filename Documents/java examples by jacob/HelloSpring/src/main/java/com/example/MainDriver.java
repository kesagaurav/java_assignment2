package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.service.VillianService;

public class MainDriver {

	private static VillianService vserv;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Our Ioc container,aka ApplicationContext,needs the reference to be beans.xml for its bean configuration
		ApplicationContext appContext=new ClassPathXmlApplicationContext("beans.xml");
		
		vserv=appContext.getBean("vsServFirst",VillianService.class);
		System.out.println(vserv.getAllvs());
		
	}

}
