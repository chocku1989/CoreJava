package com.training.weekone;

public class MirrorOfString {

	public static String getImage(String name) {

		String newName = "";

		for (int i = name.length()-1; i >= 0; i--) {
			newName = newName + name.charAt(i);
		}
		return name + "|" + newName;

	}

	public static void main(String[] args) {

		System.out.println(getImage("chockalingam"));

	}

}
