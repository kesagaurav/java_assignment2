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

@Entity
@Table(name="ReimbursementUserRole")
public class ReimbursementUserRole {
	@Id
	@Column(name="reimb_type_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int reimb_user_role_id;
	
	@Column(name="user_role")
	private String user_role;
	
	@OneToMany(mappedBy="rmu",fetch=FetchType.EAGER)
	private List<User> user;

	public ReimbursementUserRole() {
		super();
	}

	public ReimbursementUserRole( String user_role,List<User> user) {
		super();
		
		this.user_role = user_role;
		this.user = user;
	}
	
	public ReimbursementUserRole(int reimb_user_role_id, String user_role,List<User> user) {
		super();
		this.reimb_user_role_id = reimb_user_role_id;
		this.user_role = user_role;
		this.user = user;
	}

	public int getReimb_user_role_id() {
		return reimb_user_role_id;
	}

	public void setReimb_user_role_id(int reimb_user_role_id) {
		this.reimb_user_role_id = reimb_user_role_id;
	}

	public String getUser_role() {
		return user_role;
	}

	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "ReimbursementUserRole [reimb_user_role_id=" + reimb_user_role_id + ", user_role=" + user_role
				+ ", user=" + user + "]";
	}
	
	
	
}
