package com.training.varargs;

public class VarArgsDemo {
	
	public static void main(String[] args) {
		//Book b = new Book();
		String  [] sarray = {"first", "second"};
		//Book 
		
		read(sarray);
	//	Book b=;
		String s ="hhh";
		String s1 ="hhh";
		String s2 = new String("hh");
		read(s,s1,s2);
				if(s.equals(s1)) {
					
				}
				if(s.equals(s1)) {
					
				}	
				System.out.println(s.hashCode());
				System.out.println(s1.hashCode());
				System.out.println(s2.hashCode());
		
				if(s==s2)
				{
					System.out.println("true");
				}
				if(s.equals(s2))
				{
					System.out.println("true");
				}
			int i=0;
			int j=1;
			read(i,j);
				
	}

//	public static void read(Book ...bb ) {
//		System.out.println("read" );
//		//System.out.println(bb.i);
//	}
	public static void read(String ...s) {
		System.out.println("read" );
		//System.out.println(bb.i);
		for (String temp : s) {
			System.out.println(temp);
		}
	}
	
	public static void read(int ...s) {
		System.out.println("read int" );
		//System.out.println(bb.i);
		for (int temp : s) {
			System.out.println(temp);
		}
	}
}
