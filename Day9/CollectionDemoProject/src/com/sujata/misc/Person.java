package com.sujata.misc;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
/*
 * If two object are meaningfully equal, then their hashcode must also be same
 * but if two objects have same hashcode, they might not be meaningfully equal.
 */

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Person {

	@Setter
	@Getter
	private int personId;
	@Setter
	@Getter
	private String personName;
	@Setter
	@Getter
	private int personAge;

//	@Override
//	public int hashCode() {
//		return Objects.hash(personAge, personId, personName);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Person other = (Person) obj;
//		return personAge == other.personAge && personId == other.personId
//				&& Objects.equals(personName, other.personName);
//	}

	
	
	
}
