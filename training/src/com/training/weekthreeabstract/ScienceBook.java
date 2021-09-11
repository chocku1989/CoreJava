package com.training.weekthreeabstract;

public class ScienceBook extends Book {
	int sb=2;
	 ScienceBook () {
		System.out.println("i am ScinebOok cons");
	}
	@Override
	public String read() {
		return "reading scienceBook";
	}

}
