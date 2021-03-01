package com.example.client;

import java.io.Serializable;

public class Client implements Serializable{

	String firstname;
	String lastname;
	int id;
	
	public Client() {
	
	}
	public Client(int id, String lastname, String firstname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Client [firstname=" + firstname + ", lastname=" + lastname + ", id=" + id + "]";
	}
	

	
	

}
