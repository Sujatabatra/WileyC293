package com.sujata.demo;
/*
 * Constructors are used to initialize objects while declaring them
 * Only if class is constructor challenged(without any constructor), 
 * then only compiler will going to create one zero argument constructor(default constructor) for us otherwise not.
 * Rules for Constructor
 * 1. Constructor have same name as that of class name
 * 2. Constructor can be argumented as well as non argumented
 * 3. Constructor cannot return any value not even void
 * 4. Constructor can exist in any scope i.e private, public and default
 */
public class Complex {

	private int real,imagenary;

	/*
	 * Constructor overloading : a class can have multiple constructor,
	 * and each constructor will be differentiated from one another as per its
	 * signature (signature means : number and types of arguments and its sequence)
	 */
	Complex(int real,int imagenary){
		this.real=real;
		this.imagenary=imagenary;
	}
	
	public Complex(int real) {
		this.real=real;
		imagenary=6;
	}
	
	private Complex() {
		
	}
	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImagenary() {
		return imagenary;
	}

	public void setImagenary(int imagenary) {
		this.imagenary = imagenary;
	}
	
	public void display() {
		System.out.print(real);
		if(imagenary>0)
			System.out.println("+"+imagenary+"i");
		else if(imagenary<0)
			System.out.println(imagenary+"i");
	}
	
	public Complex sum(Complex complex2) {
		Complex sumComplex=new Complex();
		sumComplex.real=this.real+complex2.real;
		sumComplex.imagenary=this.imagenary+complex2.imagenary;
		return sumComplex;
	}
	
	
}
