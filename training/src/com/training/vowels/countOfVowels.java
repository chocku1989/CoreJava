package com.training.vowels;

import java.util.Scanner;

public class countOfVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String value = sc.next();
		String vowels = "AEIOU";

		sc.close();

		for (int i = 0; i < vowels.length(); i++) {
			char c = vowels.toLowerCase().charAt(i);

			int count = 0;
			for (int j = 0; j < value.length(); j++) {
				char c1 = value.toLowerCase().charAt(j);
				if (c == c1) {

					count++;
				}
			}
			System.out.println("char " + c + " whose count is " + count);

		}
	}

}
