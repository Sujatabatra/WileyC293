package com.sujata.setdemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.sujata.pojo.Book;

public class BookTreeSetDemoClass {

	public static void main(String[] args) {
		/*
		 * TreeSet : sorted unique collection of objects, 
		 * collection is auto-growable and auto-shrinkable
		 */
		Set<Book> integerCollection=new TreeSet<Book>();
		
		System.out.println("Size of collection : "+integerCollection.size());
		
		integerCollection.add(new Book(101, "Book1", "Author A", 1000, 150));
		integerCollection.add(new Book(102, "Book2", "Author B", 1200, 180));
		integerCollection.add(new Book(103, "Book3", "Author A", 800, 500));
		integerCollection.add(new Book(104, "Book4", "Author C", 100, 760));
		
		System.out.println("Size of collection : "+integerCollection.size());
		System.out.println(integerCollection);
		
		integerCollection.add(new Book(101, "Book1", "Author A", 1000, 150));
		integerCollection.add(new Book(105, "Book5", "Author B", 1900, 950));
		System.out.println("Size of collection : "+integerCollection.size());
		System.out.println(integerCollection);

//		integerCollection.remove(new Book(105, "Book5", "Author B", 1900, 950));
//		System.out.println("Size of collection : "+integerCollection.size());
//		System.out.println(integerCollection);
		
		System.out.println("Traversal using for each loop");
		for(Book element:integerCollection) {
			System.out.println(element);
		}
		
		/*
		 * Factory Design Pattern : Give the responsibility of creation of object to someone else
		 * benefit of doing so is to get the object even without knowing the name of the implementation class
		 */
		Iterator<Book> iterator=integerCollection.iterator();
		System.out.println("Traversal using iterator");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
