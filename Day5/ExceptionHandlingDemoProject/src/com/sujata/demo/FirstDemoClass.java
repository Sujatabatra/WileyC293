package com.sujata.demo;

import java.util.Scanner;

public class FirstDemoClass {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		try {
		System.out.println("Enter First No : ");
		int number1=scanner.nextInt();
		
		System.out.println("Enter Second No : ");
		int number2=scanner.nextInt();
		
		int result = number1/number2; //exception (program will terminate) : abnormal termination
		
		System.out.println("Division Result : "+result);
		}
		//unchecked exception
		catch(ArithmeticException exception) {
			System.out.println("Undefined!");
		}
		System.out.println("Good Bye from main!");

	}

}
