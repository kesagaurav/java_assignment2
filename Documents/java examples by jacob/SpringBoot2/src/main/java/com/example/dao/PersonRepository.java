package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.model.Person;

public interface PersonRepository extends CrudRepository<Person,Integer> {

	@Query("Select p from Person p")
	public List<Person> getAllperson();
	
	@Query("Select p from Person p WHERE p.name=:n and p.location=:c")
	public List<Person> getPersonByName(@Param("n") String name,@Param("c") String location);
		
		@Query(value="select * from person",nativeQuery=true)
		public List<Person> getPersons();


}
