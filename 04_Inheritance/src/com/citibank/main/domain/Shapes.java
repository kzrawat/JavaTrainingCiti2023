package com.citibank.main.domain;

public class Shapes {
//Generalization 	
	public Shapes() {
		System.out.println("This is default Shapes constructor");
	}
	
	public Shapes(int size) {
		System.out.println("Param Constructor of Shapes");
		System.out.println("Size :: " + size);
	}
	

	public void draw() {
	}

}
