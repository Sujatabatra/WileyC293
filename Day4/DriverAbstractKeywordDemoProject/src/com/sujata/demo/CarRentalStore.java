package com.sujata.demo;

public class CarRentalStore {

	public static void main(String[] args) {
		Audi audi1=new Audi("Red", "A8");
		BMW bmw1=new BMW("Blue","Q5");
		Suzuki suzuki1=new Suzuki("Silver","Ciaz");
		
		Driver tom=new Driver("Tom");
		Driver jack=new Driver("Jack");
		
		tom.setCar(bmw1);
		tom.drive();

	}

}
