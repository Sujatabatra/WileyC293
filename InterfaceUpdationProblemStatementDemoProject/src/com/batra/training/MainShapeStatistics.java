package com.batra.training;

import com.sujata.training.Rectangle;
import com.sujata.training.Square;

public class MainShapeStatistics {

	public static void main(String[] args) {


		ShapeStatistics2DShapes shapeStatistics1=new ShapeStatistics2DShapes(new Rectangle(10, 5));
		shapeStatistics1.showStatistics();

		
		System.out.println("==============================");
		
		ShapeStatistics2DShapes shapeStatistics2=new ShapeStatistics2DShapes(new Square(8));
		shapeStatistics2.showStatistics();
	}

}
