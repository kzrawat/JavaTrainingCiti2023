package com.citibank.main.domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyClass {

	private double num1;
	private double num2;
	private double result;

	public void accept() {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter Numeric Number 1 : ");
			num1 = scanner.nextInt();
			System.out.println("Enter Numeric Number 1 : ");
			num2 = scanner.nextInt();

		} 
		catch (InputMismatchException e) {
			System.out.println("Invalid input for number 1 from user");
			System.out.println("Program will continue it's execution");
			System.out.println(e.getMessage());
		}

		catch (Exception e) {
			System.out.println("Exception in Code!!");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Thank You !!!");
			scanner.close();
			System.out.println("Again Thank You");
		}
	}

	public void calculate() {
		System.out.println("Calculating result");
		result = num1 / num2;

	}

	public void display() {
		System.out.println("Number 1 :" + num1);
		System.out.println("Number 2 :" + num2);
		System.out.println("Division result of num1/num2 is :" + result);

	}
}
