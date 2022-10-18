package com.sujata.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.entity.Employee;
import com.sujata.entity.PaySlip;
import com.sujata.persistence.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Collection<Employee> getAllEmployee() {
		return employeeDao.findAll();
	}

	@Override
	public Employee searchEmployeeById(int employeeId) {

		return employeeDao.findById(employeeId).orElse(null);

	}

	@Override
	public Employee saveEmployee(Employee employee) {
//		employeeDao.save(employee);
//		return true;
		try {
		int rows = employeeDao.insertEmployee(employee.getEmpId(), employee.getEmpName(), employee.getEmpDesignation(),
				employee.getEmpDepartment(), employee.getEmpSalary());
		if (rows > 0)
			return employee;
		}
		catch(Exception ex) {
			return null;
		}
		return null;
	}

	@Override
	public Employee deleteEmployee(int employeeId) {
		Employee emp=searchEmployeeById(employeeId);
		if(emp!=null) {
		employeeDao.deleteById(employeeId);
		return emp;
		}
		return null;

	}

	@Override
	public boolean incrementSalary(int employeeId, int increment) {
		Employee employee = employeeDao.findById(employeeId).orElse(null);
//		if (employee != null) {
//			employee.setEmpSalary(employee.getEmpSalary() + increment);
//			employeeDao.save(employee);
//
//			return true;
//		}
//		return false;
		if (employee != null) {
			if (employeeDao.updateSalary(employeeId, increment + employee.getEmpSalary()) > 0)
				return true;
		}

		return false;
	}

	/*
	 * House Rent Allowances : 20% of salary Fuel Allowance : 10% of Salary random
	 * deductions1 : 8% of salary random deduction2 : 5% of salary
	 */
	public PaySlip generatePaySlip(int employeeId) {
		Employee employee = employeeDao.findById(employeeId).orElse(null);
		if (employee != null) {
			double hra = .20 * employee.getEmpSalary();
			double fa = .10 * employee.getEmpSalary();
			double deductionOne = .08 * employee.getEmpSalary();
			double deductionTwo = .05 * employee.getEmpSalary();
			double netPayableSalary = employee.getEmpSalary() + hra + fa - deductionOne - deductionTwo;
			PaySlip employeePayslip = new PaySlip(employee, hra, fa, deductionOne, deductionTwo, netPayableSalary);
			return employeePayslip;
		}
		return null;
	}

	@Override
	public List<Employee> searchEmployeesInSpecificDeptt(String deptt) {
		return employeeDao.findByEmpDepartment(deptt);
	}

	@Override
	public List<String> searchByEmpSalary(double salary) {
		return employeeDao.searchEmployeesGreaterThanSalary(salary);

	}

}
