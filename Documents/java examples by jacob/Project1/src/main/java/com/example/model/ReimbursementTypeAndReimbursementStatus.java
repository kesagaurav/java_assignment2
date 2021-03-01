package com.example.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
@Table(name="ReimbursementTypeAndReimbursementStatus")
public class ReimbursementTypeAndReimbursementStatus implements Serializable {
	@Id
	@Column(name="rem_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int remid;
	
	@Column(name="reimb_account")
	private double reimb_amount;
	
	
	@Column(name="reimb_submitted1")
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(shape=Shape.STRING,pattern="dd-MM-yyyy")
	private Date reimb_submitted1;
	
	
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(shape=Shape.STRING,pattern="dd-MM-yyyy")
	@Column(name="reimb_resolved1")
	private Date reimb_resolved1;

	@Column(name="reimb_description")
	private String reimb_description;
	
	@Id
	@Column(name="reimb_status_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int reimb_status_id;
	
	@Column(name="reimb_status")
	private String reimb_status;
	
	
	@Column(name="reimb_type_id")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int reimb_type_id;
	
	@Column(name="reimb_type")
	private String reimb_type;

	public ReimbursementTypeAndReimbursementStatus(double reimb_amount, String reimb_description, String reimb_status,
			String reimb_type,Date reimb_resolved1,Date reimb_submitted1  ) {
		super();
		this.reimb_amount = reimb_amount;
		this.reimb_description = reimb_description;
		this.reimb_status = reimb_status;
		this.reimb_type = reimb_type;
		this.reimb_resolved1=reimb_resolved1;
		this.reimb_submitted1=reimb_submitted1;
	}

	public ReimbursementTypeAndReimbursementStatus(int remid, String reimb_description, String reimb_status, String reimb_type) {
		super();
		this.remid = remid;
		this.reimb_amount = reimb_amount;
		this.reimb_submitted1 = reimb_submitted1;
		this.reimb_resolved1 = reimb_resolved1;
		this.reimb_description = reimb_description;
		this.reimb_status_id = reimb_status_id;
		this.reimb_status = reimb_status;
		this.reimb_type_id = reimb_type_id;
		this.reimb_type = reimb_type;
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

	public Date getReimb_submitted() {
		return reimb_submitted1;
	}

	public void setReimb_submitted(Date reimb_submitted1) {
		this.reimb_submitted1 = reimb_submitted1;
	}

	public Date getReimb_resolved() {
		return reimb_resolved1;
	}

	public void setReimb_resolved(Date reimb_resolved1) {
		this.reimb_resolved1 = reimb_resolved1;
	}

	public String getReimb_description() {
		return reimb_description;
	}

	public void setReimb_description(String reimb_description) {
		this.reimb_description = reimb_description;
	}

	public int getReimb_status_id() {
		return reimb_status_id;
	}

	public void setReimb_status_id(int reimb_status_id) {
		this.reimb_status_id = reimb_status_id;
	}

	public String getReimb_status() {
		return reimb_status;
	}

	public void setReimb_status(String reimb_status) {
		this.reimb_status = reimb_status;
	}

	public int getReimb_type_id() {
		return reimb_type_id;
	}

	public void setReimb_type_id(int reimb_type_id) {
		this.reimb_type_id = reimb_type_id;
	}

	public String getReimb_type() {
		return reimb_type;
	}

	public void setReimb_type(String reimb_type) {
		this.reimb_type = reimb_type;
	}

	@Override
	public String toString() {
		return "ReimbursementTypeAndReimbursementStatus [remid=" + remid + ", reimb_amount=" + reimb_amount
				+ ", reimb_submitted1=" + reimb_submitted1 + ", reimb_resolved1=" + reimb_resolved1 + ", reimb_description="
				+ reimb_description + ", reimb_status_id=" + reimb_status_id + ", reimb_status=" + reimb_status
				+ ", reimb_type_id=" + reimb_type_id + ", reimb_type=" + reimb_type + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
