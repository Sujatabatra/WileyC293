package com.sujata.demo;

import java.util.Scanner;

public class SecondDemoClass {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int position=-1;
		try {
		int arr[];
		
		System.out.println("Enter Total No of elements in an array : ");
		int total=scanner.nextInt();
		
		arr=new int[total];
		
		for(int index=0;index<total;index++) {
			System.out.println("Enter "+index+" index element : ");
			arr[index]=scanner.nextInt();
		}
		
		System.out.println("Enter the position in an array whoes value you want to view : ");
		position=scanner.nextInt();
		
		System.out.println("Value at position "+position+" in an array : "+arr[position]);
		}
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Position "+position+" does not exist in an array ");
		}
		catch(NegativeArraySizeException exception) {
			System.out.println("Total No of element must always be a Positive initeger, please try again with Positive Integer");
		}
		catch(RuntimeException exception) {
			System.out.println("Something went wrong, please try again");
		}
		
		System.out.println("Good Bye from Main!");
	}

}
