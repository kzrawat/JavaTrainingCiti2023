package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domian.MyClass;
import com.citibank.main.domian.MyInterface;
import com.citibank.main.domian.YourClass;
import com.citibank.main.factory.MyFactory;

public class MyClassMain {

	public static void main(String[] args) {
		System.out.println("Main Start");
		
		MyInterface myInterface = new MyClass();
		MyClass myClass = new MyClass();
		myClass.show();
		
		System.out.println("--------------------");
		
		YourClass yourClass = new YourClass();
		yourClass.show();
		
		System.out.println("--------------------");
		
		myInterface = new MyClass();
		myInterface.show();
		
		System.out.println("--------------------");
		
		myInterface = new YourClass();
		myInterface.show();
		
		System.out.println("--------------------");
		
		System.out.println(MyInterface.message);
		System.out.println(MyClass.message);
		
		
		System.out.println("--------------------");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your Choice");
		System.out.println("1. MyClass object");
		System.out.println("2. YourClass Object");
		
		int choice = scanner.nextInt();
		
		myInterface = MyFactory.getObject(choice);
		
		if (myInterface != null)
			myInterface.show();
		else
			System.out.println("Invalid Choice");
		
		System.out.println("Main End");

	}

}
