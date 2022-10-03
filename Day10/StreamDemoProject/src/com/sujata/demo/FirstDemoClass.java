package com.sujata.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FirstDemoClass {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(10,15,78,23,45,90);
		
//		list.stream()
//		.forEach((element)->System.out.println(element));
		
		list.stream()
		.forEach(System.out::println);
		System.out.println("==============");
		list.stream()
		.forEach((element)->System.out.println("value is "+element));
		System.out.println("===================");
		Stream<Integer> integerStream=list.stream();
		
		integerStream.forEach(System.out::println);
		System.out.println("-----------------------");
		integerStream.forEach(System.out::println);
		
	}

}
