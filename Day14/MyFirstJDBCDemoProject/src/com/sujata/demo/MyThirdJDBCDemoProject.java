package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MyThirdJDBCDemoProject {

	public static void main(String[] args) {
		

		Connection connection=null;
		PreparedStatement preparedStatement=null;
		Scanner scanner=new Scanner(System.in);
		try {
//			1.Connect
//			1.1 Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			1.2 Connect To DataBase
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyc293", "root", "sujata");
			
			
//			2.Query
//			statement=connection.createStatement();
			preparedStatement=connection.prepareStatement("SELECT * FROM EMPLOYEES WHERE DEPTT=?");
			
			
			System.out.println("Enter Department Name : ");
			String dept=scanner.next();
			preparedStatement.setString(1, dept);
			
			
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
				System.out.println(id+"  "+name+"  "+desig+"  "+deptt+"  "+sal);
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

	}

}
