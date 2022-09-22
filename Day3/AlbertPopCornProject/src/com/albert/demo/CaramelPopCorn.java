package com.albert.demo;

import com.sujata.training.PopCorn;

public class CaramelPopCorn extends PopCorn {

	public CaramelPopCorn() {
		super();
	
	}

	public CaramelPopCorn(int quantity, int price) {
		super(quantity, price);
	}
	
	@Override
	public void pop() {
		System.out.println("Caramel PopCorn is Poping");
	}
	

}
