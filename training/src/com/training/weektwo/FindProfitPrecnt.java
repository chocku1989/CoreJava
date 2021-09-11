package com.training.weektwo;

import java.text.DecimalFormat;

public class FindProfitPrecnt {

	public static double findPercentage(double x, double y, double z) {
		double buyinCostOfaToy = y / 12;
		double profit = z - buyinCostOfaToy;
		DecimalFormat df = new DecimalFormat("###.###");

		return (Double.parseDouble(df.format((profit / buyinCostOfaToy) * 100)));

	}

	public static void main(String[] args) {
		System.out.println(findPercentage(20d, 375d, 34.6d));
	}

}
