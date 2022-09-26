package com.sujata.training;

public class AgeInputClassWithUncheckedException {

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<18)
			throw new AgeUncheckedException("Age Must be greater than 18");
		this.age = age;
	}
	
	
}
