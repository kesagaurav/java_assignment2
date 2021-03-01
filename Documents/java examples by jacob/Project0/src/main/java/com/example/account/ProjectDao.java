package com.example.account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ProjectDao {
	private static String url="jdbc:mariadb://revy-senpai.c7otdgsixoyh.us-east-2.rds.amazonaws.com:3306/fooddb";
	private  static String username="fooduser";
	private  static String  password="mypassword";
	
	public static String projectdao;
	
	public static void getId() {
	try(Connection con=DriverManager.getConnection(url,username,password)){
		String sql="SELECT * FROM CLIENT";
		Statement sc=con.createStatement();
		int changed=sc.executeUpdate(sql);
		System.out.println("\n num of rows changed " + changed);
	}catch(SQLException e) {
		e.printStackTrace();
	}
	}
	
	public static void getAccountAndClient() {
		try(Connection con=DriverManager.getConnection(url,username,password)){
			String sql="SELECT * FROM CLIENT c INNER JOIN ACCOUNT a  ON a.id =c.id ";
			Statement sc=con.createStatement();
			int changed=sc.executeUpdate(sql);
			System.out.println("\n num of rows changed " + changed);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}
