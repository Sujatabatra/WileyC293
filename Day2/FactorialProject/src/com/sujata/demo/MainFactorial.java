package com.sujata.demo;

public class MainFactorial {

	public static void main(String[] args) {
		Factorial factorial=new Factorial();
		
		factorial.setNumber(4);

		System.out.println("Factorial : "+factorial.getFactorial());

	}

}
