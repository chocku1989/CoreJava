package com.training.utils;

import java.text.DecimalFormat;

public class CommonMethods {

	public static double roundOff(double c) {
		DecimalFormat df = new DecimalFormat("###.##");
		return Double.parseDouble(df.format(c)) ;
	}
}
