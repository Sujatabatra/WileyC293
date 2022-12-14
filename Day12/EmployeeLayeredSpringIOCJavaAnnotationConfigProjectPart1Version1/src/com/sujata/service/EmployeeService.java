package com.sujata.service;

import java.util.Collection;

import com.sujata.entity.Employee;
import com.sujata.entity.PaySlip;

public interface EmployeeService {

	Collection<Employee> getAllEmployee();
	Employee searchEmployeeById(int employeeId);
	boolean saveEmployee(Employee employee);
	boolean deleteEmployee(int employeeId);
	boolean incrementSalary(int employeeId,int increment);
	public PaySlip generatePaySlip(int employeeId);
}
