package com.example;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.example.dao.PersonRepository;
import com.example.model.Person;


import lombok.AllArgsConstructor;
@AllArgsConstructor
@SpringBootApplication
public class SpringBoot2Application {

	public static void main(String[] args) {
		ApplicationContext Context=SpringApplication.run(SpringBoot2Application.class, args);
	PersonRepository person=Context.getBean(PersonRepository.class);

		
		Optional<Person> option=person.findById(5);
		
		Person p=option.get();
		
		p.setLocation("warangal");
		
		Person p1=person.save(p);
		System.out.println(p1);
		
//		
//	person.deleteById(2);
//	person.deleteById(3);
//	
List<Person> allPersons=person.getAllperson();
		
		allPersons.forEach(person1->{
			System.out.println(person1);
		});
	
		List<Person> allPersons1=person.getPersonByName("gaurav","warangal");
			allPersons1.forEach(e->{
				System.out.println(e);
			});
	
			
			person.getPersons().forEach(e->{
				System.out.println(e);
			});
	
	}
	
	
	
	

}
