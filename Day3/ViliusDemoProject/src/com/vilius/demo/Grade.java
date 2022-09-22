package com.vilius.demo;

public class Grade extends Marks {
	
	private double percentage;
	private String grade;
	
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
