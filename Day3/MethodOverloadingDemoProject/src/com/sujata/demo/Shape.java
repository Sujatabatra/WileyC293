package com.sujata.demo;

public class Shape {

	public void area(int length,int breadth) {
		System.out.println("Area of Rectangle : "+length*breadth);
	}
	
	public void area(int side) {
		System.out.println("Area of Square : "+side*side);
	}
	
	public void area(double radius) {
		System.out.println("Area of Circle : "+3.142*radius*radius);
	}
}
