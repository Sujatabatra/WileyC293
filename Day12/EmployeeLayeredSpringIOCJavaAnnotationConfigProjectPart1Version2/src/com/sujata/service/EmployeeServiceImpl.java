package com.sujata.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sujata.entity.Employee;
import com.sujata.entity.PaySlip;
import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.EmployeeDaoImpl;

@Component("service")
public class EmployeeServiceImpl implements EmployeeService {

	
	@Autowired
	private EmployeeDao employeeDao;
	
	
	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	
	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}


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
	
	/*
	 * House Rent Allowances : 20% of salary
	 * Fuel Allowance : 10% of Salary
	 *  random deductions1 : 8% of salary
	 *  random deduction2 : 5% of salary
	 *  ============================
	 *  Change Request 
	 *  House Rent Allowances : 25% of salary
	 *  Fuel Allowance : 15% of Salary
	 *  random deductions1 : 10% of salary
	 *  random deduction2 : 3% of salary
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
