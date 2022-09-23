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
	static public int getValue2() {
		return value2;
	}
	static public void setValue2(int val) {
		value2 = val;
	}
	
	
	
}

public class SecondStaticDemoClassForStaticMethod {

	public static void main(String args[]) {
		SecondStatic.setValue2(20);
		System.out.println(SecondStatic.getValue2());
		
		SecondStatic SecondStatic1=new SecondStatic();
		System.out.println("SecondStatic1.value1 :"+SecondStatic1.getValue1());
		System.out.println("SecondStatic1.value2 :"+SecondStatic1.getValue2());
		
		
		SecondStatic SecondStatic2=new SecondStatic();
		SecondStatic2.setValue1(100);
		SecondStatic2.setValue2(500);
		System.out.println("SecondStatic2.value1 :"+SecondStatic2.getValue1());
		System.out.println("SecondStatic2.value2 :"+SecondStatic2.getValue2());
		
		System.out.println("===========================");
		System.out.println("SecondStatic1.value1 :"+SecondStatic1.getValue1());
		System.out.println("SecondStatic1.value2 :"+SecondStatic1.getValue2());
	}
}
