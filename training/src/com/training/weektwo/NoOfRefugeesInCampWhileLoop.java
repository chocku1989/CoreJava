package com.training.weektwo;

import java.util.Scanner;

public class NoOfRefugeesInCampWhileLoop {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of camps");
		int noOfCamps = sc.nextInt();
		int [] noOfPeople= new int [noOfCamps];
		for (int i = 0; i < noOfPeople.length; i++) {
			System.out.println("Enter the No of People in "+(i+1) +" camp");
			noOfPeople[i]=sc.nextInt();
		}
		sc.close();
		int sum =0;
		int i=0;
		while(i<noOfPeople.length) {
			sum=sum+noOfPeople[i];
			i++;
		}
		System.out.println("total number of Poepls are "+sum);
	}

}
