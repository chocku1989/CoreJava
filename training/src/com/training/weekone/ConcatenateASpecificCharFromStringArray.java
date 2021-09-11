package com.training.weekone;

public class ConcatenateASpecificCharFromStringArray {

	
	public static void main(String[] args) {
	String [] names = {"abc","da","ram"};
	int postion =3;
	String value=null;
	String finalValue=null;
	for (String temp : names) {
		if(temp.length()>=postion)
		{
			value=Character.toString(temp.charAt(postion-1));
		}
		else {
			value="$";
		}
		if(finalValue!=null) {
		finalValue=finalValue+value;
		} else {
			finalValue= value;
		}
	}
	
	System.out.println("final string is "+ finalValue);
	
}
}
