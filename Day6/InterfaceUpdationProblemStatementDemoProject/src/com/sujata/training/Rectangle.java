package com.sujata.training;

import com.sujata.demo.NonRoundedShape;

public class Rectangle implements NonRoundedShape {

	private int length, breadth;
	private int area,perimeter;
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void area() {
		area=length*breadth;
	}

	@Override
	public void displayArea() {
		System.out.println("Area of Rectangle : "+area);

	}

	@Override
	public void displayPerimeter() {
		System.out.println("Perimeter of Rectangle : "+perimeter);

	}

	@Override
	public void perimeter() {
		perimeter=2*(length+breadth);

	}

}
