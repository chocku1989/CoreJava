package com.training.weektwo;

public class Rectangle extends Shape {

	int length =0;
	int breath =0;
	
	Rectangle(String shapeName, int length, int breath) {
		super(shapeName);
		this.length=length;
		this.breath=breath;
	}
//	
	@Override 
	public double calculateArea() {
		
		return (length*breath);
		
	}
}
