package com.sujata.demo;

public class SportsCar implements CarContract {

	private Car car;
	
	
	public SportsCar(Car car) {
		super();
		this.car = car;
	}


	public void nitroxEngine() {
		System.out.print("This car have Nitrox engine now =>");
		car.engine();
	}
	
	@Override
	public void engine() {
		car.engine();

	}

}
