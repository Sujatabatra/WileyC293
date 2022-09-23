package com.sujata.demo;

/*
 * 1. abstract can be a class or a method
 * 2. if any class is having even one abstract method then it is mandatory for us to mark that class as abstract
 * 3. if a class is abstract, we can't instantiate(object creation) that class.
 * 4. abstract methods don't have body not even blank body, because abstract methods are like contract to child classes,
 *    which child classes are supposed to fulfill by implementing abstract methods
 */
abstract public class Car {

	private String color, model;

	public Car(String color, String model) {
		super();
		this.color = color;
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	//contract for child classes
	abstract public void engine() ;
}
