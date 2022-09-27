package com.batra.training;

import com.sujata.demo.NonRoundedShape;

public class ShapeStatistics3DShape extends ShapeStatistics2DShapes {

	public ShapeStatistics3DShape(NonRoundedShape shape) {
		super(shape);
	}
	
	@Override
	public void showStatistics() {
		super.showStatistics();
		getShape().volume();
		getShape().displayVolume();
	}

}
