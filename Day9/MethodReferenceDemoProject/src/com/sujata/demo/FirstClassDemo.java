package com.sujata.demo;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class FirstClassDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
//		BinaryOperator<Double> powerResult=(number,power)->Math.pow(number, power);
		
		BinaryOperator<Double> powerResult=Math::pow;
		System.out.println("Enter Number : ");
		double no=scanner.nextDouble();
		System.out.println("Enter Power : ");
		double po=scanner.nextDouble();
		
		System.out.println("Result : "+powerResult.apply(no, po));
		

	}

}
