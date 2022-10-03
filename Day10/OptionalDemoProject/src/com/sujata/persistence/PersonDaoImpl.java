package com.sujata.persistence;

import java.util.Optional;

import com.sujata.db.PersonDataBase;
import com.sujata.entity.Person;

public class PersonDaoImpl implements PersonDao {

//	@Override
//	public Person getPersonById(int id) {
//		return PersonDataBase.getPersonList().get(id);
//	}

	@Override
	public Optional<Person> getPersonById(int id) {
		Person person=PersonDataBase.getPersonList().get(id);
		return Optional.ofNullable(person);
	}
}
