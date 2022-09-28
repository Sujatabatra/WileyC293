package com.sujata.pojo;

import java.util.Objects;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class Student {

	@Getter
	@Setter
	private int rollNo;
	@Getter
	@Setter
	private String name;
	@Getter
	@Setter
	private int marks1,marks2,marks3;
	@Getter
	@Setter
	private int percentage;
	public Student(int rollNo, String name, int marks1, int marks2, int marks3) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
		this.percentage=(marks1+marks2+marks3)/3;
	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(marks1, marks2, marks3, name, percentage, rollNo);
//	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return marks1 == other.marks1 && marks2 == other.marks2 && marks3 == other.marks3
				&& Objects.equals(name, other.name) && percentage == other.percentage && rollNo == other.rollNo;
	}
	
	
	
	
}
