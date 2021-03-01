package com.example;

import com.example.controller.VillianController;
import com.example.dao.Villian;
import com.example.dao.VillianDBConnection;
import com.example.service.VillianService;

import io.javalin.Javalin;

public class MainVillian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			VillianController vCon=new VillianController(new VillianService(new Villian(new VillianDBConnection())));
		
		
		
		Javalin app=Javalin.create(config->{
			config.addStaticFiles("/frontend");
		});
		
		app.start(9019);
		
		app.post("/villians/login", vCon.postLogin);
		app.get("/villians/session", vCon.getSessvill);
		
		app.exception(NullPointerException.class, (e,ctx)->{
			ctx.status(404);
			ctx.result("user does not exists");
		});
		
	}

}
