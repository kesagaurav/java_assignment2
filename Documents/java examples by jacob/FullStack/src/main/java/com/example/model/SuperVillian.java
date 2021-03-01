package com.example.model;

public class SuperVillian {

	private int villianId;
	private String name;
	private String superpower;
	private int bounty;
	
//	public SuperVillian(int i, String string, String string2, int j) {
//		super();
//		// TODO Auto-generated constructor stub
//	}

	public SuperVillian(String name, String superpower, int bounty) {
		super();
		this.name = name;
		this.superpower = superpower;
		this.bounty = bounty;
	}
	
	public SuperVillian(int villianId, String name, String superpower, int bounty) {
		super();
		this.villianId = villianId;
		this.name = name;
		this.superpower = superpower;
		this.bounty = bounty;
	}

	

	public int getVillianId() {
		return villianId;
	}

	public void setVillianId(int villianId) {
		this.villianId = villianId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuperpower() {
		return superpower;
	}

	public void setSuperpower(String superpower) {
		this.superpower = superpower;
	}

	public int getBounty() {
		return bounty;
	}

	public void setBounty(int bounty) {
		this.bounty = bounty;
	}

	@Override
	public String toString() {
		return "SuperVillian [villianId=" + villianId + ", name=" + name + ", superpower=" + superpower + ", bounty="
				+ bounty + "]";
	}
	
	
	
}
