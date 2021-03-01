package com.example.service;

import com.example.dao.ReimbursementDao;
import com.example.dao.ReimbursementTypeAndReimbursementDao;
import com.example.model.Reimbursement;
import com.example.model.ReimbursementTypeAndReimbursementStatus;
import com.example.model.User;

public class ReimbursementTypeService {
private ReimbursementTypeAndReimbursementDao rudao;
	
	public ReimbursementTypeService() {
		super();
	}

	public ReimbursementTypeService(ReimbursementTypeAndReimbursementDao  rudao) {
		super();
		this.rudao = rudao;
	}
	
	
	public ReimbursementTypeAndReimbursementStatus getDescription(String description) {
		ReimbursementTypeAndReimbursementStatus rus=rudao.getDescription(description);
	
		if(rus==null)
		{
			throw new NullPointerException();
		}
		
		return rus;
		
	}
	

	public ReimbursementTypeAndReimbursementStatus getAccount(double reimb_amount) {
		ReimbursementTypeAndReimbursementStatus rus1=rudao.getAccount(reimb_amount);
	
		if(rus1==null)
		{
			throw new NullPointerException();
		}
		
		return rus1;
		
	}
	
	
	
	
	
	
	public boolean  reimbVerify(String description,String reimb_type,double reimb_amount) {
		boolean isVerified=false;
		ReimbursementTypeAndReimbursementStatus rus=getDescription(description);
		ReimbursementTypeAndReimbursementStatus rus1=getAccount(reimb_amount);
		if(rus.getReimb_type().equals(reimb_type)) {
			isVerified=true;
		}
	
		return isVerified;
}
}
