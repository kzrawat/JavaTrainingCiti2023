package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Circle;
import com.citibank.main.domain.Line;
import com.citibank.main.domain.Shapes;
import com.citibank.main.domain.Triangle;

public class ShapesMain {

	public static void main(String[] args) {
		System.out.println("Main start");

//		Circle circle = new Circle();
//		Circle circle2 = new Circle(10);
//		circle.draw();
//		System.out.println("--------------");
//		Triangle triangle = new Triangle();
//		triangle.draw();
//		System.out.println("--------------");
//		Line line = new Line();
//		line.draw();
//		System.out.println("--------------");
		
//		Shapes shapes = new Circle();
//		shapes.draw();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Choice");
		System.out.println("1. Circle  2. Trianlge  3.Line");
		
		int choice = scanner.nextInt();
		
//		Shapes shapes = new  Shapes(); - object can not be created for Abstract class
	
		Shapes shapes1 = getshape(choice);
//		shapes.draw();   --- object can not be created for Abstract class
		System.out.println("Main end");

	}

	public static Shapes getshape(int choice) {
		if (choice == 1) {
			Shapes shapes = new Circle();
			return shapes;
		}
		if (choice == 2) {
			Shapes shapes = new Triangle();
			return shapes;
		}
		if (choice == 3) {
			Shapes shapes = new Line();
			return shapes;
		}
//		return new Shapes();
		return null;
	}

}
