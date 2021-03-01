package com.example;

import java.util.ArrayList;
import java.util.List;

import com.example.dao.FamilyDao;
import com.example.dao.SuperHeroDao;
import com.example.dao.SuperVillianDao;
import com.example.model.Family;
import com.example.model.SuperHero;
import com.example.model.SuperVillian;
import com.example.util.HibernatehUtil;

public class SuperHeroAndVillian {
	private static HibernatehUtil hutil=new HibernatehUtil();
	private static SuperHeroDao superdao=new SuperHeroDao(hutil);
	private static SuperVillianDao villiandao=new SuperVillianDao(hutil);
	private static FamilyDao fdao=new FamilyDao(hutil);
	public static void main(String[] args) {
		
		//insertAndDeleteSuperHeroValues();
		insertAndDeleteSuperVillianValues();
		
		Family fam=new Family("prakaash","deepa");
		Family fam1=new Family("omkar","vijaya");
		Family fam2=new Family("lordshiva","goddessparvati");
		
		fdao.insert(fam);
		fdao.insert(fam1);
		fdao.insert(fam2);
		
		fdao.delete();
		

		
		
	
	}
	public static void insertAndDeleteSuperVillianValues() {
		
	
		
		SuperVillian shero1=new SuperVillian("doctor","doom",null);
		SuperVillian shero2=new SuperVillian("thanos","infinity",null);
		SuperVillian shero3=new SuperVillian("dark","avenger",null);
		SuperVillian shero4=new SuperVillian("dr","octopus",null);

		
		
	
		
		//SuperHero shero=new SuperHero("gaurav","kesa",shero1);
//		SuperHero shero11=new SuperHero("tony","stark",shero2);
//		SuperHero shero21=new SuperHero("captain","america",shero3);
//		SuperHero shero31=new SuperHero("black","kesa",shero4);
//	
		
		
		
		List<SuperVillian> list=new ArrayList<>();
		list.add(shero1);
		SuperHero shero=new SuperHero("gaurav","kesa",list);
		list.add(shero2);
		SuperHero shero11=new SuperHero("tony","stark",list);
		list.add(shero3);
		SuperHero shero21=new SuperHero("captain","america",list);
		list.add(shero4);
		SuperHero shero31=new SuperHero("black","kesa",list);
		

		

		superdao.insert(shero);
		superdao.insert(shero11);
		superdao.insert(shero21);
		superdao.insert(shero31);
		
		shero31.setFirstname("deepa");
		superdao.update(shero31);
		
		
		System.out.println(shero);
		
		
		//superdao.create(shero11);
		
		superdao.create1();

		
	}
	
	
	
	

}
