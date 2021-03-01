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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="SuperHero")
public class SuperHero {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="firstname")
	private String firstname;
	@Column(name="lastname")
	private String lastname;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="villian_FK")
	private List<SuperVillian> villian;
	
	
	
	public SuperHero() {
		super();
		// TODO Auto-generated constructor stub
		}
	
	public SuperHero(String firstname, String lastname,List<SuperVillian> villian) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.villian=villian;
	}
	
	
	
	public SuperHero(int id, String firstname, String lastname,List<SuperVillian> villian) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.villian=villian;
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
	
	public List<SuperVillian> getVillian() {
		return villian;
	}

	public void setVillian(List<SuperVillian> villian) {
		this.villian = villian;
	}

	@Override
	public String toString() {
		return "SuperHero [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", villian=" + villian
				+ "]";
	}

	
	
	
	
	
	
	
	
}
