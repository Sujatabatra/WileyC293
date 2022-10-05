package com.sujata.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.EmployeeDaoImpl;
import com.sujata.presentation.EmployeePresentation;
import com.sujata.presentation.EmployeePresentationImpl;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;
import com.sujata.service.EmployeeServiceImplWithChangeRequest;

@Configuration
public class EmployeeConfig {

	@Bean("dao")
	public EmployeeDao getEmployeeDao() {
		return new EmployeeDaoImpl();
	}
	
	@Bean("service")
	public EmployeeService getEmployeeService() {
//		return new EmployeeServiceImpl(getEmployeeDao());
		return new EmployeeServiceImplWithChangeRequest(getEmployeeDao());
	}
	
	@Bean("presentation")
	public EmployeePresentation getEmployeePresentation() {
		EmployeePresentationImpl employeePresentationImpl=new EmployeePresentationImpl();
		employeePresentationImpl.setEmployeeService(getEmployeeService());
		return employeePresentationImpl;
	}
}
