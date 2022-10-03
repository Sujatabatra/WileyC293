package com.sujata.db;

import java.util.HashMap;
import java.util.Map;

import com.sujata.entity.Person;

public class PersonDataBase {

	private static Map<Integer,Person> personList=new HashMap<Integer, Person>();
	
	static {
		personList.put(1, new Person(1, "AAAA", 34));
		personList.put(2, new Person(2, "BBBB", 14));
		personList.put(3, new Person(3, "CCCC", 45));
		personList.put(4, new Person(4, "DDDD", 24));
		personList.put(5, new Person(5, "EEEE", 19));
		personList.put(6, new Person(6, "FFFF", 31));
	}

	public static Map<Integer, Person> getPersonList() {
		return personList;
	}

	public static void setPersonList(Map<Integer, Person> personList) {
		PersonDataBase.personList = personList;
	}
	
	
}
