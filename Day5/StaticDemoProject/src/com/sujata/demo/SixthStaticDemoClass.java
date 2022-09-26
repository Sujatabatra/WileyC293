package com.sujata.demo;

class SixthStaticBase{
	
	public void show() {
		System.out.println("Hi I am show method from SixthStaticBase");
	}
	
	static public void message() {
		System.out.println("Hi I am message method from SixthStaticBase");
	}
	
	public void display() {
		System.out.println("Hi I am display method from SixthStaticBase");
	}
}

class SixthStaticDerived extends SixthStaticBase{
	@Override
	public void show() {
		System.out.println("Hi I am show method from SixthStaticDerived");
	}
	
//	@Override
	//re defining
	static public void message() {
//		super.message();
		System.out.println("Hi I am message method from SixthStaticDerived");
	}
}
public class SixthStaticDemoClass {

	public static void main(String[] args) {
		
		SixthStaticBase baseReferenceVariable;
		
		baseReferenceVariable=new SixthStaticBase();
		baseReferenceVariable.show();  //line no 6
		baseReferenceVariable.message();  //line #10
		
		baseReferenceVariable=new SixthStaticDerived();
		baseReferenceVariable.show();  //line #21
		baseReferenceVariable.message();  //line #10
		
		SixthStaticDerived.message();

	}

}
