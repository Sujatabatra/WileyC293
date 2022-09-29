package com.sujata.setdemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemoClass {

	public static void main(String[] args) {
		/*
		 * TreeSet : sorted unique collection of objects, 
		 * collection is auto-growable and auto-shrinkable
		 */
		Set<Integer> integerCollection=new TreeSet<Integer>();
		
		System.out.println("Size of collection : "+integerCollection.size());
		
		integerCollection.add(10);
		integerCollection.add(14);
		integerCollection.add(45);
		integerCollection.add(5);
		
		System.out.println("Size of collection : "+integerCollection.size());
		System.out.println(integerCollection);
		
		integerCollection.add(45);
		integerCollection.add(51);
		System.out.println("Size of collection : "+integerCollection.size());
		System.out.println(integerCollection);

		integerCollection.remove(10);
		System.out.println("Size of collection : "+integerCollection.size());
		System.out.println(integerCollection);
		
		System.out.println("Traversal using for each loop");
		for(Integer element:integerCollection) {
			System.out.println(element);
		}
		
		/*
		 * Factory Design Pattern : Give the responsibility of creation of object to someone else
		 * benefit of doing so is to get the object even without knowing the name of the implementation class
		 */
		Iterator<Integer> iterator=integerCollection.iterator();
		System.out.println("Traversal using iterator");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
