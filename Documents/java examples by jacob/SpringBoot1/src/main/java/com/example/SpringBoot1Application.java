package com.example;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.jdbc.PersonDao1;
import com.example.model.Person;

@SpringBootApplication
public class SpringBoot1Application {

		@Autowired
		static PersonDao1 dao;
	
		public static void main(String[] args) {
		
		SpringApplication.run(SpringBoot1Application.class, args);
		Person person=new Person();
		person.setId(0);
		person.setName("gaurav");
		person.setLocation("warangal");
		person.setBirth_year("19-11-1998");
		
		dao.insert(person);
	}

	

	
	
}
