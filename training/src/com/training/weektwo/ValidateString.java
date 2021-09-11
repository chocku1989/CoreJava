package com.training.weektwo;

public class ValidateString {

	public static int validateName(String name) {

		return (name.charAt(0)==name.charAt(name.length()-1)?+1:-1 );

	}

	public static void main(String[] args) {

		System.out.println((validateName("chockalingamc")));

	}

}
