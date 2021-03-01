package com.example;

import java.util.ArrayList;
import java.util.List;

import com.example.dao.ClientDao;
import com.example.dao.GauravDao;

import com.example.hutil.Hibernatehutil;
import com.example.model.Client;
import com.example.model.Gaurav;

public class MainThreadGaurav {

public static void main(String[] args) {
	 Hibernatehutil hUtil=new Hibernatehutil();
	
	 GauravDao gdao =new GauravDao(hUtil);
	 ClientDao csdao=new ClientDao(hUtil);
	 
	 
	 Client cdao1=new Client("deepa",102,"warangal",null);
	 Gaurav gdao1=new Gaurav("gaurav",101,cdao1);
	
	 //gdao.insert(gdao1);
	 //csdao.insert(cdao1);
	 
	 
	 
	 List<Gaurav> cList=new ArrayList();
	cList.add(gdao1);
	 Client cdao2=new Client("deepa",102,"warangal",cList);
	 
	// csdao.insert(cdao2);
	
	 
	 
	 
	 
	 
}
	

	}


