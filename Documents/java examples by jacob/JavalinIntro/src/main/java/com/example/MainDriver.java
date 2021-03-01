package com.example;

import com.example.controller.FoodController;

import io.javalin.Javalin;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Javalin app=Javalin.create();
		
		app.start(9001);
		
		
		app.get("/hello", (ctx)->{
			ctx.result("\n hello world");
		});
		
		
		app.get("/foods/:id", FoodController.FOODGET);
		app.get("/foods", FoodController.FOODGET2);
		app.post("/foods", FoodController.FOODPOST);
	
	
	}
	

}
