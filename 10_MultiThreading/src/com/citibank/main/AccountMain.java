package com.citibank.main;

import com.citibank.main.domain.Account;
import com.citibank.main.domain.AccountThread;

public class AccountMain {

	public static void main(String[] args) {
		System.out.println("Main Starts");


		Account account = new Account(50000);

		AccountThread myThreadOne = new AccountThread(account,20000, 1);
		Thread withdrawThread = new Thread(myThreadOne);
		withdrawThread.start();
		
		AccountThread myThreadTwo = new AccountThread(account,15000, 2);
		Thread depositThread = new Thread(myThreadTwo);
		depositThread.start();
		

		System.out.println("Main ends");

	}

}
