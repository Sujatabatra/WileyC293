package com.sujata.presentation;

import java.util.Collection;
import java.util.Scanner;

import com.sujata.entity.Employee;
import com.sujata.entity.PaySlip;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;

public class EmployeePresentationImpl implements EmployeePresentation {

//	private EmployeeService employeeService=new EmployeeServiceImpl();
	
	private EmployeeService employeeService;
	
	
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@Override
	public void showMenu() {
		System.out.println("1. List All Employees");
		System.out.println("2. Search Employee By ID");
		System.out.println("3. Add New Employee ");
		System.out.println("4. Delete Employee By ID ");
		System.out.println("5. Increment Employee Salary");
		System.out.println("6. Generate PaySlip");
		System.out.println("7. Exit");
	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		int employeeId=0;
		switch (choice) {
		case 1:
			Collection<Employee> empList=employeeService.getAllEmployee();
			for(Employee emp:empList) {
				System.out.println(emp);
			}
			break;
		case 2:
			System.out.println("Enter Employee ID to be searched for : ");
			employeeId=scanner.nextInt();
			Employee employee=employeeService.searchEmployeeById(employeeId);
			if(employee!=null)
				System.out.println(employee);
			else
				System.out.println("Employee with id "+employeeId+" does not exist!");
			break;
		case 3:
			Employee emp=new Employee();
			System.out.println("Enter Employee Id : ");
			emp.setEmployeeId(scanner.nextInt());
			System.out.println("Enter Employee Name : ");
			emp.setEmployeeName(scanner.next());
			System.out.println("Enter Designation : ");
			emp.setDesignation(scanner.next());
			System.out.println("Enter Department : ");
			emp.setDepartment(scanner.next());
			System.out.println("Enter Employee Salary : ");
			emp.setSalary(scanner.nextDouble());
			
			if(employeeService.saveEmployee(emp))
				System.out.println("New Employee Added!");
			else
				System.out.println("Employee Updated!");
			break;
		case 4:
			System.out.println("Enter Employee Id to delete : ");
			employeeId=scanner.nextInt();
			if(employeeService.deleteEmployee(employeeId))
				System.out.println("Employee Deleted for ID : "+employeeId);
			else
				System.out.println("Employee NOT Deleted for ID : "+employeeId);
			break;
		case 5:
			System.out.println("Enter Employee ID for salary increment : ");
			employeeId=scanner.nextInt();
			System.out.println("Enter Incremented Amount in the salary : ");
			int amount=scanner.nextInt();
			if(employeeService.incrementSalary(employeeId, amount))
				System.out.println("Salary Incremented ");
			else
				System.out.println("Employee with Id "+employeeId+" does not exist");
			break;
		case 6:
			System.out.println("Enter Employee ID for Payslip Generation : ");
			employeeId=scanner.nextInt();
			PaySlip paySlip=employeeService.generatePaySlip(employeeId);
			if(paySlip==null)
				System.out.println("Employee with ID "+employeeId+" does not exist!");
			else
				System.out.println(paySlip);
			break;
		case 7:
			System.out.println("Thanks for using Employee Management System!");
			System.exit(0);
		default:
			System.out.println("Invalid Choice ");
			break;
		}

	}

}
