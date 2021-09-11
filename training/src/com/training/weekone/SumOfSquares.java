package com.training.weekone;

public class SumOfSquares {

	public static double calculateDifference(int n) {
		double sumOfSqaures = 0;
		double squareofSum = 0;

		for (int i = 1; i <= n; i++) {
			sumOfSqaures = sumOfSqaures + Math.pow(i, 2);
			squareofSum = squareofSum + i;
		}

		return (Math.abs(sumOfSqaures - Math.pow(squareofSum, 2)));

	}

	public static void main(String[] args) {

		System.out.println(calculateDifference(3));

	}

}
