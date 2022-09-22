package com.sujata.training;

public class PopCorn {

	private int quantity,price;

	public PopCorn() {
		
	}
	
	public PopCorn(int quantity, int price) {
//		super();
		this.quantity = quantity;
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void pop() {
		System.out.println("PopCorn is Popping!");
	}
}
