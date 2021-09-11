package com.training.weekone;

import java.util.Scanner;

public class ValidateMailAddress {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mailId");
		String mailId = sc.next().toLowerCase();
		sc.close();
		// Substring logic for number of chars inbetween @ and .
		// (mailId.substring(mailId.indexOf('@') + 1, mailId.indexOf('.')).length() ==
		// 5)
		if ((mailId.indexOf('@') != -1) && (findOccurance(mailId, '.') == 1) && (findOccurance(mailId, '@') == 1)
				&& mailId.endsWith(".com") && (Math.abs(mailId.indexOf('@') - mailId.indexOf('.')) - 1 == 5)
				&& (mailId.indexOf('@') >= 4)) {
			System.out.println("Email validation Passed");
		} else {
			System.out.println("Email validation failed");
		}
	}

	public static int findOccurance(String name, char c) {
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == c) {
				count += 1;

			}
		}

		return count;
	}

}
