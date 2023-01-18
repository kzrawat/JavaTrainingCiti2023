package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Account;

public class BankingApplicationMainV3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account;
		Scanner scanner = new Scanner(System.in);

		char choice;
		double amount;
		String continueChoice;
		int accountNumber;
		String name;
		double balance;

		System.out.println("Welcome to XYZ Bank");

		System.out.println("Enter Account Number");
		accountNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Name");
		name = scanner.nextLine();
		System.out.println("Enter Balance");
		balance = scanner.nextDouble();

		account = new Account(accountNumber, name, balance);
//		account.setAccountNumber(accountNumber);
//		account.setName(name);
//		account.setBalance(balance);

		System.out.println("Account Opened Successfully");

		System.out.println("Account Number " + account.getAccountNumber() + "\nName :: " + account.getName()
				+ "\nBalance :: " + account.getBalance());

		System.out.println();

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
