package com.citibank.main.domain;

public class AccountThread implements Runnable {
	
	private Account account;
	private double balance;
	private int choice;
	
	
	public AccountThread(Account account, double balance, int choice) {
		super();
		this.account = account;
		this.balance = balance;
		this.choice = choice;
	}


	@Override
	public void run() {
		
		if (choice == 1)
		account.withDraw(balance);
		
		if (choice == 2)
			account.deposit(balance);
		
	}
	

}
