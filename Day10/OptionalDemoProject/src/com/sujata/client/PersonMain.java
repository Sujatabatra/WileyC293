package com.sujata.client;

import java.util.Scanner;

import com.sujata.entity.Person;
import com.sujata.service.PersonService;
import com.sujata.service.PersonServiceImpl;

public class PersonMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		PersonService personService=new PersonServiceImpl();
		
		System.out.println("Enter Person ID whoes Record you want to search for ");
		int id=scanner.nextInt();
		
		Person person=personService.searchPersonById(id);
		if(person!=null)
			System.out.println(person);
		else
			System.out.println("Person with ID "+id+" doesnot exist!");

	}

}
