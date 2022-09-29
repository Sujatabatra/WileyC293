package com.sujata.service;

import java.util.Collection;

import com.sujata.entity.Employee;
import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao=new EmployeeDaoImpl();
	
	@Override
	public Collection<Employee> getAllEmployee() {
		return employeeDao.getAllReccord();
	}

	@Override
	public Employee searchEmployeeById(int employeeId) {
		
		return employeeDao.getRecordById(employeeId);
		
	}

}
