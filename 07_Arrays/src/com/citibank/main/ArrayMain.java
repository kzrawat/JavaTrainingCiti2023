package com.citibank.main;

public class ArrayMain {

	public static void main(String[] args) {
		System.out.println("mian Start");
		
//		int k = new int();   - Invalid -- as Int is not class
		int j = 3;
		int[] numbers = new int[5];
		
		numbers [0] = 10;
		numbers [1] = 20;
		numbers [2] = 30;
		numbers [3] = 40;
		numbers [4] = 50;
		
				
		for (int i : numbers) {
		
			numbers[j] = i +1000;
			System.out.println("Value - i " + i);
			System.out.println("Number [j]---" + j +" value "+ numbers[j]);
		}
		
		System.out.println("Main end");

	}

}
