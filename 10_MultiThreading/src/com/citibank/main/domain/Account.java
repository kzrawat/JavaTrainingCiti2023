package com.citibank.main.domain;

public class Account {

	private double balance;

	public Account(double balance) {
//		super();
		this.balance = balance;
	}

	public synchronized void withDraw(double amount) {

		System.out.println("Withdraw Called ");
		System.out.println("Balance before withdraw :" + balance);
		if (balance > 0 && balance >= amount)
		balance = balance - amount;

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Error while doing Sleep for Thread");
		}

		System.out.println("Balance after withdraw :" + balance);

	}

	public synchronized void deposit(double amount) {

		System.out.println("Deposit Called ");
		System.out.println("Balance before deposit :" + balance);
		balance = balance + amount;

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Error while doing Sleep for Thread");
		}

		System.out.println("Balance after deposit :" + balance);

	}

}
