package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Account;
import com.citibank.main.domain.Current;
import com.citibank.main.domain.Savings;

public class BankingApplicationMainV6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		char choice;
		char acctchoice;
		String savingschoice;
		double amount;
		double overdraftAmount = 0;
		int accountNumber;
		String name;
		double balance;
		boolean isSalary = false;

		System.out.println("Welcome to XYZ Bank");

		System.out.println("Account Menu :");
		System.out.println("1. Savings Account :");
		System.out.println("2. Current Account :");
		acctchoice = scanner.next().charAt(0);

		Account accountype = null;

		switch (acctchoice) {
		case '1':

			System.out.println("Do you want to open Salary Account");
			isSalary = scanner.nextBoolean();

			break;

		case '2':

			System.out.println("Enter the Overdraft Amount");
			overdraftAmount = scanner.nextDouble();

			break;

		default:
			System.out.println("Invalid Choice");
			break;

		}

		System.out.println("Enter Account Number");
		accountNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Name");
		name = scanner.nextLine();
		System.out.println("Enter Balance");
		balance = scanner.nextDouble();

		System.out.println(acctchoice);
		if (acctchoice == '1') {
			accountype = new Savings(accountNumber, name, balance, isSalary);
		}

		if (acctchoice == '2') {
			accountype = new Current(accountNumber, name, balance, overdraftAmount);
		}

		System.out.println("Account Opened Successfully");

		System.out.println("Account Number " + accountype.getAccountNumber() + "\nName :: " + accountype.getName()
				+ "\nBalance :: " + accountype.getBalance());

		System.out.println();

		repeatmenu(scanner, accountype);

	}

	private static void repeatmenu(Scanner scanner, Account account) {
		String continueChoice;
		do {
			showTransactionMenu(scanner, account);
			System.out.println("Do you want to continue");
			continueChoice = scanner.next();

		} while (continueChoice.equalsIgnoreCase("yes") || continueChoice.equalsIgnoreCase("Y"));
		System.out.println("Thank You !!");
	}

	private static void showTransactionMenu(Scanner scanner, Account account) {
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
			if (account.withdraw(amount)) {
				System.out.println("Withdrawal Successful ");
				System.out.println("Balance is " + account.getBalance());
			} else
				System.out.println("Withdrawal not possible");
			break;
		case '2':
			System.out.println("Enter the amount to Deposit");
			amount = scanner.nextDouble();
			if (account.deposit(amount)) {
				System.out.println("deposit Successful ");
				System.out.println("Balance is " + account.getBalance());
			} else
				System.out.println("deposite not possible");
			break;

		case '3':
			System.out.println("Below is the balance detail");
			System.out.println("Balance is : " + account.getBalance());
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