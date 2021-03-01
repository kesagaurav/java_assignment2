package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component("myAspect")
@Aspect
public class AspectExample {

	public AspectExample() {
		super();
		// TODO Auto-generated constructor stub
	}

	//@Before("execution(* *(..))")
	//@Before("execution(* * (char,int))")
	//@Before("execution(* *aw*(*,int))")
	//@Before("execution(protected * * (..))")
	@Before("execution(* com.example.myapp.ProxyApp.draw*(..))")
	public void buildEnthusiam(JoinPoint jp) {
		System.out.println("\n build enthusiam");
//		System.out.println(jp.getSignature());
//		System.out.println(jp.getArgs());
	}
	
	
	
	@After("execution(* *e(..))")
	public void takeABreak(JoinPoint jp) {
		System.out.println("take a break");
		System.out.println("\n eat and nap");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
