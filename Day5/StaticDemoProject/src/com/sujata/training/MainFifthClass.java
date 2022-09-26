package com.sujata.training;

/*
 * import all the static members of FifthStatic,
 * the benefit is, we will able to call all the static members without class name
 */
import static com.sujata.demo.FifthStatic.*;

import com.sujata.demo.FifthStatic;

public class MainFifthClass {
	
	public static void main(String args[]) {
//		FifthStatic.methodTwo();
		
		methodTwo();
		
		methodFive();
		
		FifthStatic obj=new FifthStatic();
	}

}
