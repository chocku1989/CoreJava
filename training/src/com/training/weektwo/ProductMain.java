package com.training.weektwo;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		Product obj = new Product();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Product id");
		obj.setId(sc.nextLong());
		System.out.println("ProductName");
		obj.setProductName(sc.next());
		System.out.println("SupplierName Enter");
		obj.setSuplierName(sc.next());
		sc.close();
		System.out.println("product is "+obj.getId());
		System.out.println("product name  is "+obj.getProductName());
		System.out.println("Manufacturere name  is "+obj.getSuplierName());


	}

}
