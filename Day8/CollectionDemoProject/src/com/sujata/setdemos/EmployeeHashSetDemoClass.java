package com.sujata.setdemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.sujata.pojo.Employee;

public class EmployeeHashSetDemoClass {

	public static void main(String[] args) {
		/*
		 * HashSet : unordered unique collection of objects, 
		 * collection is auto-growable and auto-shrinkable
		 */
		Set<Employee> integerCollection=new HashSet<Employee>();
		
		System.out.println("Size of collection : "+integerCollection.size());
		
		integerCollection.add(new Employee(1, "AAAA", "IT", "Associate", 35000));
		integerCollection.add(new Employee(2, "BBBB", "Sales", "Manager", 125000));
		integerCollection.add(new Employee(3, "CCCC", "IT", "Sr. Associate", 65000));
		integerCollection.add(new Employee(4, "DDDD", "HR", "Executive", 28000));
		
		System.out.println("Size of collection : "+integerCollection.size());
		System.out.println(integerCollection);
		
		integerCollection.add(new Employee(1, "AAAA", "IT", "Associate", 35000));
		integerCollection.add(new Employee(5, "EEEE", "Marketing", "Sr. Executive", 55000));
		System.out.println("Size of collection : "+integerCollection.size());
		System.out.println(integerCollection);

		integerCollection.remove(new Employee(5, "EEEE", "Marketing", "Sr. Executive", 55000));
		System.out.println("Size of collection : "+integerCollection.size());
		System.out.println(integerCollection);
		
		System.out.println("Traversal using for each loop");
		for(Employee element:integerCollection) {
			System.out.println(element);
		}
		
		/*
		 * Factory Design Pattern : Give the responsibility of creation of object to someone else
		 * benefit of doing so is to get the object even without knowing the name of the implementation class
		 */
		Iterator<Employee> iterator=integerCollection.iterator();
		System.out.println("Traversal using iterator");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
