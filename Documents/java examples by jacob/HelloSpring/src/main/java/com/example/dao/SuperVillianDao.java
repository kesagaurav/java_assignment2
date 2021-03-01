package com.example.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.model.SuperVillian;

@Repository
public class SuperVillianDao {

	public SuperVillianDao() {
		//super();
		// TODO Auto-generated constructor stub
	}

	
	public List<SuperVillian>selectAll(){
		List<SuperVillian> vs=new ArrayList();
		vs.add(new SuperVillian("thanos","infinity stones",100000));
		vs.add(new SuperVillian("doctordoom","magic",1200000));
		vs.add(new SuperVillian("darksied","antilifeequation",1300000));
		vs.add(new SuperVillian("taskmatser","kungfu",134400000));
		vs.add(new SuperVillian("redskull","cosmiccube",1232300000));
		return vs;
	
	
	}
	
	
	
}
