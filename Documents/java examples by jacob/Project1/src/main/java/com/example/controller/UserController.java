package com.example.controller;

import io.javalin.http.Handler;


import com.example.model.User;
import com.example.service.UserService;


public class UserController {

private  UserService userv; 
	
	public Handler postLogin=(ctx)->{
		
		if(userv.userVerify(ctx.formParam("name"), ctx.formParam("password"))) {
		System.out.println("\n user is verified");
		ctx.sessionAttribute("us",userv.getUser(ctx.formParam("name")));
		ctx.redirect("/html/reim.html");
	}
	else {
		System.out.println("\n user is not verified");
		ctx.redirect("/html/successful.html");
	}
		};
		
		
		public Handler getSessus=(ctx)->{
			System.out.println((User)ctx.sessionAttribute("us"));
			User us=(User)ctx.sessionAttribute("us");
			ctx.json(us);
		
		
		};
		
		
		public UserController() {
			super();
		}

		public UserController(UserService userv) {
			super();
			this.userv = userv;
		}
		
	
	
	
}
