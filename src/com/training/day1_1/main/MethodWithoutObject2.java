package com.training.day1_1.main;

public class MethodWithoutObject2 {

	public static void m2() {
		System.out.println("M2 ===method");
	}

	public static void m2(int a) {
		System.out.println("M2 ===method==int");
	}

	public void m2(String a) {
		System.out.println("M2 ===method==String");
	}

	public static void main(String[] args) {

	//	Rohit.out.println("Sachin");
		
		System.out.println("main");
		m2();
		m2(2);
		MethodWithoutObject2 m = new MethodWithoutObject2();
		m.m2("r");
		

				}

}
