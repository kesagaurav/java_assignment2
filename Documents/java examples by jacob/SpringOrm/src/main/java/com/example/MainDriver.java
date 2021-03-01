package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.Food;
import com.example.repository.FoodRepository;

public class MainDriver {

	public static ApplicationContext appCon=new ClassPathXmlApplicationContext("applicationcontext.xml");
	
	public static FoodRepository foodRepo=appCon.getBean("foodDao",FoodRepository.class);
	
	public static void main(String[] args) {
		
		insertInitialValues();
		System.out.println(foodRepo.selectAll());
		System.out.println(foodRepo.selectByName("burger"));
	
	}
	

	public static void insertInitialValues() {
		Food food1=new Food("ramen",400);
		Food food2=new Food("noodles",4200);
		Food food3=new Food("burger",4300);
		Food food4=new Food("chips",4400);
		
//		foodRepo.insert(food1);
//		foodRepo.insert(food2);
//		foodRepo.insert(food3);
//		foodRepo.insert(food4);
		
		
	}

}
