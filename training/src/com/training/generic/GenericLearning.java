package com.training.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericLearning {

	public static void main(String[] args) {
		
		//before JDK 1.5
		List list =new ArrayList();
		list.add(1);
		list.add("test");
		String s  = (String) list.get(1);
	//	String s1  = (String) list.get(0); //throws class cast exception as we try to cover integer valkue to String type, during run time oly we come to know the object 
		System.out.println(s);
//		System.out.println(s+s1);
		
		//After JDK 1.5
		
			List<String> lst =new ArrayList<>();
			lst.add("test");
		//	lst.add(1); throws error in comile time as oly String type is accepted
			
			System.out.println(lst.get(0));
			 s= lst.get(0);//no need to cast also 
			
			 System.out.println(testGeneric(1, 2));
			 System.out.println(testGeneric(new String(), 2));

	}
	
	public static <T,S> double testGeneric(T t, S s) {
		
		System.out.println(t);
		System.out.println(s);
		
	//	System.out.println(t+s);
		
		return (0);
		
	}

}
