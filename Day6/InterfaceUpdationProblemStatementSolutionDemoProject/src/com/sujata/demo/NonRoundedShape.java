package com.sujata.demo;

public interface NonRoundedShape extends Shape, Show {

	void perimeter();
	
	//Updating interface : by maintaining backward compatibility : introduced in JDK1.8
	default void volume() {
		System.out.println("This shape Don't support volume method!");
	}
	default void displayVolume() {
		System.out.println("This shape don't have volume to display");
	}
}
