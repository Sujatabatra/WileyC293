package com.sujata.training;

import com.sujata.demo.NonRoundedShape;

public class Square implements NonRoundedShape {

	private int side;
	private int area,perimeter;
	
	public Square(int side) {
		super();
		this.side = side;
	}

	@Override
	public void area() {
		area=side*side;
	}

	@Override
	public void displayArea() {
		System.out.println("Area of Square : "+area);

	}

	@Override
	public void displayPerimeter() {
		System.out.println("Perimeter of Square : "+perimeter);

	}

	@Override
	public void perimeter() {
		perimeter=4*side;

	}

}
