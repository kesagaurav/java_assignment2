package com.example.controller;

import com.example.model.Reimbursement;
import com.example.model.ReimbursementTypeAndReimbursementStatus;
import com.example.service.ReimbursementTypeService;

import io.javalin.http.Handler;

public class ReimbursementTypeAndStatus {

private  ReimbursementTypeService ruserv; 
	
	public Handler postLogin=(ctx)->{
		if(ruserv.reimbVerify(ctx.formParam("description"),ctx.formParam("type"),Double.parseDouble(ctx.formParam("reimb_amount")))) {
			
			System.out.println("\n reimbursementstatusandtype  is verified");
			ctx.sessionAttribute("rus",ruserv.getDescription("description"));
			ctx.redirect("/html/reim.html");
		}else {
			System.out.println("\n reimbursement is not verified");
			ctx.redirect("/html/reimbdenied.html");
		}
	};

	
	public Handler getSessrus=(ctx)->{
		System.out.println((ReimbursementTypeAndReimbursementStatus)ctx.sessionAttribute("rus"));
		ReimbursementTypeAndReimbursementStatus rus=(ReimbursementTypeAndReimbursementStatus)ctx.sessionAttribute("rus");
		ctx.json(rus);
	
	
	};
	


	public ReimbursementTypeAndStatus() {
		super();
	}

	public ReimbursementTypeAndStatus(ReimbursementTypeService ruserv) {
		super();
		this.ruserv = ruserv;
	}
	

	
	
	
	
}
