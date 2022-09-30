package com.sujata.demo;

@FunctionalInterface
interface Greet {
	void print();
//	void xyz();
}

public class MyFirstDemo {

	public static void main(String[] args) {
		Greet greet = new Greet() {
			@Override
			public void print() {
				System.out.println("Hi from Anonymous Innner class");

			}
		};
		greet.print();

//		Greet greet1 =()-> {
//				System.out.println("Hi from Lambda Functions");
//			};
//		
		Greet greet1 =()-> System.out.println("Hi from Lambda Functions");
		
		greet1.print();
	}

}
