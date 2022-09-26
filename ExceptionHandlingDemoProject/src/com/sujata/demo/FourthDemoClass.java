package com.sujata.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

class MyDivide{
	
	public void divide(int number1,int number2) {
		try {
			int result=number1/number2; //10/0
			System.out.println("Division Result : "+result);
			System.out.println("Good Bye From try of divide method");
		}
		catch(NegativeArraySizeException exception) {
			exception.printStackTrace();
		}
	}
	
	public void input() {
		Scanner scanner=new Scanner(System.in);
		try {
			System.out.println("Enter First No. : ");
			int num1=scanner.nextInt();
			System.out.println("Enter Second No. : ");
			int num2=scanner.nextInt();
			
			divide(num1,num2);
		}
		catch(InputMismatchException exception) {
			System.out.println("You can only input integer Value....");
		}
	}
}
public class FourthDemoClass {

	public static void main(String[] args) {
		try {
			MyDivide myDivide=new MyDivide();
			myDivide.input();
		}
		catch(ArithmeticException exception) {
			System.out.println("Undefined!");
		}

	}

}
