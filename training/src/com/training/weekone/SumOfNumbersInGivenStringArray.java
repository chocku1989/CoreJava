package com.training.weekone;

import java.util.Scanner;

public class SumOfNumbersInGivenStringArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		String[] chars = new String[size];
		for (int i = 0; i < chars.length; i++) {

			System.out.println("Enter the charset");
			chars[i] = sc.next();
		}
		int sum = 0;
		for (int i = 0; i < chars.length; i++) {
			for (int j = 0; j < chars[i].length(); j++) {
				char ch = chars[i].charAt(j);
				// int ascii =ch; - Two ways  of coverting charcters to Ascii values
				int ascii = (int) ch;
				if (ascii >= 48 && ascii <= 57) {
					// sum= sum+Character.getNumericValue(ch); two ways 
					sum = sum + Integer.parseInt(String.valueOf(ch));
				}
			}
		}
		System.out.println("Sum of all numeric charcters is " + sum);
		sc.close();
	}
}
