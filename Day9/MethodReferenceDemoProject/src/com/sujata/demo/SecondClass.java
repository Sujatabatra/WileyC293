package com.sujata.demo;

import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

class Factorial {

	public int calculateFactorial(int n) {
		int f=1;
		while(n>=1)
			f*=n--;
		return f;
	}
}

public class SecondClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//		BinaryOperator<String> binaryOperator=(arg1,arg2)->arg1.concat(arg2);

		BinaryOperator<String> binaryOperator = String::concat;

		System.out.println("Enter First String : ");
		String first = scanner.next();
		System.out.println("Enter Second String : ");
		String second = scanner.next();

		System.out.println("Concatenated String : " + binaryOperator.apply(first, second));

		
		Factorial factorial=new Factorial();
		
//		UnaryOperator<Integer> unaryOperator=(number)->factorial.calculateFactorial(number);
		
		UnaryOperator<Integer> unaryOperator=factorial::calculateFactorial;
		System.out.println("Enter no : ");
		int no=scanner.nextInt();
		System.out.println("Factorial of no : "+unaryOperator.apply(no));
	}

}
