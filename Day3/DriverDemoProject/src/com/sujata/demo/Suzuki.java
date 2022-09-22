package com.sujata.demo;

public class Suzuki extends Car {

	public Suzuki(String color, String model) {
		super(color, model);
	}
	
	@Override
	public void engine() {
		System.out.println("Suzuki Engine goes SOOOOOOM!");
	}

}
