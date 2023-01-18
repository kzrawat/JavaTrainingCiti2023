package com.citibank.domian;

public class MyClass {
	
	
	
	public MyClass() {
		System.out.println("Default Constructor of Myclass");
		
	}
	static {
		System.out.println("Static block of main cloass");
	}
	{
		System.out.println("Non static Block");
	}
	

	int num1 = 10;
	public static int num2 = 10;
	final int num3 =100;
	
	public void display () {
		System.out.println("Number 1 is " + num1);
		System.out.println("Number 2 is " + num2);
		System.out.println("Number 3 is " + num3);
		num1 = num1 + 10;
		num2 = num2 + 10;
//		num3 = num3 + 10; ---  final type variable can't be changed 
		System.out.println("Number 1 is " + num1);
		System.out.println("Number 2 is " + num2);
		System.out.println("Number 3 is " + num3);
	
	}

}
