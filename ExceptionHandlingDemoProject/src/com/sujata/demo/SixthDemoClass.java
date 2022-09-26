package com.sujata.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

class FileCheck{
	
	public void check(String fname) throws FileNotFoundException {
		/*
		 * FileInputStream is used to read the file content
		 */	
			FileInputStream fis=new FileInputStream(fname);
			System.out.println("File exist "+fname);
	}
	
	public void input() throws FileNotFoundException {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter File Name : ");
		String fname=scanner.next();
		
		check(fname);
	}
}
public class SixthDemoClass {

	public static void main(String[] args) {
		try {
		FileCheck fileCheck=new FileCheck();
		fileCheck.input();
		
		}
//		catch(ArithmeticException ex) {
//			
//		}
		catch(FileNotFoundException ex) {
			System.out.println("Sorry File Does not exist");
		}
	}

}
