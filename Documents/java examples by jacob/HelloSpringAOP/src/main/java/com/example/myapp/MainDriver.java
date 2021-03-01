package com.example.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext appCon=new ClassPathXmlApplicationContext("applicationContext.xml");
		ProxyApp myapp=appCon.getBean("appProxy",ProxyApp.class);
		
		myapp.drawCartoon('y', 3);
		myapp.drawAnime(3);
		myapp.drawNature();
		myapp.drawSpace();
		myapp.sculptPottery();
				
		
	}

}
