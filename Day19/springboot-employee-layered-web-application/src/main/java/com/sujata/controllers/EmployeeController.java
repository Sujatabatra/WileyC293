package com.sujata.controllers;

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
		
		ModelAndView modelAndView=new ModelAndView();
		int id=Integer.parseInt(request.getParameter("empId"));
		String name=request.getParameter("empName");
		String desig=request.getParameter("empDesignation");
		String deptt=request.getParameter("empDepartment");
		double sal=Double.parseDouble(request.getParameter("empSalary"));
		
		Employee employee=new Employee(id, name, deptt, desig, sal);
		String message=null;
		if(employeeService.saveEmployee(employee)) {
			message="Employee Added";
		}
		else
			message="Employee Not Added";
		
		modelAndView.addObject("message", message);
		
		modelAndView.setViewName("Output");
		
		return modelAndView;
	}
}
