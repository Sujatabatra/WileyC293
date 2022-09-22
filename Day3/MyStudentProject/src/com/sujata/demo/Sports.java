package com.sujata.demo;

public class Sports extends Student {

	private String sportsName;
	private String grade;
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
	
	public void inputStudentsDetailsWithSportsInfo(int rollNo,String name,String SportsName,String grade) {
		inputStudent(rollNo, name);
		this.sportsName=sportsName;
		this.grade=grade;
	}
	
	public void displayStudentDetailsWithSportsInfo() {
		display();
		System.out.println("Sports Name : "+sportsName);
		System.out.println("Grade : "+grade);
	}
}
