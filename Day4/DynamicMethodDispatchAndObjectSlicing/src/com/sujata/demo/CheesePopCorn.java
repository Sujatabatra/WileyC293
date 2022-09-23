package com.sujata.demo;


public class CheesePopCorn extends PopCorn {


	private String typeOfCheese;
	
	public CheesePopCorn() {
		super();
		
	}

	public CheesePopCorn(int quantity, int price) {
		super(quantity, price);
	}
	

	public CheesePopCorn(int quantity, int price, String typeOfCheese) {
		super(quantity, price);
		this.typeOfCheese = typeOfCheese;
	}

	@Override
	public void pop() {
		System.out.println("Cheese PopCorn Popping with "+typeOfCheese+" cheese!");
	}

	public String getTypeOfCheese() {
		return typeOfCheese;
	}

	public void setTypeOfCheese(String typeOfCheese) {
		this.typeOfCheese = typeOfCheese;
	}
	
	
}
