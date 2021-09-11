package com.training.weektwo;

public class Circle extends Shape {

	int radius =0;
	
	Circle(String shapeName, int radius) {
		super(shapeName);
		this.radius=radius;
	}
//	
	@Override 
	public double calculateArea() {
		
		return (Math.PI*Math.pow(radius, 2));
		
	}
}
