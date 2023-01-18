package com.citibank.main.domain;

public class MyClass {
	public MyClass() {
		System.out.println("Default Contructor of MyClass");
	}
	
	public MyClass(int i) {
		System.out.println("Interger param Contructor of MyClass");
		System.out.println("Integer passed is : " + i);
	}
	
	public MyClass(int i, int j) {
		System.out.println("Interger param Contructor of MyClass");
		System.out.println("Integer passed is : " + i +" and "+ j);
	}
	public MyClass(String s) {
		System.out.println("String param Contructor of MyClass");
		System.out.println("String passed is : " + s);
	}


	public void show() {
		System.out.println("Hi Constructor !!");
	}
}
