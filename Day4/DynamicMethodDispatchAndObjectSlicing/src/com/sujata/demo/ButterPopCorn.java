package com.sujata.demo;

public class ButterPopCorn extends PopCorn {

	private int butterQuantity;

	public ButterPopCorn() {
		super();

	}

	public ButterPopCorn(int quantity, int price) {
		super(quantity, price);
	}

	public ButterPopCorn(int quantity, int price, int butterQuantity) {
		super(quantity, price);
		this.butterQuantity = butterQuantity;
	}

	@Override
	public void pop() {
		System.out.println("Butterly PopCorn Popping with "+butterQuantity+" ounces of butter ");
	}

	public int getButterQuantity() {
		return butterQuantity;
	}

	public void setButterQuantity(int butterQuantity) {
		this.butterQuantity = butterQuantity;
	}
	
	
}
