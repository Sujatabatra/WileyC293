package com.sujata.model.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sujata.entity.Employee;
import com.sujata.entity.EmployeeList;
import com.sujata.entity.PaySlip;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public Collection<Employee> getAllEmployee() {
		EmployeeList employeeList = restTemplate.getForObject("http://localhost:8082/employees", EmployeeList.class);
		return employeeList.getEmployees();
	}

	@Override
	public Employee searchEmployeeById(int employeeId) {
		Employee employee = restTemplate.getForObject("http://localhost:8082/employees/" + employeeId, Employee.class);
		return employee;

	}

	@Override
	public boolean saveEmployee(Employee employee) {
		Employee empl = restTemplate.postForObject("http://localhost:8082/employees", employee, Employee.class);
		if (empl != null)
			return true;
		return false;
	}

	@Override
	public boolean deleteEmployee(int employeeId) {
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<Employee> entity = new HttpEntity<Employee>(headers);
		Employee employee = restTemplate
				.exchange("http://localhost:8082/employees/" + employeeId, HttpMethod.DELETE, entity, Employee.class)
				.getBody();
		if (employee != null)
			return true;

		return false;

	}

	@Override
	public boolean incrementSalary(int employeeId, int increment) {

		HttpHeaders headers = new HttpHeaders();
		HttpEntity<Employee> entity = new HttpEntity<Employee>(headers);
		boolean result = restTemplate.exchange("http://localhost:8082/employees/" + employeeId + "/" + increment,
				HttpMethod.PUT, entity, Boolean.class).getBody();

		return result;
	}

	/*
	 * House Rent Allowances : 20% of salary Fuel Allowance : 10% of Salary random
	 * deductions1 : 8% of salary random deduction2 : 5% of salary
	 */
	public PaySlip generatePaySlip(int employeeId) {
		Employee employee = searchEmployeeById(employeeId);
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
//		return employeeDao.findByEmpDepartment(deptt);
		return null;
	}

	@Override
	public List<String> searchByEmpSalary(double salary) {
//		return employeeDao.searchEmployeesGreaterThanSalary(salary);
		return null;
	}

}
