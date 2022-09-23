package com.sujata.demo;

/*
 * 1. final can be a variable, method or class
 * 2. If variable is final, then variable becomes constant i.e non changeable
 * 3. If method is final, then we can't override that method
 * 4. If class is final, then we can't extend final class 
 */

class Base{
	
//	final int value1=10;
	final int value1;
	int value2;
	
	
	public Base(int value1) {
		super();
		this.value1 = value1;
	}

	public void input(int value1,int value2) {
//		this.value1=value1;
		this.value2=value2;
	}
	
	public void display() {
		System.out.println("Value 1:"+value1);
		System.out.println("Value 2:"+value2);
	}
	
}
public class FirstDemo {

	public static void main(String[] args) {
//		String name="Sujata";
//		System.out.println(name.length());
//		System.out.println(name.toUpperCase());

	}

}
