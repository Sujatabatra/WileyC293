package com.sujata.demo;



public class CaramelPopCorn extends PopCorn {

	private int caramelQuantity;
	
	public CaramelPopCorn() {
		super();
	
	}

	public CaramelPopCorn(int quantity, int price) {
		super(quantity, price);
	}
	
	
	public CaramelPopCorn(int quantity, int price, int caramelQuantity) {
		super(quantity, price);
		this.caramelQuantity = caramelQuantity;
	}

	@Override
	public void pop() {
		System.out.println("Butterly PopCorn Popping with "+caramelQuantity+" ounces of caramel ");
	}

	public int getCaramelQuantity() {
		return caramelQuantity;
	}

	public void setCaramelQuantity(int caramelQuantity) {
		this.caramelQuantity = caramelQuantity;
	}
	
	

}
