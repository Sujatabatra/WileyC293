package com.albert.dmddemo;

import com.albert.demo.CaramelPopCorn;
import com.albert.demo.CheesePopCorn;
import com.sujata.training.PopCorn;

/*
 * Dynamic Method Dispatch
 * Base Class Reference Variable is type Compatible with Derived Class
 * but the reverse is not true;
 */
public class PopCornMain {

	public static void main(String[] args) {
		/*
		 * Possible
		 * ----------------------
		 * Base baseReferenceVariable;
		 * Derived derivedObject=new Derived();
		 * baseReferenceVariable=derivedObject;
		 * 
		 * ========================================
		 * 
		 * Not Possible
		 * -----------------------
		 * Derived derivedReferenceVariable;
		 * Base baseObject=new Base();
		 * derivedReferenceVariable=baseObject;  ==> Not Possible
		 */

		PopCorn popcorn;
		
		popcorn=new CaramelPopCorn();
		popcorn.pop();
		
		popcorn=new CheesePopCorn();
		popcorn.pop();
		
		popcorn=new PopCorn();
		popcorn.pop();
	}

}
