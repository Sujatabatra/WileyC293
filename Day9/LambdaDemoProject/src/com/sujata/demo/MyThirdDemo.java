package com.sujata.demo;

import java.util.function.BinaryOperator;

@FunctionalInterface
interface Addition {
	public int sum(int number1, int number2);
}

public class MyThirdDemo {

	public static void main(String[] args) {

		Addition addition = new Addition() {

			@Override
			public int sum(int number1, int number2) {
				return number1 + number2;
			}
		};

		System.out.println("Sum : " + addition.sum(10, 20));

//		Addition addition1 = (int number1, int number2)-> {
//				return number1 + number2;
//			};
//		Addition addition1 = (number1,number2)-> {
//			return number1 + number2;
//		};

		Addition addition1 = (number1,number2)-> number1 + number2;
		
		System.out.println("Sum : " + addition1.sum(11, 22));
		
		BinaryOperator<Integer> addition2=(num1,num2)->num1+num2;
		
		System.out.println("Sum : "+addition2.apply(34, 56));
		
	}

}
