package com.sujata.training;

public class AgeInputClassWithCheckedException {

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age)throws AgeCheckedException {
		if(age<18)
			throw new AgeCheckedException("Age must be > 18");
		this.age = age;
	}
	
	
}
