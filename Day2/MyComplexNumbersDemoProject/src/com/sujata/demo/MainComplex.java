package com.sujata.demo;

public class MainComplex {

	public static void main(String[] args) {
		
		Complex complex1=null;
		complex1=new Complex();
//		complex1.real=8;
		complex1.setReal(5);
		complex1.setImagenary(8);
		System.out.print("First Complex Number : ");
		complex1.display();

//		System.out.println(complex1);
	
		Complex complex2=null;
		complex2=new Complex();
		
		complex2.setReal(15);
		complex2.setImagenary(-6);
		System.out.print("Second Complex Number : ");
		complex2.display();

	
		Complex sum=complex1.sum(complex2);
		System.out.print("Sum of Two Complex Numbers : ");
		sum.display();
	}

}
