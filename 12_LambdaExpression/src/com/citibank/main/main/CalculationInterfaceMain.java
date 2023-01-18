package com.citibank.main.main;

import com.citibank.main.domain.CalculationInterface;

public class CalculationInterfaceMain {

	public static void main(String[] args) {

		CalculationInterface calcinterface1 = (num1, num2) -> {
			double result;
			result = num1 + num2;
			return result;
		};

		System.out.println("Addition result is " + calcinterface1.doCalculation(300, 200));

		System.out.println("-------- Break----------");

		CalculationInterface calcinterface2 = (num1, num2) -> {
			double result;
			result = num1 - num2;
			return result;
		};

		System.out.println("Substraction result is " + calcinterface2.doCalculation(300, 200));

		System.out.println("-------- Break----------");

		CalculationInterface calcinterface3 = (num1, num2) -> {
			double result;
			result = num1 * num2;
			return result;
		};

		System.out.println("Multiplication result is " + calcinterface3.doCalculation(300, 200));

		System.out.println("-------- Break----------");

		CalculationInterface calcinterface4 = (num1, num2) -> {
			double result;
			result = num1 / num2;
			return result;
		};

		System.out.println("Division result is " + calcinterface4.doCalculation(400, 200));

	}

}
