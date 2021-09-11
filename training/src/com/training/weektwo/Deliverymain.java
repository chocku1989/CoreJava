package com.training.weektwo;

import java.util.Scanner;

public class Deliverymain {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().toString());
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Bolwer");
		String Bolwer = sc.next();

		System.out.println("Enter the Batsman name");
		String Bastamn = sc.next();

		Delivery d = new Delivery();
		d.displayDeliveryDetails(Bolwer, Bastamn);

		System.out.println("Enter the  run");
		Long runs = sc.nextLong();
		sc.close();
		d.displayDeliveryDetails(runs);
	}

}
