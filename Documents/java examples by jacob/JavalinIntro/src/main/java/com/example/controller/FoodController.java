package com.example.controller;

import com.example.Hello;

import io.javalin.http.Handler;
import io.javalin.plugin.json.JavalinJson;

public class FoodController {

	public static final Handler FOODGET=(ctx->{
		
		System.out.println(ctx.pathParam("id"));
		ctx.status(200);
		ctx.json(new Hello("noodles",3,1000));
		
	});
	
	public static final Handler FOODGET2=(ctx)->{
		String name=ctx.queryParam("fname");
		System.out.println(name);
		System.out.println(new Hello(name,2,9000));
		
	};
	
	public static final Handler FOODPOST=(ctx)->{
		System.out.println(JavalinJson.fromJson(ctx.body(), Hello.class));
		System.out.println(ctx.body());
	};
	
}
