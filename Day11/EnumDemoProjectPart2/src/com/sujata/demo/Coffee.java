package com.sujata.demo;

public enum Coffee {

	CAPPUCCINO(8,100){
		public void buyCoffee() {
			System.out.println("We are serving you "+getQuantity()+" ounces of Cappuccino in money values "+getPrice());
		}
	},MOCHA(6,50){
		public void buyCoffee() {
			System.out.println("We are serving you "+getQuantity()+" ounces of Mocha in money values "+getPrice());
		}
	},AMERICANO(8,75){
		public void buyCoffee() {
			System.out.println("We are serving you "+getQuantity()+" ounces of Americano in money values "+getPrice());
		}
	};
	
	
	private Coffee(int quantity, int price) {
		this.quantity = quantity;
		this.price = price;
	
	}
	private int quantity;
	private int price;
	
	public int getQuantity() {
		return quantity;
	}
	public int getPrice() {
		return price;
	}
	
	abstract public void buyCoffee();
	
}
