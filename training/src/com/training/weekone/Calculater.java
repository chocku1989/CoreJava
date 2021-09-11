package com.training.weekone;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no1");
		Double a = sc.nextDouble();
		System.out.println("Enter the no2");
		Double b = sc.nextDouble();
		Double c = 0.0d;
		System.out.println("Enter the Action");
		String action = sc.next();
		sc.close();

		switch (action.toUpperCase()) {

		case "ADD":
			c = a + b;
			break;
		case "SUBRACT":
			c = a - b;
			break;
		case "MULTIPLY":
			c = a * b;
			break;

		case "DIVISION":
			c = a / b;
			break;
		default:
			System.out.println("no match");

		}
		DecimalFormat df = new DecimalFormat("###.###");
		System.out.println("output is " + df.format(c));
		
	}

}
