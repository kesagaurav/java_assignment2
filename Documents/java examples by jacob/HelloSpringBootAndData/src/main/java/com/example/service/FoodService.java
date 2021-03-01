package com.example.service;

import org.springframework.stereotype.Service;

import com.example.model.Food;
import com.example.repository.FoodDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor(onConstructor=@__(@Autowired))
@NoArgsConstructor
public class FoodService {

	private FoodDao foodDao;
	
	public boolean verifyCalories() {
		return false;
	}
	
	public Food  getFoodByName(String name) {
		return foodDao.findByFoodName(name);
	}
	
	
	public List<Food> getAllFood(){
		return foodDao.findAll();
	}
	
	
	public void insertFood(Food food) {
		foodDao.save(food);//the crud reposistory save method is really save or update if you want update or update an record you call save method again
	}
	
	public List<Food> getFoodByCalories(int cal){
		return foodDao.findByCalories(cal);
	}
	
	public Food getFoodByNameAndCal(String name,int cal) {
		return foodDao.findByFoodNameAndCalories(name, cal);
	}
	
	public void deleteFood(Food food) {
		foodDao.delete(food);
		
	}
	
	
}
