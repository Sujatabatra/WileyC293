package com.sujata.test;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SuiteDisplayName("Testing Multiple Test Case Classes Together")
@SelectClasses({CalculatorSequenceTestTestCasesClass.class,CalculatorTestCasesClass.class})
public class MyTestSuit {

}
