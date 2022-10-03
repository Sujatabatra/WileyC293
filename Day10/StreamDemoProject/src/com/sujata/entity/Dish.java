package com.sujata.entity;

public class Dish {

	private String dishName;
	private int calories;
	private boolean vegetarian;
	private double price;
	
	public Dish() {
		
	}

	public Dish(String dishName, int calories, boolean vegetarian, double price) {
		super();
		this.dishName = dishName;
		this.calories = calories;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Dish [dishName=" + dishName + ", calories=" + calories + ", vegetarian=" + vegetarian + ", price="
				+ price + "]";
	}
	
	
}
