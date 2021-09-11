package com.training.day8;

public class ArrayCopy {

	public static void main(String[] args) {
		int [] i = {1,2,3,4,5} ;
		int [] j = new int [6]; //size of I and J need not to be equal 
		System.arraycopy(i, 1, j, 4, 2);
		for (int j2 : j) {
			System.out.println(j2);
		}
		
		String[] s = {"a", "b"};
		String [] s1 =new String [4];
		
		System.arraycopy(s, 0, s1, 1, 2);
		for (String j2 : s1) {
			System.out.println(j2);
		}
		
		
	}

}
