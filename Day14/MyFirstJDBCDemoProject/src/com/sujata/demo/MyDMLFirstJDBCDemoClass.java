package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MyDMLFirstJDBCDemoClass {

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
			preparedStatement=connection.prepareStatement("INSERT INTO EMPLOYEES VALUES(?,?,?,?,?)");
			
			System.out.println("Enter Employee ID : ");
			int id=scanner.nextInt();
			System.out.println("Enter Employee Name : ");
			String name=scanner.next();
			System.out.println("Enter Designation : ");
			String desig=scanner.next();
			System.out.println("Enter Department Name : ");
			String dept=scanner.next();
			System.out.println("Enter Salary : ");
			double sal=scanner.nextDouble();
			
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, desig);
			preparedStatement.setString(4, dept);
			preparedStatement.setDouble(5,sal);
//			String query="INSERT INTO EMPLOYEES VALUES("+id+",'"+name+"','"+desig+"','"+dept+"',"+sal+")";
//			System.out.println(query);
//			DML : Data Manipulation Language (insert,delete,update query) : use executeUpdate() method
			
			int rows=preparedStatement.executeUpdate();
			
//			3.Process Result
			if(rows>0)
				System.out.println("Employee Record Saved");
			else
				System.out.println("Employee Record Not Saved");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Employee Record Not Saved");
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
