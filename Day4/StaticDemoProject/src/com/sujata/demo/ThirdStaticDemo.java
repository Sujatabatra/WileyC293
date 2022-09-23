package com.sujata.demo;

public class ThirdStaticDemo {

	public void show() {
		System.out.println("Hi I am show method");
	}
	
	static private void display() {
		System.out.println("Hi I am display method");
	}
	
	public static void main(String[] args) {
		display();
//		show();
		
		ThirdStaticDemo obj=new ThirdStaticDemo();
		obj.show();

	}

}
