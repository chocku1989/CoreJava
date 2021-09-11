package com.training.packagedemo;
import static java.lang.Math.PI;
import static java.lang.Math.abs;

import com.training.demo.AuthorService;
//import static java.lang.Math.*; Possible but nor 
public class Calculater {

	public static void main(String[] args) {

		System.out.println(Math.PI);
		System.out.println(PI);// works based on import static statement above
		System.out.println(abs(PI));
		AuthorService obj = new AuthorService();
		obj.print();
		
	}

}
