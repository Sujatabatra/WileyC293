package com.sujata.mapdemos;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedMapDemoClass {

	public static void main(String[] args) {
		/*
		 * LinkedHashMap : ordered collection of key value pairs,
		 * Ordering wrt keys,
		 * where keys are unique and values can be duplicated
		 */
		Map<String, Integer> months=new LinkedHashMap<String, Integer>();
		
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
