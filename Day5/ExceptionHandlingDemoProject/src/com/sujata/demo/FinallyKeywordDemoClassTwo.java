package com.sujata.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyKeywordDemoClassTwo {

	void divide(int number1,int number2) {
	
		try {
			int result=number1/number2;
			System.out.println("Division Result : "+result);
			System.out.println("Good Bye from Try Block of divide method!");
			return;
		}
//		catch (ArithmeticException e) {
//			System.out.println("Undefined");
//		}
		catch (NullPointerException e) {
			System.out.println("Undefined");
		}
		finally {
			System.out.println("Hi I am Finally Block");
		}
		System.out.println("Good Bye from Divide Method");
	}
	
	public static void main(String[] args) {
		FinallyKeywordDemoClassTwo obj=new FinallyKeywordDemoClassTwo();
		Scanner scanner=new Scanner(System.in);
		try {
			System.out.println("Enter First No : ");
			int number1=scanner.nextInt();
			System.out.println("Enter Second No : ");
			int number2=scanner.nextInt();
			
			obj.divide(number1, number2);
		}
		catch(InputMismatchException exception) {
			System.out.println("Something went wrong, please try after sometime!");
		}
//		catch(Exception ex) {
//			System.out.println("Please Try Again!");
//		}

	}

}
