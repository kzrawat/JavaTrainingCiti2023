package com.citibank.main;

import com.citibank.main.domain.Account;

public class BankingApplicationMain {

	public static void main(String[] args) {
		System.out.println("Main Start");
		
		//object creation
		Account account = new Account();
//		account.accountNumber = 101;
//		account.name = "Vivek Gohli";
//		account.balance = 1000.00;
		
		account.setAccountNumber(101);
		account.setName("Kapil");
		account.setBalance(1000.00);
		
		System.out.println("current details :");
		System.out.println("Account Number --:" + account.getAccountNumber());
		System.out.println("Account Name --: " + account.getName());
		System.out.println("Account Balance --: " + account.getBalance());
		
		
		//Function/Method Calling
		
		System.out.println("Updated Details:");
		if (account.deposit(200.00)== true) {
			System.out.println("200 deposited");
			System.out.println("Balance After Deposit-->" + account.getBalance());
		}
		
		
		if (account.withdraw(100.00)== true) {
			System.out.println("100 withdrawaled");
			System.out.println("Balance After Withdrawal-->" + account.getBalance());
		}
				
		System.out.println("Main End");
		
		
	}
}
