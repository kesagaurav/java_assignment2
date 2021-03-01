package com.example.dao;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import hellojdbc.Food;

public class FoodDaoImpl {

	private static String url="jdbc:mariadb://revy-senpai.c7otdgsixoyh.us-east-2.rds.amazonaws.com:3306/fooddb";
	private  static String username="fooduser";
	private  static String  password="mypassword";
	
	public static void insertFood(String f_name,String f_recipe){
		
		try(Connection con=DriverManager.getConnection(url,username,password)){
			String sql="INSERT  INTO food(food_name,recipe)  VALUES(' " +f_name + "','" + f_recipe + "')";
			
			Statement sc=con.createStatement();
			int changed=sc.executeUpdate(sql);
			System.out.println("\n num of rows changed " + changed);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void preparedInsertFood(String f_name,String f_recipe) {
		try(Connection con=DriverManager.getConnection(url,username,password)){
			String sql="INSERT  INTO food(food_name,recipe)  VALUES(?,?)";
			
			PreparedStatement psc=con.prepareStatement(sql);
			psc.setString(1, f_name);
			psc.setString(2,f_recipe);
			
			int changed=psc.executeUpdate();
			System.out.println("\n num of rows changed " + changed);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	// The follwing is a callable statement that stored in the db
	
	
	public static void callableInsertFood(String f_name,String f_recipe) {
		try(Connection con=DriverManager.getConnection(url,username,password)){
		String sql="{call insert_food(?,?)}";
		
		CallableStatement cs=con.prepareCall(sql);
		cs.setString(1, f_name);
		cs.setString(2, f_recipe);
		
		int status=cs.executeUpdate();
		System.out.println("Callable Statement " + status);
		
		
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		}
	
	//How to handle query and a result set 
	
	public static List<Food> getAllFood()
	{
		List<Food> foodList=new ArrayList<>();
		try(Connection con=DriverManager.getConnection(url,username,password)){
		String sql="SELECT * FROM food";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			foodList.add(new Food(rs.getInt(1),rs.getString(2),rs.getString(3)));
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return foodList;
		
	}
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	

