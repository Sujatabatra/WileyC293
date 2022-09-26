package com.sujata.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

class OurDivide{
	
	public void divide(int number1,int number2) {
			int result=number1/number2; //10/0
			System.out.println("Division Result : "+result);
			System.out.println("Good Bye From try of divide method");
		
	}
	
	public void input() {
		Scanner scanner=new Scanner(System.in);
			System.out.println("Enter First No. : ");
			int num1=scanner.nextInt();
			System.out.println("Enter Second No. : ");
			int num2=scanner.nextInt();
			
			divide(num1,num2);
		
	}
}
public class FifthDemoClass {

	public static void main(String[] args) {
		try {
			OurDivide myDivide=new OurDivide();
			myDivide.input();
		}
		catch(ArithmeticException exception) {
			System.out.println("Undefined!");
		}
		catch(InputMismatchException exception) {
			System.out.println("You can only input integer Value....");
		}

	}

}
