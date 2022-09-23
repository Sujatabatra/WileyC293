package com.sujata.demo;

/*
 * 1. final can be a variable, method or class
 * 2. If variable is final, then variable becomes constant i.e non changeable
 * 3. If method is final, then we can't override that method
 * 4. If class is final, then we can't extend final class 
 */

class BaseA{
	
//	final int value1=10;
	final int value1;
	int value2;
	
	
	public BaseA(int value1) {
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
	
	final public void show() {
		System.out.println("Hi I am BaseA show method!");
	}
	
}

class DerivedA extends BaseA{

	int value3;
	
	public DerivedA(int value1) {
		super(value1);
	}

	public int getValue3() {
		return value3;
	}

	public void setValue3(int value3) {
		this.value3 = value3;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Value 3:"+value3);
	}
	
	@Override
	public void show() {
		System.out.println("Hi I am DerivedA show method!");
	}
	
}
public class SecondDemo {

	public static void main(String[] args) {
//		String name="Sujata";
//		System.out.println(name.length());
//		System.out.println(name.toUpperCase());

	}

}
