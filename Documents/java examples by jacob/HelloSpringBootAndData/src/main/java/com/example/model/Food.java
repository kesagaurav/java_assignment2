package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor 
@ToString 
@Entity 
@Table(name="Food")
public class Food {

	@Id
	@Column(name="food_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int food_id;
	@Column(name="food_name",unique=true,nullable=false)
	private String foodName;
	@Column(name="calories",nullable=false)
	private int calories;
	
	public Food(String foodName, int calories) {
		super();
		this.foodName = foodName;
		this.calories = calories;
	}
	

	




}
