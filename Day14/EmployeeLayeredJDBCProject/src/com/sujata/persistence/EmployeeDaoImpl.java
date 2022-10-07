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
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		Employee employee=null;
		try {
//			1.Connect
//			1.1 Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			1.2 Connect To DataBase
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyc293", "root", "sujata");
			
			
//			2.Query
//			statement=connection.createStatement();
			preparedStatement=connection.prepareStatement("SELECT * FROM EMPLOYEES WHERE EMPID=?");
			
			preparedStatement.setInt(1, employeeId);
			
			
//			DQL : Data Query Language (Select query) : use executeQuery() method
//			ResultSet resultSet= statement.executeQuery("SELECT * FROM EMPLOYEES WHERE DEPTT='"+dept+"'");
			ResultSet resultSet=preparedStatement.executeQuery();
			
//			3.Process Result
			if(resultSet.next()) {
				int id=resultSet.getInt("EMPID");
				String name=resultSet.getString("EMPNAME");
				String desig=resultSet.getString("DESIGNATION");
				String deptt=resultSet.getString("DEPTT");
				double sal=resultSet.getDouble("SALARY");
				
				employee=new Employee(id, name, desig, deptt, sal);
			}
			return employee;
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			return null;
		}
		finally {
//			4.Close
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return null;

	}

	@Override
	public int saveRecord(Employee employee) {
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
			preparedStatement=connection.prepareStatement("INSERT INTO EMPLOYEES VALUES(?,?,?,?,?)");
			
					
			preparedStatement.setInt(1, employee.getEmployeeId());
			preparedStatement.setString(2, employee.getEmployeeName());
			preparedStatement.setString(3, employee.getDesignation());
			preparedStatement.setString(4, employee.getDepartment());
			preparedStatement.setDouble(5,employee.getSalary());
//			String query="INSERT INTO EMPLOYEES VALUES("+id+",'"+name+"','"+desig+"','"+dept+"',"+sal+")";
//			System.out.println(query);
//			DML : Data Manipulation Language (insert,delete,update query) : use executeUpdate() method
			
			int rows=preparedStatement.executeUpdate();
			
//			3.Process Result
			
			return rows;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			return 0;
		}
		finally {
//			4.Close
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return 0;

	}

	@Override
	public Employee deleteRecord(int employeeId) {

		return null;
	}

}
