package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorSequenceTestTestCasesClass {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Hi I am setUpBeforeClass");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Hi I am tearDownAfterClass");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("===============");
		System.out.println("Hi I am setUp");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Hi I am tearDown");
		System.out.println("===============");
	}

	@Test
	void testDivideOne() {
		System.out.println("Hi I am Test Case One");
	}

	@Test
	void testDivideTwo() {
		System.out.println("HI I am Test Case Two");
	}
}
