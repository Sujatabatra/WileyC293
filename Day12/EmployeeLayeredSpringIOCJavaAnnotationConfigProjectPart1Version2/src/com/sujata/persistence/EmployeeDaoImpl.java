package com.sujata.persistence;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.sujata.database.EmployeeDataBase;
import com.sujata.entity.Employee;

@Component("dao")
public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public Collection<Employee> getAllReccord() {
		return EmployeeDataBase.getEmployeeList().values();
	}

	@Override
	public Employee getRecordById(int employeeId) {
		return EmployeeDataBase.getEmployeeList().get(employeeId);

	}

	@Override
	public Employee saveRecord(Employee employee) {
		return EmployeeDataBase.getEmployeeList().put(employee.getEmployeeId(), employee);

	}

	@Override
	public Employee deleteRecord(int employeeId) {
		
		return EmployeeDataBase.getEmployeeList().remove(employeeId);
	}

}
