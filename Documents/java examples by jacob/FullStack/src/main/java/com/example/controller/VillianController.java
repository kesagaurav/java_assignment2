package com.example.controller;

import com.example.model.SuperVillian;
import com.example.service.VillianService;

import io.javalin.http.Handler;

public class VillianController {

	private VillianService vserv;

	public Handler postLogin=(ctx)->{
		
	//	System.out.println(ctx.body());
		if(vserv.powerVerify(ctx.formParam("villianname"), ctx.formParam("superpower"))){
			System.out.println("\n power is verified");
			ctx.sessionAttribute("vill",vserv.getVillian(ctx.formParam("villianname")));
			ctx.redirect("/html/home.html");
		}
		else {
			System.out.println("\n power is not verified");
			ctx.redirect("/html/unsuccesful.html");
		}
	};
	
	public Handler getSessvill=(ctx)->{
		System.out.println((SuperVillian)ctx.sessionAttribute("vill"));
		SuperVillian vill=(SuperVillian)ctx.sessionAttribute("vill");
		ctx.json(vill);
	
	
	};
	
	
	public VillianController() {
		super();
	}

	public VillianController(VillianService vserv) {
		super();
		this.vserv = vserv;
	}
	
	
	
}
