package com.sujata.demo;

/*
 * 1. static can be a variable, method, block and import
 */

class FirstStatic{
	int value1;
	static int value2;
	
}

public class FirstStaticDemoClassForStaticVariables {

	public static void main(String args[]) {
		FirstStatic.value2=20;
		System.out.println(FirstStatic.value2);
		
		FirstStatic firstStatic1=new FirstStatic();
		System.out.println("firstStatic1.value1 :"+firstStatic1.value1);
		System.out.println("firstStatic1.value2 :"+firstStatic1.value2);
		
		
		FirstStatic firstStatic2=new FirstStatic();
		firstStatic2.value1=100;
		firstStatic2.value2=500;
		System.out.println("firstStatic2.value1 :"+firstStatic2.value1);
		System.out.println("firstStatic2.value2 :"+firstStatic2.value2);
		
		System.out.println("===========================");
		System.out.println("firstStatic1.value1 :"+firstStatic1.value1);
		System.out.println("firstStatic1.value2 :"+firstStatic1.value2);
	}
}
