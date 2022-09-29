package com.sujata.presentation;

import java.util.Collection;
import java.util.Scanner;

import com.sujata.entity.Employee;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;

public class EmployeePresentationImpl implements EmployeePresentation {

	private EmployeeService employeeService=new EmployeeServiceImpl();
	
	@Override
	public void showMenu() {
		System.out.println("1. List All Employees");
		System.out.println("2. Search Employee By ID");
		System.out.println("3. Exit");
	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		switch (choice) {
		case 1:
			Collection<Employee> empList=employeeService.getAllEmployee();
			for(Employee emp:empList) {
				System.out.println(emp);
			}
			break;
		case 2:
			System.out.println("Enter Employee ID to be searched for : ");
			int employeeId=scanner.nextInt();
			Employee employee=employeeService.searchEmployeeById(employeeId);
			if(employee!=null)
				System.out.println(employee);
			else
				System.out.println("Employee with id "+employeeId+" does not exist!");
			break;
		case 3:
			System.out.println("Thanks for using Employee Management System!");
			System.exit(0);
		default:
			break;
		}

	}

}
