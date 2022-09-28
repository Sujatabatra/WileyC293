package com.sujata.misc;

public class PersonMain {

	public static void main(String[] args) {
		int i=10;
		int j=10;
		
		if(i==j)
			System.out.println("i and j are equal");
		else
			System.out.println("i and j are not equal");
		
		Person person1=new Person(1, "Asha", 34);
		Person person2=new Person(1, "Asha", 34);
		//== : checked for references
		if(person1==person2)
			System.out.println("person1 and person2 are equal");
		else
			System.out.println("person1 and person2 are not equal");

		/*
		 * equals() : is from Object class , default behaviour: checking the equality of references
		 */
		if(person1.equals(person2))
			System.out.println("person1 and person2 are equal");
		else
			System.out.println("person1 and person2 are not equal");
		
		System.out.println("person1 hashcode "+person1.hashCode());
		System.out.println("person2 hashcode "+person2.hashCode());

	}

}
