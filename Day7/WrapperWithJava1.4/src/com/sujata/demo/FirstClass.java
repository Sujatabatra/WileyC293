package com.sujata.demo;

public class FirstClass {

	public static void main(String[] args) {
		
		/*
		 * valueOf : convert primtive to wrapper
		 */
		Integer iOb1=Integer.valueOf(10);
		Integer iOb2=Integer.valueOf(20);
		
		/*
		 * xxxValue : convert wrapper to primitive
		 */
		int sum=iOb1.intValue()+iOb2.intValue();
//		Integer iOb3=iOb1+iOb2;
		Integer iOb3=Integer.valueOf(sum);

		System.out.println("Sum : "+iOb3);
	}

}
