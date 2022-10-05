package com.sujata.database;

import java.util.Map;
import java.util.TreeMap;

import com.sujata.entity.Employee;

public class EmployeeDataBase {

	private static Map<Integer, Employee> employeeList=new TreeMap<Integer, Employee>();

	static {
		employeeList.put(101, new Employee(101, "Adam", "Executive", "Sales", 25000));
		employeeList.put(102, new Employee(102, "Bran", "Sr. Associate", "IT", 68000));
		employeeList.put(103, new Employee(103, "Chander", "Manager", "Marketing", 245000));
		employeeList.put(104, new Employee(104, "Daneal", "Sr. Manager", "Sales", 325000));
		employeeList.put(105, new Employee(105, "Era", "Executive", "IT", 35000));
	}

	public static Map<Integer, Employee> getEmployeeList() {
		return employeeList;
	}

	public static void setEmployeeList(Map<Integer, Employee> employeeList) {
		EmployeeDataBase.employeeList = employeeList;
	}
	
	
}
