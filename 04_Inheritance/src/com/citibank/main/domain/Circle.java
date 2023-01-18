package com.citibank.main.domain;

public class Circle extends Shapes {
	public Circle() {
//		super(20);
		System.out.println("This is Circle default construtor");
	}

	public Circle(int size) {
		System.out.println("Param Constructor of Circle");
		System.out.println("Size :: " + size);
	}

//	@Override
	public void draw() {
		System.out.println("Circle is getting drawn");
	}

}
