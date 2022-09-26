package com.sujata.demo;

/*
 * 1. static can be a variable, method, block and import
 * 
 * static methods are the methods which can be called with class name before object creation as well,
 * provided method visibility is there.
 */

class SecondStatic{
	private int value1;
	static private int value2;
	
	public int getValue1() {
		return value1;
	}
	public void setValue1(int value1) {
		this.value1 = value1;
	}
	public static int getValue2() {
		return value2;
	}
	public static void setValue2(int value2) {
		SecondStatic.value2 = value2;
	}
	
	/*
	 * from static method you can call static members of the class only
	 */
	static public void show() {  //show method can be called before object creation
//		System.out.println("Value1 : "+value1);  //value1 comes into existence with object creation
		System.out.println("Value2 : "+value2);
	}
	
	
}

public class SecondStaticDemoClassForStaticMethod {

	public static void main(String args[]) {
		SecondStatic.setValue2(20);
		System.out.println(SecondStatic.getValue2());
		SecondStatic.show();
		
//		SecondStatic secondStatic1=new SecondStatic();
//		System.out.println("SecondStatic1.value1 :"+secondStatic1.getValue1());
//		System.out.println("SecondStatic1.value2 :"+secondStatic1.getValue2());
//		
//		
//		SecondStatic secondStatic2=new SecondStatic();
//		secondStatic2.setValue1(100);
//		secondStatic2.setValue2(500);
//		System.out.println("SecondStatic2.value1 :"+secondStatic2.getValue1());
//		System.out.println("SecondStatic2.value2 :"+secondStatic2.getValue2());
//		
//		System.out.println("===========================");
//		System.out.println("SecondStatic1.value1 :"+secondStatic1.getValue1());
//		System.out.println("SecondStatic1.value2 :"+secondStatic1.getValue2());
	}
}
