package com.example.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.dao.GenericDao;

@Entity
@Table(name="User")
public class User  {
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userid;
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="email")
	private String email;
	
	
	@OneToMany(mappedBy="reimbauthor",fetch=FetchType.EAGER)
	private List<Reimbursement> reimbursements=new  ArrayList<>();
	
	
	@OneToMany(mappedBy="reimbresolver",fetch=FetchType.EAGER)
	private List<Reimbursement> reimbursements2=new  ArrayList<>();
	
	
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="pk_user")
	private ReimbursementUserRole rmu;

	public User() {
		super();
	}

	public User( String username, String password, String firstname, String lastname, String email,
			List<Reimbursement> reimbursements,List<Reimbursement> reimbursements2,ReimbursementUserRole rmu) {
		super();
		//this.userid = userid;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.reimbursements = reimbursements;
		this.rmu = rmu;
		this.reimbursements2 = reimbursements2;
	}
	
	
	public User(int userid,String username, String password, String firstname, String lastname, String email,List<Reimbursement> reimbursements,List<Reimbursement> reimbursements2,ReimbursementUserRole rmu) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.reimbursements = reimbursements;
		this.rmu=rmu;
		this.reimbursements2 = reimbursements2;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Reimbursement> getReimbursements1() {
		return reimbursements;
	}

	public void setReimbursements1(List<Reimbursement> reimbursements) {
		this.reimbursements = reimbursements;
	}

	public List<Reimbursement> getReimbursements() {
		return reimbursements2;
	}

	public void setReimbursements(List<Reimbursement> reimbursements2) {
		this.reimbursements = reimbursements;
	}

	
	
	public ReimbursementUserRole getRmu() {
		return rmu;
	}

	public void setRmu(ReimbursementUserRole rmu) {
		this.rmu = rmu;
	}
	

	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", password=" + password + ", firstname="
				+ firstname + ", lastname=" + lastname + ", email=" + email + ", reimbursements=" + reimbursements
				+ ", reimbursements2=" + reimbursements2 + ", rmu=" + rmu + "]";
	}


	

	
	
	
	
	
}
