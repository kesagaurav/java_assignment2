package com.example.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Client")
public class Client {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="name")
	private String name;
	
	@Column(name="accno")
	private int accno;
	@Column(name="branch")
	private String branch;
	@OneToMany(mappedBy="client",fetch=FetchType.EAGER)
	private List<Gaurav> gaurav;
	
	public Client(int id, String name, int accno, String branch, List<Gaurav> gaurav) {
		super();
		this.id = id;
		this.name = name;
		this.accno = accno;
		this.branch = branch;
		this.gaurav = gaurav;
	}
	public Client(String name, int accno, String branch,List<Gaurav> gaurav) {
		super();
		this.name = name;
		this.accno = accno;
		this.branch = branch;
		this.gaurav = gaurav;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public List<Gaurav> getGaurav() {
		return gaurav;
	}
	public void setGaurav(List<Gaurav> gaurav) {
		this.gaurav = gaurav;
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", accno=" + accno + ", branch=" + branch + ", gaurav=" + gaurav
				+ "]";
	}
	
	
	
}




class ClientThread extends Thread{
	private Client client;

	public ClientThread(Client client) {
		super();
		this.client = client;
	}
	
	public void run() {
		client.getClass();
	}
	
	
	
}
