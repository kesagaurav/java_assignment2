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
@Table(name="ReimbursementStatus")
public class ReimbursementStatus {

	@Id
	@Column(name="reimb_status_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int reimb_status_id;
	
	@Column(name="reimb_status")
	private String reimb_status;
	
	@OneToMany(mappedBy="rem1",fetch=FetchType.EAGER)
	private  List<Reimbursement> reimb;



	
	
	
	
	
	public ReimbursementStatus() {
		super();
	}


	public ReimbursementStatus(String reimb_status,List<Reimbursement> reimb) {
		super();
		//this.reimb_status_id = reimb_status_id;
		this.reimb_status = reimb_status;
		this.reimb = reimb;
	}

	
	public ReimbursementStatus(int reimb_status_id, String reimb_status,List<Reimbursement> reimb) {
		super();
		this.reimb_status_id = reimb_status_id;
		this.reimb_status = reimb_status;
		this.reimb=reimb;
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

	public List<Reimbursement> getReimb() {
		return reimb;
	}

	public void setReimb(List<Reimbursement> reimb) {
		this.reimb = reimb;
	}

	@Override
	public String toString() {
		return "ReimbursementStatus [reimb_status_id=" + reimb_status_id + ", reimb_status=" + reimb_status + ", reimb="
				+ reimb + "]";
	}
	
}
