package com.sujata.resource;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.entity.Employee;
import com.sujata.entity.EmployeeList;
import com.sujata.entity.PaySlip;
import com.sujata.service.EmployeeService;

@RestController
public class EmployeeResource {

	@Autowired
	private EmployeeService employeeService;
	
	@CrossOrigin
//	@RequestMapping(path = "/employees",method = RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	@GetMapping(path = "/employees",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeList getAllEmployeesResource(){
		return  new EmployeeList(employeeService.getAllEmployee()) ;
	}
	
	
	@CrossOrigin
	@GetMapping(path = "/employees/{eId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployeeByIdResource(@PathVariable("eId") int id) {
		return employeeService.searchEmployeeById(id);
	}
	
	@CrossOrigin
	@GetMapping(path = "/employees/payslip/{eId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public PaySlip getPaySlipResource(@PathVariable("eId") int id) {
		return employeeService.generatePaySlip(id);
	}
	
	@CrossOrigin
	@PostMapping(path = "/employees",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public Employee addEmployeeResource(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	
	@CrossOrigin
	@DeleteMapping(path = "/employees/{eId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee deleteEmployeeResourse(@PathVariable("eId") int id) {
		return employeeService.deleteEmployee(id);
	}
	
	@CrossOrigin
	@PutMapping(path = "/employees/{id}/{salary}")
	public boolean updateEmployeeSalaryResource(@PathVariable("id") int id,@PathVariable("salary") int salary) {
		return employeeService.incrementSalary(id, salary);
	}
}
