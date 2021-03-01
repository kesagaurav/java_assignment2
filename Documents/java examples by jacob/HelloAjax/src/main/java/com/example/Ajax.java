package com.example;

import io.javalin.Javalin;

public class Ajax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Javalin app=Javalin.create(config->{
			config.addStaticFiles("/frontend");
			
		});
		
		app.start(9091);
		
		
	}

}
