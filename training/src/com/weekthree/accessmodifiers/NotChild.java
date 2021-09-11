package com.weekthree.accessmodifiers;

public class NotChild {
public static void main(String[] args) {
	Child c = new Child();
	System.out.println(Parent.i);
	System.out.println(c.j);
	System.out.println(Parent.k);
	System.out.println(Parent.d);
}
}

	