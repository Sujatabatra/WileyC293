package com.sujata.objectio;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6555227171815680851L;
	private int personId;
	private String personName;
	private int age;
	private String address;
	public Person(int personId, String personName, int age) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.age = age;
	}
	
	
	
}
