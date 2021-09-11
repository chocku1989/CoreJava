package com.training.weekone;

public class PrintUnqiueCharctersFromGivenString {

	public static void main(String[] args) {
		String s= "AABBaabb";
		
		char[] charArray = s.toCharArray();
		
		String finalValue=null;
		for (int i = 0; i < charArray.length; i++) {
			String val=Character.toString(charArray[i]);
			if (finalValue != null) {
				if (!(finalValue.contains(val))) {
					if (finalValue != null) {
						finalValue = finalValue + val;
					} 
				} 
			}
			else {
				finalValue = val;
			}
		}
		System.out.println(finalValue);
	}

}
