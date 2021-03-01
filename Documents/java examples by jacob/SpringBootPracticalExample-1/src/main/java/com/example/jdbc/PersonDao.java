package com.example.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.model.Person;

@Repository
public class PersonDao {
	@Autowired
	JdbcTemplate jdbctemplate;
	
	public List<Person> findAll(){
		return jdbctemplate.query("select * from person", 
				new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	
}
