package com.sujata.demo;

public class FoodHall {

	public void buyPopCorn(PopCorn popCorn) {
		popCorn.pop();
		System.out.println("In Money Value "+popCorn.getPrice());
	}
}
