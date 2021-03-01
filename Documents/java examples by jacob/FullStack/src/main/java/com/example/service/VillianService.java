package com.example.service;

import com.example.dao.Villian;
import com.example.model.SuperVillian;

public class VillianService {

	private Villian vdao;

	public VillianService() {
		super();
	}

	public VillianService(Villian vdao) {
		super();
		this.vdao = vdao;
	}
	
	public SuperVillian getVillian(String name) {
		SuperVillian vill=vdao.findByName(name);
		
		if(vill==null)
		{
			throw new NullPointerException();
		}
		
		return vill;
		
	}
	
	
	public boolean powerVerify(String name,String superpower) {
		boolean isVerified=false;
		SuperVillian vill=getVillian(name);
		if(vill.getSuperpower().equals(superpower)) {
			isVerified=true;
		}
		return isVerified;
	}
	
	
}
