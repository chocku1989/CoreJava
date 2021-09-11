package com.training.day8;

public class SystemClass {

	public static void main(String[] args) {
int [] i = {0,5,6};
int [] j= new int [i.length];

System.arraycopy(i, 0, j, 1, i.length);
for (int j2 : j) {
	System.out.println(j2);
}
	}

}
