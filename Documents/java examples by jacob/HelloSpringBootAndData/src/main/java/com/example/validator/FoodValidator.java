package com.example.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.example.model.Food;

public class FoodValidator implements Validator {

	


	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Food.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "foodName", "foodName.empty","foodname must have value");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "calories", "field.required","calories must have value");
		Food food=(Food) target;
		if(food.getCalories()<0) {
			errors.rejectValue("calories", "negative.value","I wish you should not have negative value");
		}else if(food.getCalories()>3000) {
			errors.rejectValue("calories", "tooDangMuch","thats a bit much,dont ya think");
	
	}
	}
}
