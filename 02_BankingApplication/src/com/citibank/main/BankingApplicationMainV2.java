package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Account;

public class BankingApplicationMainV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to XYZ Bank");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Account Number");
		int accountNumber = scanner.nextInt();
		System.out.println("Enter Name");
		String name = scanner.next();
		System.out.println("Enter Balance");
		double balance = scanner.nextDouble();

		Account account = new Account();
		account.setAccountNumber(accountNumber);
		account.setName(name);
		account.setBalance(balance);

		System.out.println("Account Is Opened Successfully");
//		System.out.println("Account Number :-" + account.getAccountNumber());
//		System.out.println("Account Name : - " + account.getName());
//		System.out.println("Account Balance:-" + account.getBalance());

		System.out.println("Account Number " + account.getAccountNumber() + "\nName :: " + account.getName()
				+ "\nBalance :: " + account.getBalance());

	}

}
