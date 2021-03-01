package com.example.controller;

import java.util.LinkedHashMap;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Food;
import com.example.repository.FoodDao;
import com.example.service.FoodService;
import com.example.validator.FoodValidator;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController
@RequestMapping(value="/foods")
@AllArgsConstructor(onConstructor=@__(@Autowired))
@NoArgsConstructor
public class FoodController {

	private FoodService foodServ;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new FoodValidator());
	}
	
//	@PostMapping()
//	public ResponseEntity<String> insertFood(@RequestBody LinkedHashMap fmap) {
//		Food food=new Food((String)fmap.get("foodName"),Integer.parseInt((String)fmap.get("calories")));
//		foodServ.insertFood(food);
//		return new ResponseEntity<>("Response was created",HttpStatus.I_AM_A_TEAPOT);
//	}

	
		@PostMapping("/validate")
		public ResponseEntity<String> insertFood2(@RequestBody  @Valid Food food,BindingResult result){
		System.out.println(food);
		if(result.hasErrors()) {
			System.out.println("Errors we had");
			System.out.println(result.getFieldError());
			return new ResponseEntity<>(result.getFieldError().getCode() + " " + result.getFieldError().getDefaultMessage(),HttpStatus.NOT_ACCEPTABLE);
		}
		foodServ.insertFood(food);
		return new ResponseEntity<>("resource created",HttpStatus.CREATED);
		}
	

		@GetMapping("/{name}")
		public ResponseEntity<Food> getFoodByName(@PathVariable("name") String name){
			if(foodServ.getFoodByName(name)==null) {
				return new ResponseEntity<>(foodServ.getFoodByName(name),HttpStatus.NOT_FOUND);
			}
			
			return new ResponseEntity<>(foodServ.getFoodByName(name),HttpStatus.OK);
		}

		@DeleteMapping("/{foodName}")
		public ResponseEntity<String> deleteFood(@PathVariable("foodName") String name){
			Food food=foodServ.getFoodByName(name);
			foodServ.deleteFood(food);
			return new  ResponseEntity<>("resource deleted",HttpStatus.GONE);
		}





}
