package com.sujata.demo;

public class MainClass {

	public static void main(String[] args) {
		Car audi1=new Audi("Red", "A8");
		Car audi2=new Audi("Black", "A6");
		
		Car bmw1=new BMW("Blue", "Q5");
		Car bmw2=new BMW("Silver", "Q6");
		
		audi1.engine();
		audi2.engine();
		
		bmw1.engine();
		bmw2.engine();
		
		SportsCar sportsCar=new SportsCar(audi2);
		sportsCar.nitroxEngine();

	}

}
