package com.sujata.demo;

public class Student {

	private int rollNo;
	private String name;
	
	public Student() {
		System.out.println("Hi I am Student class default Constructor");
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void inputStudentDetails(int rollNo,String name) {
		this.rollNo=rollNo;
		this.name=name;
	}
	
	public void displayStudentDetails() {
		System.out.println("Roll No : "+getRollNo());
		System.out.println("Name : "+getName());

	}
	
	
}
