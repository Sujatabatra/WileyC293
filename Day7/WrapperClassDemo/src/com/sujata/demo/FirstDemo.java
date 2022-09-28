package com.sujata.demo;

public class FirstDemo {

	public static void main(String[] args) {
		
		/*
		 * Default integer category literal type is of int
		 * Default Floating point literal type is of double
		 */
		/*
		 * byte : 1 byte : 8 bits : (-2^7)-1 to 2^7  = -127 to 128
		 * 
		 *  n bites : (-2^(n-1))-1 to 2^(n-1)
		 */
//		float x=(float)3.4;

		float x=3.4f;
		
		int value=(int)200L;
		
		int y=130;
		//Explicit type - casting
		byte b=(byte)y;
		
		System.out.println("b : "+b);
		//Implicit type-casting
		byte a=10;
		int z=a;
		
	}

}
