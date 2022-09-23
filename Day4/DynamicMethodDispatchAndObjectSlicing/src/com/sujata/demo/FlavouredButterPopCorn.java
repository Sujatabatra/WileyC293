package com.sujata.demo;

public class FlavouredButterPopCorn extends ButterPopCorn {

	private String type;

	public FlavouredButterPopCorn(int quantity, int price, int butterQuantity, String type) {
		super(quantity, price, butterQuantity);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public void pop() {
		System.out.println("Butterly PopCorn Popping with "+getButterQuantity()+" ounces of "+type+" butter!");
	}
}
