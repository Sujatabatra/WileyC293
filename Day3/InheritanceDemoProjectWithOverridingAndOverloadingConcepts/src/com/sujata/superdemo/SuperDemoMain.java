package com.sujata.superdemo;


class Base{
	int value;

	public Base(int value) {
		super();
		this.value = value;
	}
	
}

class Derived extends Base{
	
	int value;

	public Derived(int value, int value2) {
		super(value);
		this.value = value2;
	}
	public int greater() {
		
		if(super.value>value)
			return super.value;
		else
			return value;
				
	}
	
}
public class SuperDemoMain {

	public static void main(String[] args) {
		Derived derived=new Derived(10, 20);
		System.out.println("Greater no is : "+derived.greater());

	}

}
