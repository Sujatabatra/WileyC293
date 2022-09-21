package com.sujata.demo;

public class MainMyDemoClass {

	public static void main(String[] args) {
		MyDemoClass myDemoClass=new MyDemoClass();
		
		System.out.println("integer instance variable:"+myDemoClass.getIntegerInstanceVariable());
		System.out.println("double instance variable:"+myDemoClass.getDoubleInstanceVariable());
		System.out.println("char instance variable:"+myDemoClass.getCharInstanceVariable());
		System.out.println("boolean instance variable:"+myDemoClass.isBooleanInstanceVariable());
		System.out.println("String instance variable:"+myDemoClass.getObjectInstanceVariable());
	
		int variable1=16;
		System.out.println("variable 1: "+variable1);
	}

}
