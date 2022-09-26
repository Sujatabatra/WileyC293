package com.sujata.demo;

import java.util.Scanner;

public class ThirdDemoClass {

	public static void main(String[] args) {

		int number1 = 0;
		int number2 = 0;
		int result = 0;
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter First No : ");
			number1 = scanner.nextInt();

			System.out.println("Enter Second No : ");
			number2 = scanner.nextInt();

			result = number1 / number2; 

			System.out.println("Division Result : " + result);
		}
		// unchecked exception
		catch (ArithmeticException exception) {
			System.out
					.println("You can't divide no by zero, do you want to enter new no , press y for yes and n for no");
			String response = scanner.next();
			try {
				if (response.equalsIgnoreCase("y")) {
					System.out.println("Enter Second No : ");
					number2 = scanner.nextInt();
					result = number1 / number2; 
					System.out.println("Division Result : " + result);
				}
			} catch (ArithmeticException excep) {
				System.out.println("Undefined!");
			}
			catch(RuntimeException ex) {
				System.out.println("Something went wrong, please try again");
			}

		}
		catch(Exception ex) {
			System.out.println("System is not responsing right now , please check after sometime");
		}
		System.out.println("Good Bye from main!");

	}

}
