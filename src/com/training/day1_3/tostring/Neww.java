package com.training.day1_3.tostring;

public class Neww {

	public Neww() {
		System.out.println("neww constructor");
	}
	{
		System.out.println("Rohit");
	}
	@Override
	public String toString() {
	
		return "In toString";
	}
	
	

	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		Neww n = new Neww();
		n.getClass();
		String input;
		int a = 9;
		input = s.nextLine();
		System.out.println(input);

		System.out.println(a);
		System.out.println("rollNO is : " + input );// rollno is +a

		input = s.toString();
		s.close();
		System.out.println(n);
	}

}
