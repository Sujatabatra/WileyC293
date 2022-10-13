package com.sujata.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sujata.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	
	public List<Employee> findByEmpDepartment(String deptt);

}
