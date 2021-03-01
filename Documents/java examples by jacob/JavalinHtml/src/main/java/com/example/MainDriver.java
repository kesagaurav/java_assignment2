package com.example;

import io.javalin.Javalin;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Javalin app=Javalin.create(config->{
			config.addStaticFiles("/html");
			config.addStaticFiles("/images");
		});
		app.start(9090);
		
	
	
	}

}
