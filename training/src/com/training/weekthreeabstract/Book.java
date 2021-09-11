package com.training.weekthreeabstract;

public abstract class Book {
	
	
	 Book() {
		System.out.println("book cons");
	}

	int i = 0;
	String bookName = "MainBook";

	public abstract String read();

	public String readBook() {
		return "reading the book";
	}
}
