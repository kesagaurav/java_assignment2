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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@Table(name="Reimbursement")
public class Reimbursement {

	@Id
	@Column(name="rem_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int remid;
	@Column(name="reimb_account")
	private double reimb_amount;
	
	@Column(name="reimb_submitted")
	private String reimb_submitted1;
	
	@Column(name="reimb_resolved")
	private String reimb_resolved;

	@Column(name="reimb_description")
	private String reimb_description;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="User_FK")
	private User reimbauthor;
	

	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="User1_FK")
	private User reimbresolver;

	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="Status_FK")
	private ReimbursementStatus rem1;
	
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="")
	private ReimbursementType rmt;

	public Reimbursement() {
		//super();
	}

	

	public Reimbursement(double reimb_amount, String reimb_submitted1, String reimb_resolved, String reimb_description,
		User reimbauthor, User reimbresolver, ReimbursementType rmt,ReimbursementStatus rem1) {
	super();
	this.reimb_amount = reimb_amount;
	this.reimb_submitted1 = reimb_submitted1;
	this.reimb_resolved = reimb_resolved;
	this.reimb_description = reimb_description;
	this.reimbauthor = reimbauthor;
	this.reimbresolver = reimbresolver;
	this.rmt = rmt;
	this.rem1=rem1;
}






	public Reimbursement(int remid, double reimb_amount, String reimb_submitted1, String reimb_resolved,
			String reimb_description, User reimbauthor, User reimbresolver,ReimbursementType rmt,ReimbursementStatus rem1) {
		super();
		this.remid = remid;
		this.reimb_amount = reimb_amount;
		this.reimb_submitted1 = reimb_submitted1;
		this.reimb_resolved = reimb_resolved;
		this.reimb_description = reimb_description;
		this.reimbauthor = reimbauthor;
		this.reimbresolver = reimbresolver;
		
		this.rmt=rmt;
		this.rem1=rem1;
		
	}





	


	public int getRemid() {
		return remid;
	}

	public void setRemid(int remid) {
		this.remid = remid;
	}

	public double getReimb_amount() {
		return reimb_amount;
	}

	public void setReimb_amount(double reimb_amount) {
		this.reimb_amount = reimb_amount;
	}

	public String getReimb_submitted1() {
		return reimb_submitted1;
	}

	public void setReimb_submitted1(String reimb_submitted1) {
		this.reimb_submitted1 = reimb_submitted1;
	}

	public String getReimb_resolved() {
		return reimb_resolved;
	}

	public void setReimb_resolved(String reimb_resolved) {
		this.reimb_resolved = reimb_resolved;
	}

	public String getReimb_description() {
		return reimb_description;
	}

	public void setReimb_description(String reimb_description) {
		this.reimb_description = reimb_description;
	}

	public User getReimbauthor() {
		return reimbauthor;
	}

	public void setReimbauthor(User reimbauthor) {
		this.reimbauthor = reimbauthor;
	}

	public User getReimbresolver() {
		return reimbresolver;
	}

	public void setReimbresolver(User reimbresolver) {
		this.reimbresolver = reimbresolver;
	}

	
	
	public ReimbursementStatus getRem1() {
		return rem1;
	}
	public void setRem1(ReimbursementStatus rem1) {
		this.rem1 = rem1;
	}

public ReimbursementType getRmt() {
	return rmt;
}
public void setRmt(ReimbursementType rmt) {
	this.rmt = rmt;
}
	
@Override
public String toString() {
	return "Reimbursement [remid=" + remid + ", reimb_amount=" + reimb_amount + ", reimb_submitted1=" + reimb_submitted1
			+ ", reimb_resolved=" + reimb_resolved + ", reimb_description=" + reimb_description + ", reimbauthor="
			+ reimbauthor + ", reimbresolver=" + reimbresolver + ", rem1=" + rem1 + ", rmt=" + rmt + "]";
}
}



class ReimbursemetThread extends Thread{
	private Reimbursement reim;

	public ReimbursemetThread(Reimbursement reim) {
		super();
		this.reim = reim;
	}
	
	public void run() {
		reim.getClass();
		}
	
}
