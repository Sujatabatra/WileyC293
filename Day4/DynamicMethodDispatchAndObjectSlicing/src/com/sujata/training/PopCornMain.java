package com.sujata.training;

import com.sujata.demo.ButterPopCorn;
import com.sujata.demo.FlavouredButterPopCorn;
import com.sujata.demo.FoodHall;
import com.sujata.demo.PopCorn;

public class PopCornMain {

	public static void main(String[] args) {
		
		//Base Class Reference Variable
		PopCorn popCorn;  
		
		popCorn=new ButterPopCorn(5, 10, 2);
		
		popCorn.pop();
		
//		popCorn.getButterQuantity();
		
		FoodHall c293FoodStore=new FoodHall();
		c293FoodStore.buyPopCorn(new FlavouredButterPopCorn(5, 8, 3, "Salted"));
		
	}

}
