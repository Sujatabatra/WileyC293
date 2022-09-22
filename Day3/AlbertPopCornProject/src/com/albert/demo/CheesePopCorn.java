package com.albert.demo;

import com.sujata.training.PopCorn;

public class CheesePopCorn extends PopCorn {

	
	public CheesePopCorn() {
		super();
		
	}

	public CheesePopCorn(int quantity, int price) {
		super(quantity, price);
	}

	@Override
	public void pop() {
		System.out.println("Cheese PopCorn Popping");
	}
}
