package com.training.weektwo;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of Emps");
		int noOfEmps = sc.nextInt();
		for (int i = 0; i <= noOfEmps; i++) {
			System.out.println("Enter id");
			long id = sc.nextInt();
			System.out.println("emp name");

			String empName = sc.next();
			Employee obj = new Employee(id, empName);
			obj.display();

		}
		sc.close();
	}

}
