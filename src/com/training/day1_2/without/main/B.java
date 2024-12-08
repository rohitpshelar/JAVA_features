package com.training.day1_2.without.main;

public class B extends A {

	
//	private static void m1() {
//		System.out.println("m1===B");
//			}

	@Override
	public void m2() {
		System.out.println("m2===Bbbbb");		
	}


 static{
	 m1();
	 B b=new B();
	 b.m2();
	 
 }
}
