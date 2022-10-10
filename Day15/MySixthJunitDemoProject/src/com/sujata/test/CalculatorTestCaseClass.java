package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sujata.demo.Calculator;
import com.sujata.exception.NegativeNumberException;

class CalculatorTestCaseClass {

	private Calculator calculator;
	
	@BeforeEach
	void setUp() throws Exception {
	calculator=new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator=null;
	}

	@Test
	void testGetDivide()throws NegativeNumberException{
		calculator.setNumber1(10);
		calculator.setNumber2(2);
		assertEquals(5, calculator.getDivide());
	}
	
	void testSetNumber1Case1()throws NegativeNumberException{
		assertThrows(NegativeNumberException.class, ()->calculator.setNumber1(-10));
	}
	void testSetNumber1Case2()throws NegativeNumberException{
		calculator.setNumber1(10);
		assertEquals(10, calculator.getNumber1());
		
	}

	void testSetNumber2Case1()throws NegativeNumberException{
		assertThrows(NegativeNumberException.class, ()->calculator.setNumber2(-10));
	}
	
	void testSetNumber2Case2()throws NegativeNumberException{
		calculator.setNumber2(2);
		assertEquals(2, calculator.getNumber2());
	}
	
}
