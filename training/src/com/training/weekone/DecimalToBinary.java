package com.training.weekone;

public class DecimalToBinary {
	public static void main(String[] args) {
		int n = 90;
		int num = n;
		String binaryVal = null;
		while (num >= 1) {
			int reminder = num % 2;
			num = num / 2;
			if (binaryVal != null) {
				binaryVal = binaryVal + reminder;
			} else {
				binaryVal = Integer.toString(reminder);
			}
		}
		String finalString = null;
		for (int i = binaryVal.length() - 1; i >= 0; i--) {
			if (finalString != null) {
				finalString = finalString + binaryVal.charAt(i);
			} else {
				finalString = Character.toString(binaryVal.charAt(i));
			}
		}

		System.out.println("binary number is " + finalString);

	}
}
