package com.training.weekone;

public class EncryptUsingAlogic {

	public static void main(String[] args) {
	System.out.println(encrypt("NewYorkZ"));

	}

	public static String encrypt(String a) {
		
		String finalVal=null;
		for (int i = 0; i < a.length(); i++) {
			char c= a.charAt(i) ;
		
			if(i%2==1) {
			if(!(c=='z' || c=='Z')) {
				int ascii = c;
				c =(char) (ascii+1); 
			} else {
				
				c=c=='Z'?'A':'a';
				
			}
				
			
		} 
			if (finalVal!=null) {
				finalVal=finalVal+Character.toString(c);
				
			} else {
				finalVal=Character.toString(c);
			}
			
		}
		return finalVal;
	}
}
