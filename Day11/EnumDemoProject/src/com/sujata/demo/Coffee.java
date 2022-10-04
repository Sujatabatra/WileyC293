package com.sujata.demo;

public enum Coffee {

	CAPPUCCINO(8,100,"Cappuccino"),MOCHA(6,50,"Mocha"),AMERICANO(8,75,"Americano");
	
	
	private Coffee(int quantity, int price, String name) {
		this.quantity = quantity;
		this.price = price;
		this.name = name;
	}
	private int quantity;
	private int price;
	private String name;
	public int getQuantity() {
		return quantity;
	}
	public int getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	
	
}
