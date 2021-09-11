package com.training.weekone;

import java.util.Scanner;

public class StringArrayToString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		String[] names = new String[size];
		for (int i = 0; i < names.length; i++) {

			System.out.println("Enter the charset");
			names[i] = sc.next();
		}
		sc.close();
		String finalName = null;
		for (int i = 0; i < names.length; i++) {
			if (finalName != null) {
				finalName = finalName + "," + names[i];
			} else {
				finalName = names[i];
			}
		}
		System.out.println("coverted string is " + finalName);
	}

}
