package com.sujata.service;

import java.util.Collection;

import com.sujata.entity.Employee;
import com.sujata.entity.PaySlip;
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
		int rows=employeeDao.saveRecord(employee);
		if(rows>0)
			return true;
		return false;
	}

	@Override
	public boolean deleteEmployee(int employeeId) {
		int rows=employeeDao.deleteRecord(employeeId);
		if(rows>0)
			return true;
		return false;
	}

	@Override
	public boolean incrementSalary(int employeeId, int increment) {
		Employee employee=employeeDao.getRecordById(employeeId);
		if(employee!=null) {
		int rows=employeeDao.updateRecord(employeeId,increment+employee.getSalary());
		if(rows>0)
			return true;
		}
		return false;
	}
	
	/*
	 * House Rent Allowances : 20% of salary
	 * Fuel Allowance : 10% of Salary
	 *  random deductions1 : 8% of salary
	 *  random deduction2 : 5% of salary
	 */
	public PaySlip generatePaySlip(int employeeId) {
		Employee employee=employeeDao.getRecordById(employeeId);
		if(employee!=null) {
			double hra=.20*employee.getSalary();
			double fa=.10*employee.getSalary();
			double deductionOne=.08*employee.getSalary();
			double deductionTwo=.05*employee.getSalary();
			double netPayableSalary=employee.getSalary()+hra+fa-deductionOne-deductionTwo;
			PaySlip employeePayslip=new PaySlip(employee, hra, fa, deductionOne, deductionTwo, netPayableSalary);
			return employeePayslip;
		}
		return null;
	}

}
