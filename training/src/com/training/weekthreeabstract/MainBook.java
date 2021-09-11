package com.training.weekthreeabstract;

public class MainBook {

	public static void main(String[] args) {
		
		//Book b = new Book(); -- this is not possible as b is abstract
		
		Book b = new ScienceBook();  // at this line super class constctor is called by default using super keyword 
		System.out.println(b.bookName);
		System.out.println(b.i);
		//System.out.println(b.sb);-- not ossible as we have created the type as b
		System.out.println(b.read()); // only methods overrided in child class can be access using type of book
		System.out.println(b.readBook()); // because Scine book extends book, so read Book can be accessed
		 
		
		

	}

}
