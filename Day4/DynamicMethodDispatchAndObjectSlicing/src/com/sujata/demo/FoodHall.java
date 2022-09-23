package com.sujata.demo;

public class FoodHall {

	public void buyPopCorn(PopCorn popCorn) {
		System.out.println("Kindly Pay :"+popCorn.getPrice());
		System.out.println("Qunatity Received : "+popCorn.getQuantity());
		
		popCorn.pop();
	}
}
