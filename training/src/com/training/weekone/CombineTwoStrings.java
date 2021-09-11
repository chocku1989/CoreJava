package com.training.weekone;

public class CombineTwoStrings {

	public static void main(String[] args) {
	System.out.println(union("New York", "New JersyO"));

	}

	public static String union(String a, String b ) {
		String finalVal=null;
		for (int i = 0; i < a.length(); i++) {
			String val= Character.toString(a.charAt(i));
			if (finalVal!=null) {
				if ( (b.toLowerCase().contains(val.toLowerCase())) || (b.toUpperCase().contains(val.toUpperCase()))) {
					finalVal=finalVal+val;
				} else {
					finalVal=finalVal+"+";
				}
			} else {
				if ( (b.toLowerCase().contains(val.toLowerCase())) || (b.toUpperCase().contains(val.toUpperCase()))) {
					finalVal=val;
				}  else {
					finalVal= "+";
				}
				
			}
			
			
		}
		
		
		return finalVal;
	}
}
