package com.sujata.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sujata.entity.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		int id = resultSet.getInt("EMPID");
		String name = resultSet.getString("EMPNAME");
		String desig = resultSet.getString("DESIGNATION");
		String deptt = resultSet.getString("DEPTT");
		double sal = resultSet.getDouble("SALARY");

		return new Employee(id, name, desig, deptt, sal);
		
	}

}
