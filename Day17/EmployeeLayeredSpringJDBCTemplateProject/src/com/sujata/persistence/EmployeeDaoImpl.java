package com.sujata.persistence;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sujata.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Collection<Employee> getAllReccord() {
		String query = "SELECT * FROM EMPLOYEES";
		List<Employee> empList = jdbcTemplate.query(query, new EmployeeRowMapper());
		return empList;
	}

	@Override
	public Employee getRecordById(int employeeId) {
		try {
		String query = "SELECT * FROM EMPLOYEES WHERE EMPID=?";
		return jdbcTemplate.queryForObject(query, new EmployeeRowMapper(), employeeId);
		}
		catch(EmptyResultDataAccessException ex) {
			return null;
		}
	}

	@Override
	public int saveRecord(Employee employee) {
		String query = "INSERT INTO EMPLOYEES VALUES(?,?,?,?,?)";
		return jdbcTemplate.update(query, employee.getEmployeeId(), employee.getEmployeeName(),
				employee.getDesignation(), employee.getDepartment(), employee.getSalary());

	}

	@Override
	public int deleteRecord(int employeeId) {
		String query = "DELETE FROM EMPLOYEES WHERE EMPID=?";
		return jdbcTemplate.update(query, employeeId);
	}

	@Override
	public int updateRecord(int employeeId, double newSalary) {
		String query = "UPDATE EMPLOYEES SET salary=? WHERE EMPID=?";
		return jdbcTemplate.update(query, newSalary, employeeId);

	}

}
