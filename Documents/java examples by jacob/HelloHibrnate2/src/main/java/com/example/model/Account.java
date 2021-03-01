package com.example.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Account {

	@Column(name="accountnumber")
	private int accountnumber;
	
	@OneToMany(mappedBy="clientid",fetch=FetchType.EAGER)
	@JoinColumn(name="clienid_fk")
	private Client clientid;

	
	
	
	public Account() {
		super();
	}

	public Account(int accountnumber,Client clientid) {
		super();
		this.accountnumber = accountnumber;
		this.clientid=clientid;
	}

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	
	
	
	

	public Client getClientid() {
		return clientid;
	}

	public void setClientid(Client clientid) {
		this.clientid = clientid;
	}

	@Override
	public String toString() {
		return "Account [accountnumber=" + accountnumber + ", clientid=" + clientid + "]";
	}

	
	
	
	
	
	
	
}
