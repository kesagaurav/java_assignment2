package com.example;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class MainDriver {

	public final static Logger log=Logger.getLogger(MainDriver.class);
	
	
	
	public static void main(String[] args) {
	
		log.setLevel(Level.ALL);
		log.trace("tracing");
		log.debug("ok");
		log.info("good");
		log.warn("hi");
		log.error("apples");
		log.fatal("thanos came world with the single snap of his fringer");
		
		
	
	}
	
}
