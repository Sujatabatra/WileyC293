package com.sujata.demo;

import java.util.Scanner;

@FunctionalInterface
interface PersonFactory{
	public Person getPerson(int id,String name,int age);
}

public class ThirdClass {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
//		PersonFactory pf1=new PersonFactory() {
//			@Override
//			public Person getPerson(int id, String name, int age) {
//				return new Person(id,name,age);
//			}
//		};

//		PersonFactory pf1=(id,name,age)-> new Person(id,name,age);
		PersonFactory pf1=Person::new;	
		
		System.out.println("Enter Person ID : ");
		int id=scanner.nextInt();
		System.out.println("Enter Person Name : ");
		String na=scanner.next();
		System.out.println("Enter Person Age : ");
		int age=scanner.nextInt();
		
		Person person=pf1.getPerson(id, na, age);
		System.out.println(person);
		
	}

}
