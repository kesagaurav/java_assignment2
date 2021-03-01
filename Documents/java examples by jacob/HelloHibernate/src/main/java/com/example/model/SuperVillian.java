package com.example.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Super_Villian")
public class SuperVillian {
	@Id //primary key Identifier
	@Column(name="vill_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int villId;
	
	@Column(name="name",unique=true, nullable=false)
	private String name;
	
	@Column(name="superpower")
	private String superpower;
	
	@Column(name="bounty")
	private int bounty;

	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Crime> crimes;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="Prison_FK")
	private SuperPrison spHolder;
	
	public SuperVillian() {
		super();
	}

	public SuperVillian( String name, String superpower, int bounty,List<Crime> crimes,SuperPrison spHolder) {
		super();
		this.name = name;
		this.superpower = superpower;
		this.bounty = bounty;
		this.crimes=crimes;
		this.spHolder=spHolder;
	}
	
	
	public SuperVillian(int villId, String name, String superpower, int bounty,List<Crime> crimes,SuperPrison spHolder) {
		super();
		this.villId = villId;
		this.name = name;
		this.superpower = superpower;
		this.bounty = bounty;
		this.crimes=crimes;
		this.spHolder=spHolder;
	}

	public int getVillId() {
		return villId;
	}

	public void setVillId(int villId) {
		this.villId = villId;
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

	public List<Crime> getCrimes() {
		return crimes;
	}

	public void setCrimes(List<Crime> crimes) {
		this.crimes = crimes;
	}

	public SuperPrison getSpHolder() {
		return spHolder;
	}

	public void setSpHolder(SuperPrison spHolder) {
		this.spHolder = spHolder;
	}

	@Override
	public String toString() {
		return "SuperVillian [villId=" + villId + ", name=" + name + ", superpower=" + superpower + ", bounty=" + bounty
				+ ", crimes=" + crimes + ", spHolder=" + spHolder.getName() + "]";
	}

}
