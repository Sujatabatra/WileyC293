package com.sujata.demo;

import java.util.function.Consumer;

@FunctionalInterface
interface Wish {
	void greet(String name);
}

public class MySecondDemo {

	public static void main(String[] args) {
		Wish wish1 = new Wish() {
			@Override
			public void greet(String name) {
				System.out.println("Welcome " + name);

			}
		};

		wish1.greet("Sergiu");

//		Wish wish2 = (String name) -> {
//			System.out.println("Welcome " + name);
//
//		};
//		Wish wish2 = (String name) ->System.out.println("Welcome " + name);
		
//		Wish wish2 = (name) ->System.out.println("Welcome " + name);
		
		Wish wish2 = name ->System.out.println("Welcome " + name);
		wish2.greet("Cameron");
		
		Consumer<String> wish3=name->System.out.println("Welcome "+name);
		wish3.accept("Sam");
	}

}
