package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.model.SuperVillian;

public class Villian implements GenericDao<SuperVillian> {

	private VillianDBConnection vdc;
	
	
	public Villian() {
		super();
	}

	public Villian(VillianDBConnection vdc) {
		super();
		this.vdc = vdc;
	}

	@Override
	public SuperVillian findByName(String name) {
		SuperVillian vill=null;
		try(Connection con=vdc.getDBConnection()){
			String sql="";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,name);
			ResultSet rs=ps.executeQuery();
			if(!rs.first()) {
				return vill;
			}
			vill=new SuperVillian(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vill;
	}

	@Override
	public SuperVillian findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(SuperVillian entity) {
		// TODO Auto-generated method stub
		
	}

	
	
}
