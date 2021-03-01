package com.example;

import com.example.dao.FoodDaoImpl;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		FoodDaoImpl.insertFood("pizza3", "stuff");
		
//		FoodDaoImpl.preparedInsertFood("french fries2","cumpsy potatoes");
//		FoodDaoImpl.callableInsertFood("tots1","cripsy potatoes");
		System.out.println(FoodDaoImpl.getAllFood());
	}

}
