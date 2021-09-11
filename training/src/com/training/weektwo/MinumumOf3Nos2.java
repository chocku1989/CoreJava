package com.training.weektwo;

public class MinumumOf3Nos2 {

	public static void compare2Nos(int x, int y) {

		if (x < y) {

			System.out.println(x + " is less than " + y);

		} else if (x == y) {
			System.out.println(x + " is equal to " + y);
		} else if (x > y) {

			System.out.println(x + " is greater than " + y);

		}
	}

	public static void main(String[] args) {
		compare2Nos(12, 12);
	}
}
