package com.citibank.main.domain;

public class Savings extends Account {
	
	boolean isSalary;
	public Savings() {
		System.out.println("This is default constructor of Savings");
	}
	public Savings(int accountNumber, String name, double balance, boolean isSalary) {
		super(accountNumber, name, balance);
		this.isSalary = isSalary;
	}
	public boolean isSalary() {
		return isSalary;
	}
	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}
	

	@Override
	public boolean withdraw(double amount) {
		if (amount > 0 && getBalance() >= amount) {
			
			if (isSalary) {
				setBalance(getBalance() - amount);
				return true;
			}
			if (isSalary == false && (getBalance() - amount >= 1500)) {
				setBalance(getBalance() - amount);
				return true;
			}
		}
		return false;
	}	

	@Override
	public boolean deposit(double amount) {
		if (amount > 0) {
			setBalance(getBalance() + amount);
			return true;
		}
		return false;
	}
}
