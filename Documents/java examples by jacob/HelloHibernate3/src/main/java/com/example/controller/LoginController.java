package com.example.controller;

import com.example.model.Login;
import com.example.service.LoginService;

import io.javalin.http.Handler;

public class LoginController {

	public LoginService userv; 
public Handler postLogin=(ctx)->{
	

		if(userv.userVerify(ctx.formParam("username"), ctx.formParam("password"))) {
		System.out.println("\n login is verified");
		ctx.sessionAttribute("ls",userv.getUser(ctx.formParam("username")));
		ctx.redirect("/html/reim.html");
	}
	else {
		System.out.println("\n user is not verified");
		ctx.redirect("/html/successful.html");
	}
		};
		
		
		public Handler getSessus=(ctx)->{
			System.out.println((Login)ctx.sessionAttribute("ls"));
			Login ls=(Login)ctx.sessionAttribute("ls");
			ctx.json(ls);
		
		
		};
		
		
		public LoginController() {
			super();
		}

		public LoginController(LoginService userv) {
			super();
			this.userv = userv;
		}
	
	
}
