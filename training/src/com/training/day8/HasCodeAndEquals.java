package com.training.day8;

public class HasCodeAndEquals {
	public static void main(String[] args) {
		String a ="test";
		String b ="test";
		String c =new String ("test");
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		System.out.println(a.equals(c));
		System.out.println(a==(c));
		
		
		System.out.println(a.equals(b));
		System.out.println(a==(b));
		
		Object i =0;
		Object j =1;
		System.out.println(i.hashCode());
		System.out.println(j.hashCode());
		
		System.out.println();
	}


}
