package com.sujata.demo;

/*
 * Variables are readable or modifiable or both
 * if Variables are readable : create getter
 * if Variables are modifiable : create setter
 * if Variable is readable as well as modifiable : create setter and getter
 */
/*
 * Abstraction : Methods
 * Hiding : private access specifier
 * Encapsulation : class
 */
public class Factorial {
	/*
	 * number : modifiable 
	 * factorial : readable
	 */
	private int number,factorial;

	public void setNumber(int number) {
		this.number = number;
	}

	public int getFactorial() {
		factorial=1;
		while(number>=1)
			factorial*=number--;
		return factorial;
	}
	
	

}
