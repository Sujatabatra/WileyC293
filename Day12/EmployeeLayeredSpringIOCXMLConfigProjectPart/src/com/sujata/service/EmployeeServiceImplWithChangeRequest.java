package com.sujata.service;

import java.util.Collection;

import com.sujata.entity.Employee;
import com.sujata.entity.PaySlip;
import com.sujata.persistence.EmployeeDao;

public class EmployeeServiceImplWithChangeRequest extends EmployeeServiceImpl {

	public EmployeeServiceImplWithChangeRequest(EmployeeDao employeeDao) {
		super(employeeDao);

	}

	@Override
	public PaySlip generatePaySlip(int employeeId) {
		Employee employee = getEmployeeDao().getRecordById(employeeId);
		if (employee != null) {
			double hra = .25 * employee.getSalary();
			double fa = .15 * employee.getSalary();
			double deductionOne = .10 * employee.getSalary();
			double deductionTwo = .3 * employee.getSalary();
			double netPayableSalary = employee.getSalary() + hra + fa - deductionOne - deductionTwo;
			PaySlip employeePayslip = new PaySlip(employee, hra, fa, deductionOne, deductionTwo, netPayableSalary);
			return employeePayslip;
		}
		return null;
	}

}
