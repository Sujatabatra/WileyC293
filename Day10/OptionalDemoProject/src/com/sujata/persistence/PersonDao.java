package com.sujata.persistence;

import java.util.Optional;

import com.sujata.entity.Person;

public interface PersonDao {

//	public Person getPersonById(int id);
	
	public Optional<Person> getPersonById(int id);
}
