package com.example;

import io.javalin.Javalin;

public class Intro {

	
	public static void main(String[] args) {

		Javalin app=Javalin.create(config->{
			config.addStaticFiles("/frontend");
		});
		
		app.start(9000);
	}
	
	
	
	
}
