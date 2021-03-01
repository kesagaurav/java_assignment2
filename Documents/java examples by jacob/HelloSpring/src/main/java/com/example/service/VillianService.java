package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.SuperVillianDao;
import com.example.model.SuperVillian;

@Service("vsServFirst")
public class VillianService {

private SuperVillianDao supervillaindao;
//private int counter=0;



public VillianService() {
	//counter++;
	System.out.println("in no ars constructor");
}

public VillianService(SuperVillianDao vdao,int i) {
	super();
	this.supervillaindao=vdao;
	//counter++;
	System.out.println("in no arg constructor");
}



public VillianService(SuperVillianDao vdao) {
	super();
	this.supervillaindao=vdao;
	//counter++;
	System.out.println("in no arg constructor");
}

public SuperVillianDao getSuperVillianDao() {
	System.out.println("Service:in getter");
	return supervillaindao;
}

@Autowired
public void setSuperVillianDao(SuperVillianDao vdao) {
	System.out.println("service: in the setter");
	this.supervillaindao=vdao;
}


public List<SuperVillian> getAllvs(){
	return supervillaindao.selectAll();
}






}
