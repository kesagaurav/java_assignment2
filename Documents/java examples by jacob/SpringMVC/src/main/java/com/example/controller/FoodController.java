package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.Food;
import com.example.repository.FoodRepository;

@Controller
@RequestMapping(path="/foodcontroller")
@CrossOrigin(origins="*")
public class FoodController {
	private FoodRepository foodRepo;
	
	public FoodController() {
	}
	@Autowired
	public FoodController(FoodRepository foodRepo) {
		super();
		this.foodRepo = foodRepo;
	}

	@RequestMapping(value="/foods",method=RequestMethod.GET)
	public  @ResponseBody List<Food> getAllFoods(){
		return foodRepo.selectAll();
	}
	

	@PostMapping(value="/foods/id",produces="application/json")

	public ResponseEntity<Food> getFoodById(int id){
		return new ResponseEntity<Food>(foodRepo.selectById(id),HttpStatus.I_AM_A_TEAPOT);
	}
	
}
