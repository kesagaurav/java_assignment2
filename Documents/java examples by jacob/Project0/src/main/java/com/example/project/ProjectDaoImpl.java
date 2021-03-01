package com.example.project;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.example.Controller.ClassController;
import com.example.account.Account;
import com.example.client.Client;



public class ProjectDaoImpl {
	private static String url="jdbc:mariadb://revy-senpai.c7otdgsixoyh.us-east-2.rds.amazonaws.com:3306/projectdb";
	private  static String username="projectuser";
	private  static String  password="mypassword";
	
	
	public static List<Client> getAllClient()
	{
		List<Client> foodList=new ArrayList<>();
		try(Connection con=DriverManager.getConnection(url,username,password)){
		String sql="SELECT * FROM CLIENT";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			foodList.add(new Client(rs.getInt(3),rs.getString(2),rs.getString(1)));
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return foodList;
		
	}
	public static String InsertClient(String f_name,String l_name,int id) {
		try(Connection con=DriverManager.getConnection(url,username,password)){
			String sql="INSERT  INTO CLIENT(firstname,lastnmae,id)  VALUES(?,?,?)";
			
			PreparedStatement psc=con.prepareStatement(sql);
			psc.setString(1, f_name);
			psc.setString(2,l_name);
			psc.setInt(3, id);
			
			int changed=psc.executeUpdate();
			System.out.println("\n num of rows changed " + changed);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return "";
	
		
		
	}
	public static void callableInsertFood(String f_name,String l_name,int id) {
		try(Connection con=DriverManager.getConnection(url,username,password)){
		String sql="{call insert_CLIENT(?,?,?)}";
		
		CallableStatement cs=con.prepareCall(sql);
		cs.setString(1, f_name);
		cs.setString(2, l_name);
		cs.setInt(3, id);
		int status=cs.executeUpdate();
		System.out.println("Callable Statement " + status);
		
		
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		}
	


	public static List<Client> getClientid()
	{
		List<Client> foodList=new ArrayList<>();
		try(Connection con=DriverManager.getConnection(url,username,password)){
		String sql="SELECT * FROM CLIENT WHERE id=10";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			foodList.add(new Client(rs.getInt(3),rs.getString(2),rs.getString(1)));
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return foodList;
		
	}

	public static List<Client> putClientid()
	{
		List<Client> foodList=new ArrayList<>();
		try(Connection con=DriverManager.getConnection(url,username,password)){
		String sql="UPDATE CLIENT SET firstname='donald',lastname='trump' WHERE id=12";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			foodList.add(new Client(rs.getInt(3),rs.getString(2),rs.getString(1)));
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return foodList;
		
	}
	
	
	public static List<Client> Deleteid()
	{
		List<Client> foodList=new ArrayList<>();
		try(Connection con=DriverManager.getConnection(url,username,password)){
		String sql="DELETE FROM CLIENT WHERE id=15";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			foodList.add(new Client(rs.getInt(3),rs.getString(2),rs.getString(1)));
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return foodList;
		
	}

	


//	public static List<Account> getClientandAccount()
//	{
//		//List<Client> foodList=new ArrayList<>();
//		List<Account> foodList=new ArrayList<>();
//		try(Connection con=DriverManager.getConnection(url,username,password)){
//		String sql="SELECT * FROM ACCOUNT ";
//		PreparedStatement ps=con.prepareStatement(sql);
//		ResultSet rs=ps.executeQuery();
//		while(rs.next()) {
//			//foodList.add(new Client(rs.getInt(3),rs.getString(2),rs.getString(1)));
//			foodList.add(new Account(rs.getInt(3),rs.getInt(2),rs.getDouble(1)));
//		}
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
//		
//		return foodList;
//		
//	}
	
	
	
	public static List<Account> getAllAccounts(){
		List<Account> account=new ArrayList<>();
		try(Connection con=DriverManager.getConnection(url,username,password)){
			
			String sql="SELECT * FROM ACCOUNT";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				account.add(new Account(rs.getInt(0),rs.getInt(1),rs.getInt(2)));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return account;
	}
	
	
	

	

//	public static List<Account> getAccountByClient(int clientid)
//	{
//		List<Client> foodList=new ArrayList<>();
//		List<Account> foodList1=new ArrayList<>();
//		try(Connection con=DriverManager.getConnection(url,username,password)){
//		String sql="SELECT * FROM ACCOUNT";
//		PreparedStatement ps=con.prepareStatement(sql);
//		ResultSet rs=ps.executeQuery();
//		while(rs.next()) {
////			String firstname=rs.getString(0);
////			String lastname=rs.getString(1);
////			int id=rs.getInt(3);
////			int clientid=rs.getInt(4);
////			int accountid=rs.getInt(5);
////			double amount=rs.getDouble(6);
//			
//		}
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
//
//		return foodList1;
//		
//		
//	}
	
	
	

	public static List<Client> getAllAccount()
	{
		List<Client> foodList=new ArrayList<>();
		try(Connection con=DriverManager.getConnection(url,username,password)){
		String sql="SELECT * FROM ACCOUNT,CLIENT WHERE Balance<2000 and Balance >400 WHERE id=7";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			foodList.add(new Client(rs.getInt(3),rs.getString(2),rs.getString(1)));
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return foodList;
		
	}
	
	public static List<Client> getAllAccount1()
	{
		List<Client> foodList=new ArrayList<>();
		try(Connection con=DriverManager.getConnection(url,username,password)){
		String sql="SELECT * FROM CLIENT WHERE id=9 AND ACCOUNT=4";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			foodList.add(new Client(rs.getInt(3),rs.getString(2),rs.getString(1)));
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return foodList;
		
	}
	
	public static List<Client> getAllAccount5()
	{
		List<Client> foodList=new ArrayList<>();
		try(Connection con=DriverManager.getConnection(url,username,password)){
		String sql="UPDATE ACCOUNT SET where client_id=10,account_id=10,where id=3";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			foodList.add(new Client(rs.getInt(3),rs.getString(2),rs.getString(1)));
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return foodList;
		
	}
	
	public static List<Client> getDelete()
	{
		List<Client> foodList=new ArrayList<>();
		try(Connection con=DriverManager.getConnection(url,username,password)){
		String sql="DELETE FROM ACCOUNT WHERE id=15";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			foodList.add(new Client(rs.getInt(3),rs.getString(2),rs.getString(1)));
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return foodList;
		
	}
	
	
	
		public static List<Account> getAccountAndClient(int clientid) {
			
			List<Account> foodList1=new ArrayList<>();
			//Connection con=DriverManager.getConnection();
			PreparedStatement ps;
			try(Connection con=DriverManager.getConnection(url,username,password)){
				//String sql="SELECT * FROM CLIENT WHERE client_id=?";
				String sql="SELECT * FROM ACCOUNT WHERE client_id=?";
			ps=con.prepareStatement(sql);
			ps.setInt(1, clientid);
			ResultSet rs= ps.executeQuery();
				while(rs.next()) {
					foodList1.add(new Account(rs.getInt(3),rs.getInt(2),rs.getDouble(1)));
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
			return foodList1;
		
		
	}
	
	
}
