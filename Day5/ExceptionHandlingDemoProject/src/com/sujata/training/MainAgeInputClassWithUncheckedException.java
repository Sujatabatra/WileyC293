package com.sujata.training;

import java.util.Scanner;

public class MainAgeInputClassWithUncheckedException {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try {
		System.out.println("Enter Age : ");
		int age=scanner.nextInt();
		
		AgeInputClassWithUncheckedException obj=new AgeInputClassWithUncheckedException();
		
		obj.setAge(age);
		
		System.out.println("Person is eligible for voting as his/her age is "+obj.getAge());
		}
		catch(AgeUncheckedException exception) {
			System.out.println("Person is not eligible for voting!");
		}
	}

}
