package com.sujata.setdemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.sujata.pojo.Book;
import com.sujata.pojo.NameComparator;
import com.sujata.pojo.PercentageComparator;
import com.sujata.pojo.Student;

public class StudentTreeSetDemoClass {

	public static void main(String[] args) {
		/*
		 * TreeSet : sorted unique collection of objects, 
		 * collection is auto-growable and auto-shrinkable
		 * 
		 * 
		 */
		
		
//		Set<Student> integerCollection=new TreeSet<Student>(new PercentageComparator());
		
		Set<Student> integerCollection=new TreeSet<Student>(new NameComparator());
		
		System.out.println("Size of collection : "+integerCollection.size());
		
		integerCollection.add(new Student(101, "AAAA", 70, 80, 65));
		integerCollection.add(new Student(102, "BBBB", 90, 90, 75));
		integerCollection.add(new Student(103, "XXXX", 40, 80, 85));
		integerCollection.add(new Student(104, "MMMM", 74, 62, 96));
		
		System.out.println("Size of collection : "+integerCollection.size());
		System.out.println(integerCollection);
		
		integerCollection.add(new Student(101, "AAAA", 70, 80, 65));
		integerCollection.add(new Student(105, "PPPP", 88, 80, 55));
		System.out.println("Size of collection : "+integerCollection.size());
		System.out.println(integerCollection);

//		integerCollection.remove(new Book(105, "Book5", "Author B", 1900, 950));
//		System.out.println("Size of collection : "+integerCollection.size());
//		System.out.println(integerCollection);
		
		System.out.println("Traversal using for each loop");
		for(Student element:integerCollection) {
			System.out.println(element);
		}
		
		/*
		 * Factory Design Pattern : Give the responsibility of creation of object to someone else
		 * benefit of doing so is to get the object even without knowing the name of the implementation class
		 */
		Iterator<Student> iterator=integerCollection.iterator();
		System.out.println("Traversal using iterator");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
