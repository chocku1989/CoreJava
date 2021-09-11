package com.training.weektwo;

public class Square extends Shape {

	int side =0;
	
	Square(String shapeName, int length) {
		super(shapeName);
		side=length;
	}
//	
	@Override 
	public double calculateArea() {
		
		return (side*side);
		
	}
}
