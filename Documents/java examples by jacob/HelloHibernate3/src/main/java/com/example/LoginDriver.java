package com.example;

import io.javalin.Javalin;

public class LoginDriver {

	Javalin app=Javalin.create(config->{
		config.addStaticFiles("/frontend");
	});
	
	
	
}
