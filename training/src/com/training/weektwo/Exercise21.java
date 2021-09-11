package com.training.weektwo;

public class Exercise21 {

	public static void main(String[] args) {

		int[] numArray = { 3, 6, 2, 1 };

		double sum = 0;
		int i=0;
		for (int num : numArray) {
			sum= sum + ( Math.pow(num , i));
					i++;
		}
		System.out.println(sum);
	}

}
