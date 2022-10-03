package com.sujata.service;

import java.util.Optional;

import com.sujata.entity.Person;
import com.sujata.persistence.PersonDao;
import com.sujata.persistence.PersonDaoImpl;

public class PersonServiceImpl implements PersonService {

	private PersonDao personDao=new PersonDaoImpl();
	
	@Override
	public Person searchPersonById(int id) {
		Optional<Person> optionalPerson=personDao.getPersonById(id);
		Person person=optionalPerson.orElse(new Person(0,"No Name",0));
		Person covertedPerson=convertPersonToLowerCase(person);
		return covertedPerson;
	}
	
	
	private Person convertPersonToLowerCase(Person person) {
		person.setPersonName(person.getPersonName().toLowerCase());
		return person;
	}

}
