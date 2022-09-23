package com.sujata.demo;

class FourthClass {

	FourthClass() {
		System.out.println("Hi I am FourthClass Constructor");
	}

	{
		System.out.println("Hi I am instance block of Fourth Class");
	}

	static {
		System.out.println("Hi I am static block of Fourth Class");
	}
}

class DerivedFourthClass extends FourthClass {

	DerivedFourthClass() {
		//implicit call is to the super(base class constructor)
		System.out.println("Hi I am DerivedFourthClass Constructor");
	}

	{
		System.out.println("Hi I am instance block of DerivedFourthClass");
	}

	static {
		System.out.println("Hi I am static block of DerivedFourthClass");
	}
}

public class FourthStaticDemoClassForStaticBlock {

	public static void main(String[] args) {
		
	
		
		DerivedFourthClass derivedFourthClass=new DerivedFourthClass();
		System.out.println("================");
		FourthClass fourthClass2 = new FourthClass();  
		DerivedFourthClass derivedFourthClass1=new DerivedFourthClass();  

	}

}
