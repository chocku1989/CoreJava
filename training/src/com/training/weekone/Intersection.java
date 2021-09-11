package com.training.weekone;

public class Intersection {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 3, 4, 5, 6 };

		// int [] c = new int [a.length+b.length];
		int[] c = new int[6];

//		for (int i = 0; i < a.length; i++) {
//			c[i] = a[i];
//		}
//		int startIndex = a.length;
		int addCount = 0;
		for (int i = 0; i < b.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[j] == b[i]) {
					count++;
				}
			}
			if (count > 0) {
				c[ addCount] = b[i];
				addCount++;
			}
		}

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}

	}

}
