package com.sujata.demo;

public class PopCornMain {

	public static void main(String[] args) {
//		PopCorn popCorn=new PopCorn();
//		popCorn.pop();
//		System.out.println("In Money Value "+popCorn.getPrice());
//		
//		
//		popCorn=new ButterPopCorn();
//		popCorn.pop();
//		System.out.println("In Money Value "+popCorn.getPrice());
	
		FoodHall foodHall=new FoodHall();
		foodHall.buyPopCorn(new ButterPopCorn());
		
	
		foodHall.buyPopCorn(new PopCorn() {
			@Override
			public void pop() {
				System.out.println("Peppery Butter popcorn is Popping");
			}
			
//			@Override
			public int getPrice() {
				return 100;
			}
			
		});
		
	}

}
