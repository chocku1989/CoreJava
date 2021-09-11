package com.training.weekone;

public class UnionMinusIntersection {

	// TODO Auto-generated method stub

	public static int[] unionMethod() {
		int[] a = { 1, 2, 3, 4, 9 };
		int[] b = { 3, 4, 5, 6, 7 };

		// int [] c = new int [a.length+b.length];
		int[] c = new int[10];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		int startIndex = a.length;
		int addCount = 0;
		for (int i = 0; i < b.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[j] == b[i]) {
					count++;
				}
			}
			if (count == 0) {
				c[startIndex + addCount] = b[i];
				addCount++;
			}
		}

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		return c;

	}

	public static int[] intersection() {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 3, 4, 5, 6 };

		// int [] c = new int [a.length+b.length];
		int[] c = new int[7];

//			for (int i = 0; i < a.length; i++) {
//				c[i] = a[i];
//			}
//			int startIndex = a.length;
		int addCount = 0;
		for (int i = 0; i < b.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[j] == b[i]) {
					count++;
				}
			}
			if (count > 0) {
				c[addCount] = b[i];
				addCount++;
			}
		}

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}

		return c;

	}

	public static void main(String[] args) {
		int[] a = unionMethod();
		int[] b = intersection();
		int[] c = new int[6];

//	for (int i = 0; i < a.length; i++) {
//		c[i] = a[i];
//	}
//	int startIndex = a.length;
		int addCount = 0;
		for (int i = 0; i < b.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[j] == b[i]) {
					count++;
				}
			}
			if (count == 0 && b[i] != 0) {
				c[addCount] = b[i];
				addCount++;
			}
		}
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					count++;
				}
			}
			if (count == 0 && a[i] != 0) {
				c[addCount] = a[i];
				addCount++;
			}
		}

		for (int i = 0; i < c.length; i++) {
			System.out.println("final is " + c[i]);
		}

	}

}
