package com.training.weektwo;

public class ReturnDayOfWeek {
	
	public static String returbDay(int n) {
//		String [] day  = {"sun", "mon" , "tue"};
		String [] day = new String [3];
		day[0]="sun";
		day[1]="mon";
		day[2]="tue";
		
		return (day[n-1]);
	}

	public static void main(String[] args) {
		System.out.println(returbDay(3) );

	}

}
