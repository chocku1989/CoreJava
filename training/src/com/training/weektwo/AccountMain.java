package com.training.weektwo;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("accountNo");
		String accNo = sc.next();
		System.out.println("Balance");
		int balance = sc.nextInt();
		
		Account obj = new Account(accNo,balance);
		
		System.out.println("Action");
		String action = sc.next();
		
		if(action.equals("deposit")) {
			System.out.println("enter deposit amount ");
			int amount = sc.nextInt();
			obj.deposit(amount);
		} else if(action.equals("withdraw")) {

			System.out.println("enter wihdraw amount ");
			int amount = sc.nextInt();
			obj.withdraw(amount);
		
		}
		sc.close();
		

	}

}
