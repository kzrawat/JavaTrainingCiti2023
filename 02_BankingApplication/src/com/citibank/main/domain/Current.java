package com.citibank.main.domain;

public class Current extends Account {

	private double overdraftAmount;
	private double overdraftLimit;

	public Current() {
		System.out.println("This is default constructor of Current");
	}

	public Current(int accountnumber, String name, double balance, double overdraftamount) {
		super(accountnumber, name, balance);
		this.overdraftAmount = overdraftamount;
		this.overdraftLimit = overdraftamount;
		System.out.println("This is Param constructor of Current");
	}

	public double getOverdraftAmount() {
		return overdraftAmount;
	}

	public void setOverdraftAmount(double overdraftAmount) {
		this.overdraftAmount = overdraftAmount;
	}

//	@Override
//	public boolean withdraw(double amount) {
//		if (amount > 0) {
//			if (getBalance() - amount >= 0) {
//				setBalance(getBalance() - amount);
//				return true;
//			}
//			if (getBalance() - amount < 0) {
//				if (amount - getBalance() <= overdraftAmount) {
//					setBalance(getBalance()- amount);
//					return true;
//				}
//				else {
//					System.out.println("Withdrawl limit is reached");
//					return false;
//				}
//			}
//			}
//		return false;
//	}
//	
//	@Override
//	public boolean deposit(double amount) {
//		if (amount > 0) {
//				setBalance(getBalance() + amount);
//				return true;
//		}
//		return false;
//	}

	@Override
	public boolean withdraw(double amount) {
		if (amount > 0) {
			if (getBalance() - amount >= 0) {
				setBalance(getBalance() - amount);
				return true;
			}
			if (getBalance() - amount < 0 && amount - getBalance() <= overdraftLimit) {
				overdraftAmount = overdraftAmount - (amount - getBalance());
				setBalance(0);
				return true;
			}
			if (getBalance() - amount < 0 && amount - getBalance() > overdraftLimit) {
				System.out.println("Withdraw can not be completed - limit reached");
				return false;
			}

		}
		return false;
	}

	@Override
	public boolean deposit(double amount) {
		if (amount > 0) {
			if (getBalance() == 0 && overdraftAmount < overdraftLimit) {
				if (amount > overdraftLimit - overdraftAmount) {
					setBalance(overdraftAmount + amount - overdraftLimit);
					overdraftAmount = overdraftLimit;
					return true;
				}
				if (amount <= overdraftLimit - overdraftAmount) {
					overdraftAmount = overdraftAmount + amount;
					return true;
				}
				return false;
			}
			else {
				setBalance(getBalance() + amount);
				return true;
			}
		}
		return false;
	}

}
