package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Family")
public class Family {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="father")
	private String father;
	@Column(name="mother")
	private String mother;
	public Family() {
		super();
	}
	public Family(String father, String mother) {
		super();
		this.father = father;
		this.mother = mother;
	}
	public Family(int id, String father, String mother) {
		super();
		this.id = id;
		this.father = father;
		this.mother = mother;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFather() {
		return father;
	}
	public void setFather(String father) {
		this.father = father;
	}
	public String getMother() {
		return mother;
	}
	public void setMother(String mother) {
		this.mother = mother;
	}
	@Override
	public String toString() {
		return "Family [id=" + id + ", father=" + father + ", mother=" + mother + "]";
	}
	
	
	
	
	
	
	
	
}
