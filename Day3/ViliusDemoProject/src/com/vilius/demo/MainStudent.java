package com.vilius.demo;

import com.sujata.demo.Student;

public class MainStudent {

	public static void main(String[] args) {
		Student student=new Student();
		student.setRollNo(101);
		student.setName("AAAA");
		student.display();
		System.out.println("=======================");
		
		Marks marks=new Marks();
		marks.inputStudentDetailsWithMarks(111, "BBBBB", 90, 78, 56);
		marks.displayStudentDetailsWithMarks();
		
	
	}

}
