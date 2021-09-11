package com.training.ananymousclass;

public class TestAnamymousClass {

	public static void main(String[] args) {
		
//		Age obj = new Age() {
//
//			@Override
//			public void getAge() {
//				System.out.println("age is"+x);
//			}
//			
//		};
//		
//		obj.getAge();
		
		//below also possible //Above is with object ref. below cr
		 new Age() {

				@Override
				public void getAge() {
					System.out.println("age is"+x);
				}
				
			}.getAge();
			
			
	}

}
