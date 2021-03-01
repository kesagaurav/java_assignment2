package com.example.dao;

import java.util.List;

import com.example.model.User;

public interface GenericDao<E> {
	public List<User> findByName(String name);
	public E findById(int id);
	public void insert(E entity);
	
	
	
}
