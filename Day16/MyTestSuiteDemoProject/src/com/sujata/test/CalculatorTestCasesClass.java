package com.sujata.test;

/*
 * import all the static members of Assertions class,
 * Benefit : We can call all the static members of Assertions class without using class Name
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import com.sujata.demo.Calculator;
import com.sujata.exception.NegativeNumberException;

@DisplayName("Testing Calculator Class divide() method")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class CalculatorTestCasesClass {

	private Calculator calculator;
	@BeforeEach
	void setUp() throws Exception {
		calculator=new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator=null;
	}

	@DisplayName("Diving 10 by 2")
	@Test
	void RQ1TC01()throws NegativeNumberException {
		assertEquals(5, calculator.divide(10, 2));
	}
	
	
	@DisplayName("Dividing 0 by 2")
	@Test
	void RQ1_TC02()throws NegativeNumberException {
		assertEquals(0, calculator.divide(0, 2));
	}
	
	@DisplayName("Diving 10 by 0")
	@Test
	void RQ1_TC03() {
		assertThrows(ArithmeticException.class, ()->calculator.divide(10, 0));
	}
	
	@Test
	void RQ1_TC04() {
		assertThrows(NegativeNumberException.class, ()->calculator.divide(-10, 2));
	}
	
	@Test
	void RQ1_TC05() {
		assertThrows(NegativeNumberException.class, ()->calculator.divide(10, -2));
	}
	
	@Test
	void RQ1TC06() {
		assertThrows(NegativeNumberException.class, ()->calculator.divide(-10, -2));
	}
	
	@Test
	void RQ1TC07() {
		assertThrows(NegativeNumberException.class, ()->calculator.divide(-10, 0));
	}
	
	
	

}
