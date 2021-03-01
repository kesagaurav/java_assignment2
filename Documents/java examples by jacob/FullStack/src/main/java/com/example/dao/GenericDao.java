package com.example.dao;

public interface GenericDao<E> {

	public E findByName(String name);
	public E findById(int id);
	public void insert(E entity);
	
	
}
