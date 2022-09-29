package com.sujata.mapdemos;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashtableDemoClass {

	public static void main(String[] args) {
		/*
		 * Hashtable (Legacy Class) : unordered collection of key value pairs,
		 * unordering wrt keys,
		 * where keys are unique and values can be duplicated
		 */
		Map<String, Integer> months=new Hashtable<String, Integer>();
		
		months.put("Jan", 31);
		months.put("Feb", 28);
		months.put("Mar", 31);
		months.put("Apr", 30);
		months.put("May", 31);
		
		System.out.println("Size of the map : "+months.size());
		System.out.println(months);

		months.put("Feb", 29);
		System.out.println("Size of the map : "+months.size());
		System.out.println(months);
		
		Set<String> monthsName=months.keySet();
		
		for(String monthName:monthsName) {
			System.out.println(monthName+" has "+months.get(monthName)+" days");
		}
	}

}
