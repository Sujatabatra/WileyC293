package com.batra.training;

import com.sujata.demo.NonRoundedShape;

public class ShapeStatistics2DShapes {

	private NonRoundedShape shape;

	public ShapeStatistics2DShapes(NonRoundedShape shape) {
		super();
		this.shape = shape;
	}
	
	public void showStatistics() {
		shape.area();
		shape.displayArea();
		shape.perimeter();
		shape.displayPerimeter();
	}
	
}
