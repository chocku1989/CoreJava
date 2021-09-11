package com.training.SpringInteral;

public class A {
	B b;
	
	public void setB(B b){
		this.b=b;
	}

	//one way of dependecy
//	A() {
//		b=new B();
//	}

	public void business() {
		b.getId();
	}
}
