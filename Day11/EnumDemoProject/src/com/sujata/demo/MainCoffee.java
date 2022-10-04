package com.sujata.demo;

public class MainCoffee {

	public static void main(String args[]) {
		Coffee coffee=Coffee.AMERICANO;
		
		System.out.println("We are serving you "+coffee.getQuantity()+" ounces of "+coffee.getName()+" in money values "+coffee.getPrice());
	}
}
