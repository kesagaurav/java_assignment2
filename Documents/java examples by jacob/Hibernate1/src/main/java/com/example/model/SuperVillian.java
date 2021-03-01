package com.example.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="SuperVillian")
public class SuperVillian {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="firstname")
	private String firstname;
	@Column(name="lastname")
	private String lastname;
	//@OneToOne(mappedBy="villian",fetch=FetchType.EAGER)
	//private SuperHero hero;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private SuperHero hero;
	
	
	public SuperVillian(int id, String firstname, String lastname,SuperHero hero) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.hero=hero;
	}
	public SuperVillian(String firstname, String lastname,SuperHero hero) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.hero=hero;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public SuperHero getHero() {
		return hero;
	}
	public void setHero(SuperHero hero) {
		this.hero = hero;
	}
	
	@Override
	public String toString() {
		return "SuperVillian [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", hero=" + hero
				+ "]";
	}

	
	
	
	
}
