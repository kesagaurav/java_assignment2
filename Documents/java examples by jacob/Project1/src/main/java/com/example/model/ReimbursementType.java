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
@Table(name="ReimbursementType")
public class ReimbursementType {

	@Column(name="reimb_type_id")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int reimb_type_id;
	
	@Column(name="reimb_type")
	private String reimb_type;
	
	@OneToMany(mappedBy="rmt",fetch=FetchType.EAGER)
	private List<Reimbursement> rmt1;

	public ReimbursementType() {
		super();
	}

	
	public ReimbursementType( String reimb_type,List<Reimbursement> rmt1 ) {
		super();
		//this.reimb_type_id = reimb_type_id;
		this.reimb_type = reimb_type;
		this.rmt1 = rmt1;
	}
	
	
	
	
	public ReimbursementType(int reimb_type_id, String reimb_type,List<Reimbursement> rmt1) {
		super();
		this.reimb_type_id = reimb_type_id;
		this.reimb_type = reimb_type;
		this.rmt1 = rmt1;
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

	public List<Reimbursement> getRmt1() {
		return rmt1;
	}

	public void setRmt1(List<Reimbursement> rmt1) {
		this.rmt1 = rmt1;
	}

	@Override
	public String toString() {
		return "ReimbursementType [reimb_type_id=" + reimb_type_id + ", reimb_type=" + reimb_type + ", rmt1=" + rmt1
				+ "]";
	}
	
	
	
}
