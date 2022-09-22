package com.sujata.demo;

public class Sports extends Student {

	private String sportsName;
	private String grade;
	
	public Sports() {
		System.out.println("Hi I am Sports class default constructor");
	}
	public String getSportsName() {
		return sportsName;
	}
	public void setSportsName(String sportsName) {
		this.sportsName = sportsName;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	//overloading
	public void inputStudentsDetails(int rollNo,String name,String SportsName,String grade) {
		inputStudentDetails(rollNo, name);
		this.sportsName=sportsName;
		this.grade=grade;
	}
	//overriding
	public void displayStudentDetails() {
		super.displayStudentDetails();
		System.out.println("Sports Name : "+sportsName);
		System.out.println("Grade : "+grade);
	}
}
