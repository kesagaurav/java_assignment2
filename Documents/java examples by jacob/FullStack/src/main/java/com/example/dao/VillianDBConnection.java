package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class VillianDBConnection {
		private String url="jdbc:mariadb://revy-senpai.c7otdgsixoyh.us-east-2.rds.amazonaws.com:3306/villiandb";
		private String username="villianuser";
		private String password="mypassword";
		
	public Connection getDBConnection() throws SQLException
	{
		return DriverManager.getConnection(url, username, password);
		
	}
		
}

