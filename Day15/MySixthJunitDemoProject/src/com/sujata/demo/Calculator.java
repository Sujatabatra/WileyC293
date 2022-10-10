package com.sujata.demo;

import com.sujata.exception.NegativeNumberException;

public class Calculator {

	private int number1,number2;

	public int getNumber1(){
		return number1;
	}

	public void setNumber1(int number1)throws NegativeNumberException {
		if(number1<0)
			throw new NegativeNumberException("Kindly enter Positive Integer");
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) throws NegativeNumberException {
		if(number2<0)
			throw new NegativeNumberException("Kindly enter Positive Integer");
		this.number2 = number2;
	}
	
	
	public int getDivide() {
			return number1/number2;
		
	}
	
}
