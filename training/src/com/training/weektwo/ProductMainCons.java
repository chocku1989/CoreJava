package com.training.weektwo;

import java.util.Scanner;

public class ProductMainCons {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("id");
		long id = sc.nextLong();
		System.out.println("product");
		String productName = sc.next();
		System.out.println("Supplier");
		String supplier = sc.next();
		sc.close();
		ProductCons obj = new ProductCons(id, productName, supplier);

//		System.out.println("product is " + obj.getId());
//		System.out.println("product name  is " + obj.getProductName());
//		System.out.println("Manufacturere name  is " + obj.getSuplierName());
		obj.display();

	}

}
