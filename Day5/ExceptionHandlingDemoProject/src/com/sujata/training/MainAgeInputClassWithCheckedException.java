package com.sujata.training;

import java.util.Scanner;

public class MainAgeInputClassWithCheckedException {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Age : ");
		int age=scanner.nextInt();
		
		AgeInputClassWithCheckedException obj=new AgeInputClassWithCheckedException();
		
		try {
			obj.setAge(age);
			System.out.println("Person is eligible for employement as his/her age is "+obj.getAge());
		} catch (AgeCheckedException e) {
			
			System.out.println("Person is not eligible for employement");
		}
		

	}

}
