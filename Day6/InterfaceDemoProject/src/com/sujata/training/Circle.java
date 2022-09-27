package com.sujata.training;

import com.sujata.demo.DoubleInput;
import com.sujata.demo.RoundedShape;
import com.sujata.demo.RoundedShapeDisplay;
import com.sujata.demo.Shape;

public class Circle extends DoubleInput implements Shape, RoundedShape, RoundedShapeDisplay {

	private double area,circumference;
	
	private static final double PI=3.142;
	
	public Circle() {
		super();
	}

	public Circle(double value) {
		super(value);
	}

	@Override
	public void displayarea() {
		System.out.println("Area of Circle : "+area);

	}

	@Override
	public void displayCircumference() {
		System.out.println("Circumference of Circle : "+circumference);

	}

	@Override
	public void circumference() {
		circumference=2*PI*getValue();

	}

	@Override
	public void area() {
		area=PI*getValue()*getValue();

	}

}
