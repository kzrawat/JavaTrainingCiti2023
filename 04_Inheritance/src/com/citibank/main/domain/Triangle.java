package com.citibank.main.domain;

public class Triangle extends Shapes {
public Triangle() {
	System.out.println("This is triangle default contructor");
}

public Triangle (int size) {
	System.out.println("Param Constructor of triangle");
	System.out.println("Size :: " + size);
}
@Override
	public void draw() {
		System.out.println("Triangle is getting drawn");
	}
}
