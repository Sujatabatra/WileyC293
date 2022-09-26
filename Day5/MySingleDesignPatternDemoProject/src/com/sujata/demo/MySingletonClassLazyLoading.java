package com.sujata.demo;

public class MySingletonClassLazyLoading {
	
	private static MySingletonClassLazyLoading instance;
	
	//private constructor : No one outside the class will able to create object of this class
	private MySingletonClassLazyLoading() {
		
	}

	public static MySingletonClassLazyLoading getInstance() {
		if(instance==null) {
			instance=new MySingletonClassLazyLoading();
		}
		return instance;
	}

	public void display() {
		System.out.println("Hi I am display with hashcode as "+hashCode());
		
	}
}
