package com.example.myapp;

import org.springframework.stereotype.Component;

@Component("appProxy")
public class ProxyApp {

	public ProxyApp() {
		//super();
		// TODO Auto-generated constructor stub
	}

	public int drawCartoon(char a,int b) {
		//System.out.println("\n build enthusiam");
		System.out.println("\n -----drawing cartoon-------");
		System.out.println("eat & nap");
	//	System.out.println("");		System.out.println("eat & nap");
		//System.out.println("");
		return 5;
	}
	
	public void drawAnime(int b) {
		//System.out.println("build enthusiam");
		System.out.println("--drawing mob psycho");
		//System.out.println("eat & nap");
		//System.out.println("take a break");
		//System.out.println("eat & nap");
		//System.out.println("");
	}
	
	public void drawNature() {
		//System.out.println("build enthusiam");
		System.out.println("--drawing some little happy psycho");
		//System.out.println("eat & nap");
		//System.out.println("take a break");
		//System.out.println("eat & nap");
	}
	
	
	public void drawSpace() {
		System.out.println("Spaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaace");
	}
	
	protected void sculptPottery() {
		System.out.println("\n making a mug");
			return ;
	}
	
	
}
