package com.sujata.demo;

public class MySingletonClass {
	
	private static MySingletonClass instance=new MySingletonClass();
	
	//private constructor : No one outside the class will able to create object of this class
	private MySingletonClass() {
		
	}

	public static MySingletonClass getInstance() {
		return instance;
	}

	public void display() {
		System.out.println("Hi I am display with hashcode as "+hashCode());
		
	}
}
