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
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

import com.sujata.demo.Calculator;
import com.sujata.exception.NegativeNumberException;

class CalculatorTestCasesClass {

	private Calculator calculator;

	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator = null;
	}

	@Nested

	class DivideCheck {

		@Test
		void RQ1TC01() throws NegativeNumberException {
			assertEquals(5, calculator.divide(10, 2));
		}

		@Test
		void RQ1_TC02() throws NegativeNumberException {
			assertEquals(0, calculator.divide(0, 2));
		}

		@Test
		void RQ1_TC03() {
			assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
		}

		@Order(2)
		@Test
		void RQ1_TC04() {
			assertThrows(NegativeNumberException.class, () -> calculator.divide(-10, 2));
		}

		@Test
		void RQ1_TC05() {
			assertThrows(NegativeNumberException.class, () -> calculator.divide(10, -2));
		}

		@Order(1)
		@Test
		void RQ1TC06() {
			assertThrows(NegativeNumberException.class, () -> calculator.divide(-10, -2));
		}

		@Test
		void RQ1TC07() {
			assertThrows(NegativeNumberException.class, () -> calculator.divide(-10, 0));
		}
	}

	@Nested
	class AddCheck {

		@DisabledOnOs(value = {OS.WINDOWS,OS.LINUX})
		@Test
		void RQ2TC01() throws NegativeNumberException {
			assertEquals(30, calculator.add(10, 20));
		}

		@DisabledOnJre(value = {JRE.JAVA_11})
		@Test
		void RQ2TC02() {
			assertThrows(NegativeNumberException.class, () -> calculator.add(-10, 20));
		}

		@EnabledOnOs(value = {OS.WINDOWS,OS.AIX})
		@Test
		void RQ2TC03() {
			assertThrows(NegativeNumberException.class, () -> calculator.add(10, -20));
		}

		@Test
		void RQ2TC04() {
			assertThrows(NegativeNumberException.class, () -> calculator.add(-10, -20));
		}

		@Test
		void RQ2TC05() throws NegativeNumberException {
			assertEquals(10, calculator.add(10, 0));
		}

		@Test
		void RQ2TC06() throws NegativeNumberException {
			assertEquals(20, calculator.add(0, 20));
		}

		@Test
		void RQ2TC07() {
			assertThrows(NegativeNumberException.class, () -> calculator.add(-10, 0));
		}

		@Test
		void RQ2TC08() {
			assertThrows(NegativeNumberException.class, () -> calculator.add(0, -20));
		}
	}
}
