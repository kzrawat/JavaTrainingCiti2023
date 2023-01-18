package com.citibank.main;

import com.citibank.domian.MyClass;

public class MyClassMain {
//	int i = 10;
	static int j = 20;
	public static void main(String[] args) {
		System.out.println("Main Start");
		MyClass myclass = new MyClass();
		MyClass myclass1 = new MyClass();
		j = j + 10;
		
//		MyClass myclass = new MyClass ();
//		myclass.display();
//		System.out.println("------------------");
//		
//		MyClass myclass1 = new MyClass();
//		myclass1.display();
//		myclass1.num2 = 30;
//		MyClass.num2=40;
//		myclass1.display();
//		System.out.println("Int i" + i);   --- static function can us only static variable
//		System.out.println("Int j" + j);
		System.out.println("Main End");

	}

}
