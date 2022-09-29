package com.sujata.listdemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemoClass {

	public static void main(String[] args) {
		/*
		 * LinkedList : ordered duplicate collection of indexed objects,
		 * which is auto growable and auto shrinkable
		 */
		List<Integer> integerCollection=new LinkedList<Integer>();
		
		System.out.println("Size of my collection : "+integerCollection.size());
		integerCollection.add(20);
		integerCollection.add(10);
		integerCollection.add(64);
		integerCollection.add(23);
		
		System.out.println("Size of my collection : "+integerCollection.size());
		System.out.println(integerCollection);
		
		integerCollection.add(20);
		integerCollection.add(15);
		
		System.out.println("Size of my collection : "+integerCollection.size());
		System.out.println(integerCollection);
		
		integerCollection.remove(2);
		
		System.out.println("Size of my collection : "+integerCollection.size());
		System.out.println(integerCollection);
		
		integerCollection.remove(Integer.valueOf(23));
		System.out.println("Size of my collection : "+integerCollection.size());
		System.out.println(integerCollection);
		
		System.out.println("Traversal using traditional for loop");
		for(int index=0;index<integerCollection.size();index++) {
			System.out.println(integerCollection.get(index));
		}

		System.out.println("Traversal using for each");
		for(Integer element:integerCollection) {
			System.out.println(element);
		}
		
		System.out.println("Traversal using Iterator");
		Iterator<Integer> iterator=integerCollection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Reverse Traversal using ListIterator");
		ListIterator<Integer> listIterator=integerCollection.listIterator();
		while(listIterator.hasNext())
			listIterator.next();
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}

}
