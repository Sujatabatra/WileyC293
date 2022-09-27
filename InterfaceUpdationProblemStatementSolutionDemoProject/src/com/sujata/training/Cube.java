package com.sujata.training;

import com.sujata.demo.NonRoundedShape;

public class Cube implements NonRoundedShape {

	private int length;
	private int area,perimeter,volume;
	
	public Cube(int length) {
		super();
		this.length = length;
	}

	@Override
	public void area() {
		area=6*(length*length);
	}

	@Override
	public void displayArea() {
		System.out.println("Area of Cube : "+area);

	}

	@Override
	public void displayPerimeter() {
		System.out.println("Perimeter of Cube : "+perimeter);

	}

	@Override
	public void perimeter() {
		perimeter=12*length;

	}
	
	@Override
	public void volume() {
		volume=length*length*length;
	}
	
	@Override
	public void displayVolume() {
		System.out.println("Volume of Cube : "+volume);
	}

}
