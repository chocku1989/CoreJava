package com.training.weekone;

import java.util.Scanner;

public class CountOfVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String value = sc.next();
		String vowels = "AEIOU";

		sc.close();
		int count = 0;
		for (int i = 0; i < vowels.length(); i++) {
			char c = vowels.toLowerCase().charAt(i);

			for (int j = 0; j < value.length(); j++) {
				char c1 = value.toLowerCase().charAt(j);
				if (c == c1) {

					count++;
				}
			}

		}
		System.out.println("Total count of Vowels in the given string is " + count);
	}

}
