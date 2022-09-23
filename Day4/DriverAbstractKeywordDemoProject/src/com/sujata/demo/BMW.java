package com.sujata.demo;

public class BMW extends Car {

	public BMW(String color, String model) {
		super(color, model);
	}
	
	
	public void bmwEngine() {
		System.out.println("BMW Engine goes BOOOOOOM!");
	}
	
	@Override
	public void engine() {
		bmwEngine();
	}

}
