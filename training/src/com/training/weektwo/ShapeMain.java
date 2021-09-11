package com.training.weektwo;

import java.util.Scanner;

import com.training.utils.CommonMethods;

public class ShapeMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Shapename");
		String shape = sc.next();
		Shape s;

		switch (shape.toUpperCase()) {
		case "SQUARE":
			System.out.println("Enter the Side lenth");
			int side = sc.nextInt();
			s = new Square(shape, side);
			System.out.println("area of " + shape + " is " + CommonMethods.roundOff(s.calculateArea()));
			break;
		case "RECTANGLE":
			System.out.println("Enter the  lenth");
			int lentgh = sc.nextInt();
			System.out.println("Enter the  breath");
			int breath = sc.nextInt();
			s = new Rectangle(shape, lentgh, breath);
			System.out.println("area of " + shape + " is " + s.calculateArea());
			break;
		case "CIRCLE":
			System.out.println("Enter the Side lenth");
			int radius = sc.nextInt();
			s = new Circle(shape, radius);
			System.out.println("area of " + shape + " is " + CommonMethods.roundOff(s.calculateArea()));
			break;
		case "HEXAGON":
//			System.out.println("Enter the Side lenth");
//			int radius = sc.nextInt();
			s = new Hexagon(shape);
			System.out.println("area of " + shape + " is " + CommonMethods.roundOff(s.calculateArea()));
			break;

		}
		sc.close();

	}

}
