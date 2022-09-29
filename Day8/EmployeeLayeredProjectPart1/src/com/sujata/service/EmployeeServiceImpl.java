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

	@Override
	public boolean saveEmployee(Employee employee) {
		Employee emp=employeeDao.saveRecord(employee);
		if(emp==null)
			return true;
		return false;
	}

	@Override
	public boolean deleteEmployee(int employeeId) {
		Employee employee=employeeDao.deleteRecord(employeeId);
		if(employee!=null)
			return true;
		return false;
	}

	@Override
	public boolean incrementSalary(int employeeId, int increment) {
		Employee employee=employeeDao.getRecordById(employeeId);
		if(employee!=null) {
			employee.setSalary(employee.getSalary()+increment);
			employeeDao.saveRecord(employee);
			return true;
		}
		return false;
	}

}
