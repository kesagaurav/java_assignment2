package com.example;

import java.util.ArrayList;
import java.util.List;

import com.example.dao.CrimeDao;
import com.example.dao.SuperPrisonDao;
import com.example.dao.SuperVillianDao;
import com.example.model.Crime;
import com.example.model.SuperPrison;
import com.example.model.SuperVillian;
import com.example.util.HibernateUtil;

public class MainDriver {
	public static HibernateUtil hUtil=new HibernateUtil();
	public static SuperVillianDao svDao=new SuperVillianDao(hUtil);
	public static CrimeDao cDao=new CrimeDao(hUtil);
	public static SuperPrisonDao spDao=new SuperPrisonDao(hUtil);
	public static void main(String[] args) {
		
		insertInitialValues();
		
		// TODO Auto-generated method stub
//
//		SuperVillian vill1=new SuperVillian("gaurav","harkworker",900000);
//		SuperVillian vill2=new SuperVillian("void","empty",9100000);
//		SuperVillian vill3=new SuperVillian("taskmaster","kungfu",1900000);
//		SuperVillian vill4=new SuperVillian("darkseid","antimatter",92300000);
//		
//		
//		svDao.insert(vill1);
//		svDao.insert(vill2);
//		svDao.insert(vill3);
//		svDao.insert(vill4);
		
		//System.out.println(svDao.selectById(1));
		
		SuperVillian vill=svDao.selectByName("gaurav");
		System.out.println(spDao.selectByName("arkham"));
		System.out.println(vill);
		hUtil.closeSes();
		//System.out.println(svDao.selectAll());
		
		
	}

	public static void insertInitialValues() {
		//CRIMES CREATION
		Crime c1=new Crime("bank robbery","the most biggest robbery");
		Crime c2=new Crime("blackmagic","the most biggest robbery magic");
		Crime c3=new Crime("socerry magic","the crystal stone");
		Crime c4=new Crime("antilife equation","to conqueror all over the world");
		Crime c5=new Crime("infinity stones","the most powerfull stones in the world");
		
		//PRISON CREATION
		SuperPrison p1=new SuperPrison("arkham","gowtham");
		SuperPrison p2=new SuperPrison("alcahtraz","newyork");

		//VILLIAN CREATION
		List<Crime> cList=new ArrayList<>();
		cList.add(c2);
		cList.add(c5);
		SuperVillian vill=new SuperVillian("gaurav","hardworker",6,cList,p2);
		p2.getVillList().add(vill);
		cList= new ArrayList<>();
		cList.add(c3);
		cList.add(c1);
		cList.add(c4);
		SuperVillian Vill2=new SuperVillian("thanos","infinity stones",900000,cList,p2);
		p2.getVillList().add(Vill2);
		cList=new ArrayList<>();
		cList.add(c3);
		cList.add(c1);
		cList.add(c4);
		SuperVillian Vill3=new SuperVillian("darkseid","anti_life_equation",9100000,cList,p1);
		p1.getVillList().add(Vill3);
		//Inserts
		cList.add(c2);
		cList.add(c5);
		//Inserts
		spDao.insert(p1);
		spDao.insert(p2);
		for(Crime temp:cList) {
			cDao.insert(temp);
		}
		svDao.insert(vill);
		svDao.insert(Vill2);
		svDao.insert(Vill3);
		
	}
	
	
}
