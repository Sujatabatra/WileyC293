package com.albert.demo;

import com.sujata.training.PopCorn;

public class ButterPopCorn extends PopCorn {

	
	public ButterPopCorn() {
		super();
		
	}

	public ButterPopCorn(int quantity, int price) {
		super(quantity, price);
	}

	@Override
	public void pop() {
		System.out.println("Butterly PopCorn Popping");
	}
}
