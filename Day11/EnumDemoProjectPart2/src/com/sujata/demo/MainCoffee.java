package com.sujata.demo;

public class MainCoffee {

	public static void main(String args[]) {
		Coffee coffee=Coffee.MOCHA;
		
//		System.out.println("We are serving you "+coffee.getQuantity()+" ounces of coffee in money values "+coffee.getPrice());
		coffee.buyCoffee();
	}
}
