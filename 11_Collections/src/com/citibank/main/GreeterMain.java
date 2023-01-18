package com.citibank.main;

import com.citibank.main.domain.GoodAfternoonGreeter;
import com.citibank.main.domain.GoodMorningGreeter;
import com.citibank.main.domain.Greeter;

public class GreeterMain {

	public static void main(String[] args) {

		Greeter greeterGM = new GoodMorningGreeter();
		greeterGM.greet();

		System.out.println("------------------------");

		Greeter greeterGA = new GoodAfternoonGreeter();
		greeterGA.greet();

		System.out.println("------------------------");
//		-------Annomyos Class
		Greeter goodEveningGreeter = new Greeter() {
			@Override
			public void greet() {
				System.out.println("Good Evening Java !!!");
			}
		};
		System.out.println(goodEveningGreeter.getClass());
		goodEveningGreeter.greet();

		System.out.println("------------------------");
//		Lambda Expression 	
		Greeter greeter2 = () -> {
			System.out.println("This is lambda code !!!");
		};
		greeter2.greet();

		Greeter goodNightGreeter = () -> {
			System.out.println("Good Night Java !!!");
		};

		goodNightGreeter.greet();

		Runnable runnable = () -> {
			System.out.println("We are in Thread");
		};
		Thread thread = new Thread(runnable);
		thread.start();

		Thread thread2 = new Thread(() -> System.out.println("We are in thread again"));
		thread2.start();

		new Thread(() -> System.out.println("We are in thread again again ")).start();

		Thread thread3 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				try {
					Thread.sleep(1000);
					System.out.println("in loop");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println("Error in Thread sleep code");
				}

			}
		});
		thread3.start();
	}
}
