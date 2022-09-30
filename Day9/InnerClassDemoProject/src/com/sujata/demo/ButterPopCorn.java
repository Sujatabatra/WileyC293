package com.sujata.demo;

public class ButterPopCorn extends PopCorn {

	@Override
	public void pop() {
		System.out.println("Butter PopCorn Popping!");
	}
	
	@Override
	public int getPrice() {
		return 75;
	}
}
