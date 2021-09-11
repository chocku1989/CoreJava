package com.training.weektwo;

import java.text.DecimalFormat;

public class PrintPrice {

	public static void printPrice(float x, float y, float z) {
		DecimalFormat df = new DecimalFormat("###.###");
		float sum = x+y;
		float discount = (z/100)*sum;
		System.out.println("total price "+df.format(sum) +" Final price  "+ df.format(sum-discount)+" amoutn saved "+df.format(discount));
		
		
	}

	public static void main(String[] args) {
		printPrice(20.50f, 45.40f, 10.00f);
	}

}
