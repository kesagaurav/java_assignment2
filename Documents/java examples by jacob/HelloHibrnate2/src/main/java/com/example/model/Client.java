package com.example.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Client")
public class Client {

	@Id
	//@Column(name="clientid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private  Account clientid;
	@Column(name="firstname")
	private String firstname;
	@Column(name="lastname")
	private String lastname;
	@Column(name="address")
	private String address;
	@Column(name="email")
	private String email;
	@Column(name="age")
	private int age;
	@Column(name="profile")
	private String profile;
	
	
	
	
//	public Client() {
//		super();
//	}
	public Client(String firstname, String lastname, String address, String email, int age, String profile) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.email = email;
		this.age = age;
		this.profile = profile;
		
	}
	public Client(Account clientid, String firstname, String lastname, String address, String email, int age,
			String profile) {
		super();
		this.clientid = clientid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.email = email;
		this.age = age;
		this.profile = profile;
		
	}
	public Account getClientid() {
		return clientid;
	}
	public void setClientid(Account clientid) {
		this.clientid = clientid;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	

	@Override
	public String toString() {
		return "Client [clientid=" + clientid + ", firstname=" + firstname + ", lastname=" + lastname + ", address="
				+ address + ", email=" + email + ", age=" + age + ", profile=" + profile + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
