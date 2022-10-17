package com.sujata.controllers;

import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.entity.Employee;
import com.sujata.model.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/")
	public ModelAndView getMenuPageController() {
		return new ModelAndView("Menu");
	}

	@RequestMapping("/saveEmployeePage")
	public ModelAndView getSaveEmployeePage() {
		return new ModelAndView("InputEmployeeData");
	}

	@RequestMapping("/saveEmployee")
	public ModelAndView saveEmployeeController(HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView();
		int id = Integer.parseInt(request.getParameter("empId"));
		String name = request.getParameter("empName");
		String desig = request.getParameter("empDesignation");
		String deptt = request.getParameter("empDepartment");
		double sal = Double.parseDouble(request.getParameter("empSalary"));

		Employee employee = new Employee(id, name, deptt, desig, sal);
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
		return new ModelAndView("InputEmployeeIdForSearch");
	}

	@RequestMapping("/searchEmployee")
	public ModelAndView searchEmployeeController(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		Employee employee = employeeService.searchEmployeeById(Integer.parseInt(request.getParameter("empId")));

		if (employee != null) {
			modelAndView.addObject("employee", employee);
			modelAndView.setViewName("ShowEmployee");
		} else {
			modelAndView.addObject("message", "Employee with ID " + request.getParameter("empId") + " does not exist!");
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
