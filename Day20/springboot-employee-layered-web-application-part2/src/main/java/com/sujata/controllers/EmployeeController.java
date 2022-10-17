package com.sujata.controllers;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.entity.Employee;
import com.sujata.model.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@ModelAttribute("empDepartments")
	List<String> getDepartment() {
		return employeeService.getAllEmployee().stream()
		.map(Employee::getEmpDepartment)
		.distinct()
		.collect(Collectors.toList());
	}

	@ModelAttribute("empDesignations")
	List<String> getDesignation() {
		return employeeService.getAllEmployee().stream()
		.filter(employee->employee.getEmpDesignation()!=null)
		.map(Employee::getEmpDesignation)
		.distinct()
		.collect(Collectors.toList());
	}
	
	@ModelAttribute("empIds")
	List<Integer> getEmployeeIds() {
		return employeeService.getAllEmployee().stream()
		.map(Employee::getEmpId)
		.collect(Collectors.toList());
	}
	
	
	@RequestMapping("/")
	public ModelAndView getMenuPageController() {
		return new ModelAndView("Menu");
	}

	@RequestMapping("/saveEmployeePage")
	public ModelAndView getSaveEmployeePage() {
		return new ModelAndView("InputEmployeeData", "command", new Employee());
	}

	@RequestMapping("/saveEmployee")
	public ModelAndView saveEmployeeController(@ModelAttribute("command") Employee employee) {

		ModelAndView modelAndView = new ModelAndView();

		String message = null;
		if (employeeService.saveEmployee(employee)) {
			message = "Employee Added";
		} else
			message = "Employee Not Added";

		modelAndView.addObject("message", message);

		modelAndView.setViewName("Output");

		return modelAndView;
	}

	@RequestMapping("/searchByIdPage")
	public ModelAndView searchEmployeeByIdPageController() {
		return new ModelAndView("InputEmployeeIdForSearch","emp",new Employee());
	}

	@RequestMapping("/searchEmployee")
//	public ModelAndView searchEmployeeController(@RequestParam("empId") int employeeId) {
	public ModelAndView searchEmployeeController(@ModelAttribute("emp") Employee empl) {
		ModelAndView modelAndView = new ModelAndView();
		Employee employee = employeeService.searchEmployeeById(empl.getEmpId());

		if (employee != null) {
			modelAndView.addObject("employee", employee);
			modelAndView.setViewName("ShowEmployee");
		} else {
			modelAndView.addObject("message", "Employee with ID " + empl.getEmpId() + " does not exist!");
			modelAndView.setViewName("Output");
		}
		return modelAndView;
	}

	@RequestMapping("/showAllEmployees")
	public ModelAndView showAllEmployeesController() {
		ModelAndView modelAndView = new ModelAndView();
		Collection<Employee> empList = employeeService.getAllEmployee();
		modelAndView.addObject("employees", empList);
		modelAndView.setViewName("ShowAllEmployees");

		return modelAndView;
	}
}
