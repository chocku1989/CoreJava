package com.training.enumLearning;

public class EnumTest {

	public static void main(String[] args) {

		Level levObj = Level.HIGH;
		System.out.println(levObj);
		System.out.println(levObj.getClass().getName());
		System.out.println(levObj.name());//name
		System.out.println(levObj.ordinal());//index
		String s = levObj.toString();
		System.out.println(s);

		Level[] values = Level.values();

		for (Level levTemp : values) {
			System.out.println(levTemp);
		}

		switch (levObj) {
		case HIGH:
			System.out.println("high");
			break;
		case LOW:
			System.out.println("Low");
			break;
		case MEDIUM:
			System.out.println("Med");
			break;

		}
		switch (levObj.toString()) {
		case "HIGH":
			System.out.println("high");
			break;
		case "MEDIUM":
			System.out.println("Low");
			break;
		case "LOW":
			System.out.println("Med");
			break;

		}
		
		
		switch (levObj.toString()) {
		case "HIGH":
			System.out.println("high");
			break;
		case "MEDIUM":
			System.out.println("Low");
			break;
		case "LOW":
			System.out.println("Med");
			break;

		}

	}
}
