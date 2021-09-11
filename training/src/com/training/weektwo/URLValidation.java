package com.training.weektwo;

public class URLValidation {

	public static void main(String[] args) {
		String url="https://www.amazon.com/";
		
		if(url.toLowerCase().startsWith("https")) {
			System.out.println("URL "+url +" starts with https");
		} else {
			System.out.println("URL "+url +" not starts with https");
		}
		

	}

}
