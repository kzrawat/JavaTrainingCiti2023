package com.citibank.main.domain;

public class ThreadTwo implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("We are in ThreadTwo !!!");
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("ThreadTwo ::" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
			
		}
		
	}
	
	

}
