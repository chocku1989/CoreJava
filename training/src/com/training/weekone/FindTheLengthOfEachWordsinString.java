package com.training.weekone;

import java.util.Scanner;

public class FindTheLengthOfEachWordsinString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		String[] chars = new String[size];
		for (int i = 0; i < chars.length; i++) {

			System.out.println("Enter the charset");
			chars[i] = sc.next();
		}
		for (int i = 0; i < chars.length; i++) {
			
			chars[i] =Integer.toString((chars[i].length()));
		}
		System.out.println("Enter no of length u want to see");
		String lengthOFString = sc.next();
		int count = 0;
		for (int i = 0; i < chars.length; i++) {
			if (lengthOFString.equals(chars[i])) {
				count++;
			}
		}
		System.out.println("total no of " + lengthOFString + " char String is " + count);
		sc.close();
	}

}
