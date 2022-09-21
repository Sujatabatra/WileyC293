package com.sujata.demo;

public class Complex {

	private int real,imagenary;

	public int getReal() {
		return real;
	}

	/*
	 * this is the reference variable which holds the reference of current object
	 */
	public void setReal(int real/*local variable : 15*/) {
		this.real = real;
	}

	public int getImagenary() {
		return imagenary;
	}

	public void setImagenary(int imagenary/*local variable : 8*/) {
		this.imagenary = imagenary;
	}
	
	public void display() {
		System.out.print(real);
		if(imagenary>0)
			System.out.println("+"+imagenary+"i");
		else if(imagenary<0)
			System.out.println(imagenary+"i");
	}
	
	public Complex sum(Complex complex2/*hashcode*/) {
		Complex sumComplex=new Complex();
		sumComplex.real=this.real+complex2.real;
		sumComplex.imagenary=this.imagenary+complex2.imagenary;
		return sumComplex;/*hashcode*/
	}
	
	
}
