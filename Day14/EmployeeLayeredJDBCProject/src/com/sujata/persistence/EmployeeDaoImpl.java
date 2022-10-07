package com.sujata.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import com.sujata.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public Collection<Employee> getAllReccord() {
		ArrayList<Employee> empList=new ArrayList<Employee>();
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		try {
//			1.Connect
//			1.1 Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			1.2 Connect To DataBase
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyc293", "root", "sujata");
			
			
//			2.Query
//			statement=connection.createStatement();
			preparedStatement=connection.prepareStatement("SELECT * FROM EMPLOYEES");
			
			
			
//			DQL : Data Query Language (Select query) : use executeQuery() method
//			ResultSet resultSet= statement.executeQuery("SELECT * FROM EMPLOYEES WHERE DEPTT='"+dept+"'");
			ResultSet resultSet=preparedStatement.executeQuery();
			
//			3.Process Result
			while(resultSet.next()) {
				int id=resultSet.getInt("EMPID");
				String name=resultSet.getString("EMPNAME");
				String desig=resultSet.getString("DESIGNATION");
				String deptt=resultSet.getString("DEPTT");
				double sal=resultSet.getDouble("SALARY");
				
				empList.add(new Employee(id, name, desig, deptt, sal));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
//			4.Close
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return empList;
	}

	@Override
	public Employee getRecordById(int employeeId) {
		return null;

	}

	@Override
	public Employee saveRecord(Employee employee) {
		return null;

	}

	@Override
	public Employee deleteRecord(int employeeId) {

		return null;
	}

}
