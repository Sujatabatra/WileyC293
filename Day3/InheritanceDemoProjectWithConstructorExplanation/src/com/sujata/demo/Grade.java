package com.sujata.demo;

public class Grade extends Marks {
	
	private double percentage;
	private String grade;
	
	public Grade() {
		//implicit call goes to Parent class default constructor: Marks()
		//for explicit call to Parents class argumented constructor, use "super" keyword
		super(0,0,0);
		System.out.println("Hi I am Grade class default constructor");
	}
	public void calculate() {
		percentage=(getMarks1()+getMarks2()+getMarks3())/3;
		if(percentage>75)
			grade="A Grade";
		else
			grade="B Grade";
	}
	
	public void displayCompleteDetails() {
		displayStudentDetailsWithMarks();
		System.out.println("Percentage : "+percentage);
		System.out.println("Grade : "+grade);
	}

}
