package com.example;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.jdbc.PersonDao;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class SpringBootPracticalExample1Application implements CommandLineRunner {
	@Autowired
	PersonDao jdbcdao;
		
	private Logger logger=(Logger) LoggerFactory.getLogger(this.getClass());
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootPracticalExample1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("all users",jdbcdao.findAll());
		
	}

}
