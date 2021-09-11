package com.training.weekone;

import java.util.Scanner;

public class SumOfMaxAndMinNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int[] numbers = new int[size];
		for (int i = 0; i < numbers.length; i++) {

			System.out.println("Enter the no");
			numbers[i] = sc.nextInt();
		}
		sc.close();
		int max = 0;
		int min = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (i == 0) {
				max = numbers[i];
				min = numbers[i];
			} else {
				if (max < numbers[i]) {
					max = numbers[i];
				}
				if (min > numbers[i]) {
					min = numbers[i];
				}

			}

		}
		System.out.println("sum of max and min numbers is " + (max + min));
	}

}
