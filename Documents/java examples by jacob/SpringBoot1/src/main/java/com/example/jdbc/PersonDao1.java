package com.example.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.dao.PersonDao;
import com.example.model.Person;

@Repository
public class PersonDao1 implements PersonDao {
	
	JdbcTemplate jdbcTemlate;
	
	@Override
	public void insert(Person person) {
	String sql="insert into values (?,?,?,?)";
	jdbcTemlate.update(sql);
	
		
	}
	
}
