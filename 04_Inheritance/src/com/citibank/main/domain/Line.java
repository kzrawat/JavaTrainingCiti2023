package com.citibank.main.domain;

public class Line extends Shapes {
	public Line() {
		System.out.println("This is Line default constructor");
	}
	
	public Line(int size) {
		System.out.println("Param Constructor of Line");
		System.out.println("Size :: " + size);
	}
	@Override
	public void draw() {
		System.out.println("Line is getting drawn");
	}
}
