package com.example.repository;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Food;

@Transactional
@Repository("foodDao")
public class FoodRepository {

	private SessionFactory sesFact;
	
	public FoodRepository(){
		
	}
	
	
	
	@Autowired
	public FoodRepository(SessionFactory sesFact) {
		super();
		this.sesFact=sesFact;
	}
	
	//@Transactional// this marks this method to be managed by transcation manager
	public void insert(Food food) {
		
		sesFact.getCurrentSession().save(food);
	}
	
	//@Transactional
	public Food selectById(int id) {
		return sesFact.getCurrentSession().get(Food.class,id);
		
	}
	
	//@Transactional
	public List<Food> selectAll() {
		return sesFact.getCurrentSession().createQuery("from Food",Food.class).list();
		
	}
	
	//@Transactional
	public Food selectByName(String name) {
		List<Food> fList=new ArrayList<>();
		fList=sesFact.getCurrentSession().createQuery("from Food where food_name='" + name + "'" ,Food.class).list();
		if(fList.size()==0) {
			System.out.println("no food name");
			return null;
		}
		
		return fList.get(0);
		
		
	}
	
	
	
	
	
}
