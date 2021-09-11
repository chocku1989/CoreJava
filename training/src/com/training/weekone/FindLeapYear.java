package com.training.weekone;

import java.util.Scanner;

public class FindLeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = sc.nextInt();
		sc.close();
		System.out.println(year % 4 == 0 ? "leap Year" : "not leap year");
	}

}
