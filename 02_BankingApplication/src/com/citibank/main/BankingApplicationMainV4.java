package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Savings;

public class BankingApplicationMainV4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Savings savings;
		Scanner scanner = new Scanner(System.in);

		char choice;
		double amount;
		String continueChoice;
		int accountNumber;
		String name;
		double balance;
		boolean isSalary;

		System.out.println("Welcome to XYZ Bank");

		System.out.println("Enter Account Number");
		accountNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Name");
		name = scanner.nextLine();
		System.out.println("Enter Balance");
		balance = scanner.nextDouble();
		System.out.println("Do you want to open Salary Account");
		isSalary = scanner.nextBoolean();

		savings = new Savings(accountNumber, name, balance, isSalary);
//		account.setAccountNumber(accountNumber);
//		account.setName(name);
//		account.setBalance(balance);

		System.out.println("Account Opened Successfully");

		System.out.println("Account Number " + savings.getAccountNumber() + "\nName :: " + savings.getName()
				+ "\nBalance :: " + savings.getBalance());

		System.out.println();

		do {

			showTransactionMenu(scanner, savings);
			System.out.println("Do you want to continue");
			continueChoice = scanner.next();

		} while (continueChoice.equalsIgnoreCase("yes") || continueChoice.equalsIgnoreCase("Y"));
		System.out.println("Thank You !!");
	}

	private static void showTransactionMenu(Scanner scanner, Savings savings) {
		char choice;
		double amount;
		System.out.println(" ----- Transaction Menu -------");
		System.out.println("Press 1 to Perform Withdrawal");
		System.out.println("Press 2 to Perform Deposit");
		System.out.println("Press 3 to Check Balance ");
		System.out.println("Press 4 for Exit");

		System.out.println("Enter your Choice");

		choice = scanner.next().charAt(0);

		switch (choice) {
		case '1':
			System.out.println("Enter the amount to Withdraw");
			amount = scanner.nextDouble();
			if (savings.withdraw(amount)) {
				System.out.println("Withdrawal Successful ");
				System.out.println("Balance is " + savings.getBalance());
			} else
				System.out.println("Withdrawal not possible");
			break;
		case '2':
			System.out.println("Enter the amount to Deposit");
			amount = scanner.nextDouble();
			if (savings.deposit(amount)) {
				System.out.println("deposit Successful ");
				System.out.println("Balance is " + savings.getBalance());
			} else
				System.out.println("deposite not possible");
			break;

		case '3':
			System.out.println("Below is the balance detail");
			System.out.println("Balance is : " + savings.getBalance());
			break;
		case '4':
			System.out.println("Thanks for banking with us");
			System.out.println("Have a Nice Day");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Choice");
			break;

		}
	}

}
