package com.example;

import java.io.Serializable;

public class Hello implements Serializable {

	private String name;
	private int cost;
	private int calories;

public Hello() {
	// TODO Auto-generated constructor stub
}
public Hello(String name, int cost, int calories) {
	super();
	this.name = name;
	this.cost = cost;
	this.calories = calories;
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getCost() {
	return cost;
}

public void setCost(int cost) {
	this.cost = cost;
}

public int getCalories() {
	return calories;
}

public void setCalories(int calories) {
	this.calories = calories;
}

@Override
public String toString() {
	return "Hello [name=" + name + ", cost=" + cost + ", calories=" + calories + "]";
}










}
