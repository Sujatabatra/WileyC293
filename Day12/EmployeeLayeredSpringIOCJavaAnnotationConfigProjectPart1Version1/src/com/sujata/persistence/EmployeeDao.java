package com.sujata.persistence;

import java.util.Collection;

import com.sujata.entity.Employee;

public interface EmployeeDao {

	Collection<Employee> getAllReccord();
	Employee getRecordById(int employeeId);
	Employee saveRecord(Employee employee);
	Employee deleteRecord(int employeeId);
	
}
