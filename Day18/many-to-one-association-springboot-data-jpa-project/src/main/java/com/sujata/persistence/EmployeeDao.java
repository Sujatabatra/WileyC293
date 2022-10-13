package com.sujata.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sujata.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
