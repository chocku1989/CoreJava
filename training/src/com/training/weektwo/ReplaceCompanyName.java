package com.training.weektwo;

public class ReplaceCompanyName {

	public static void main(String[] args) {
	
		String s ="enter the content of the document ITT is a private organisation. ITT is a product based company. DBox is a ITT product ";
		
		String oldName= "ITT";
		String newName= "TTT";
		
		System.out.println(s.replaceAll(oldName, newName));

	}

}
