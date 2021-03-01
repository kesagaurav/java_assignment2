package com.example.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Gaurav")
public class Gaurav {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="accno")
	private int accno;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="Client_FK")
	private Client client;
	
	public Gaurav(int id, String name, int accno, Client client) {
		super();
		this.id = id;
		this.name = name;
		this.accno = accno;
		this.client = client;
	}
	
	public Gaurav(String name, int accno, Client client) {
		super();
		this.name = name;
		this.accno = accno;
		this.client = client;
	}
	
	
	
	

	public long getId() {
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
	
	
	
	
	
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Gaurav [id=" + id + ", name=" + name + ", accno=" + accno + ", client=" + client + "]";
	}
	}
	class gaurav1 extends Thread{
		private Gaurav gaurav;

		public gaurav1(Gaurav gaurav) {
			super();
			this.gaurav = gaurav;
		}
		
		public void run() {
			gaurav.getClass();
		}
		
		
	}

