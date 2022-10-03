package com.sujata.demo;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.*;

public class SecondDemoClass {
	
	public static void main(String args[]) {
		
		List<Integer> list=Arrays.asList(10,20,34,57,23,19);
		
//		for(Integer element:list) {
//			if(element%2==0)
//				System.out.println(element);
//		}
		
		list.stream()
		.filter((element)->element%2==0)
		.forEach(System.out::println);
		
		long totalEven=list.stream()
		.filter((element)->element%2==0)
		.count();
		
		System.out.println("Total No of Even Values : "+totalEven);
		
		list.stream()
		.filter((element)->element%2==0)   // checked for even nos  (intermediate)
		.map((element)->Math.pow(element, 2))  // calculated number^2 (intermediate)
		.forEach(System.out::println);   //terminate or final
		
		
		List<Integer> evenElementList=list.stream()
		.filter((element)->element%2==0)
		.collect(toList());
//		.collect(Collectors.toList());
		
		System.out.println(evenElementList);
		
	}

}
