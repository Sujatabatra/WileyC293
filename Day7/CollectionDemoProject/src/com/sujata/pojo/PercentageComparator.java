package com.sujata.pojo;

import java.util.Comparator;
/*
 * if first object is greater , return 1
 * if second object is greater, return -1
 * if both objects are equal, return 0
 */
public class PercentageComparator implements Comparator<Student> {

	@Override
	public int compare(Student st1, Student st2) {
		if(st1.equals(st2))
			return 0;
		else if(st1.getPercentage()>st2.getPercentage())
			return 1;
		return -1;
	}

}
