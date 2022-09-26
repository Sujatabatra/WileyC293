package com.sujata.demo;

//import java.util.Scanner;

/* default : implicit export
import java.lang.*;
*/
public class UserInputDemo {
	
	public static void main(String args[]) {
		/*java.lang.System.out.println("hello");*/
		
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("Enter Integer no : ");
		int number1=scanner.nextInt();
		
		System.out.println("number1 : "+number1);
	
		System.out.println("Enter Double no : ");
		double number2=scanner.nextDouble();
		
		System.out.println("number2 : "+number2);
		
		System.out.println("Enter Name : ");
		String name=scanner.next();
		
		System.out.println("Entered Name : "+name);
	}

}
