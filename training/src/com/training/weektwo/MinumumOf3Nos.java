package com.training.weektwo;

public class MinumumOf3Nos {

	public static void minimumOfThreeNos(int x, int y, int z) {

		if ((x < y) && (x < z)) {
			System.out.println("x is mimum");

		} else if ((y < z) && (y < x)) {
			System.out.println("y is mimum");
		} else {
			System.out.println("z is mun");
		}

	}

	public static void main(String[] args) {
		minimumOfThreeNos(2, 10, 5);
	}
}
