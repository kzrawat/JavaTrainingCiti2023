package com.citibank.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ConnectionTest {

	public static void main(String[] args) {
		System.out.println("Main Starts");
		
		
		Scanner scanner = new Scanner(System.in);
		String [] nameUser = new String [5];
		String [] addressUser = new String [5];
		int i = 0;
		System.out.println("Data Feed Menu from User");
		
		do {
			System.out.println(" Enter the Name :" + (i+1) + ":");
			nameUser [i] = scanner.nextLine();
			System.out.println("Enter the Address :" + (i+1) + ":");
			addressUser [i] = scanner.nextLine();
			i++;
		} while (i < 5);
		
		System.out.println("All inputs have been taken  !!!");
		
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/citibankdb", "root", "root");
			System.out.println("1. Driver Loaded successfully");
			System.out.println("Connection successful !!");
			String sql = "insert into customer_details(name,address) values(?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			i=0;
			do {
				preparedStatement.setString(1, nameUser[i]);
				preparedStatement.setString(2, addressUser[i]);
				int rowCount = preparedStatement.executeUpdate();
				if (rowCount > 0) {
					System.out.println("Record inserted successfully");
				} else {
					System.out.println("No rows inserted !!");
				}
				i++;
			} while (i < 5);
		}catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Driver Not Found");
		} 
		finally {
			try {
				connection.close();
				System.out.println("Connection closed successfully");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Error in closing connection");
			}
		}

		System.out.println("Main Ends");

	}

}
