package com.citibank.main;

import java.util.Iterator;
import java.util.Scanner;

import com.citibank.main.domain.Employee;

public class EmplyeeMain {

	public static void main(String[] args) {
//		System.out.println("Defacult Constructor");

		Employee employee1 = new Employee(101, "Vivek", 1000);
		Employee employee2 = new Employee(101, "Paritosh", 1000);
		Employee employee3 = new Employee(101, "Kapil", 1000);
		Employee employee4 = new Employee(101, "Debayan", 1000);
		Employee employee5 = new Employee(101, "Uday", 1000);

//	System.out.println(employee1.getEmployeeId());
//	System.out.println(employee1.getName());
//	System.out.println(employee1.getSalary());

		System.out.println("---------------------------");

		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
		System.out.println(employee4);
		System.out.println(employee5);

		System.out.println("---------------------------");

		Employee[] allEmployees = new Employee[5];
		Scanner scanner = new Scanner(System.in);
		int employeeId;
		String name;
		double salary;
		
		
		for (int i = 0; i < allEmployees.length; i++) {
			System.out.println("Enter Employee Id");
			employeeId = scanner.nextInt();
			System.out.println("Enter Employee Name");
			name = scanner.next();
			System.out.println("Enter Employee Salary");
			salary = scanner.nextDouble();
			
			Employee employee = new Employee(employeeId, name, salary);
			allEmployees[i]= employee;
		}
		for (Employee employee : allEmployees) {
			System.out.println(employee);
		}
	}

}
