package com.training.day1_3.tostring;

public class Student {
	 private int rollno;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno1) {
	this.rollno =rollno1;
	}
@Override
public String toString() {
	System.out.println("In toString()");
	return "Roll no:"+getRollno();
}
	public static void main(String[] args) {
	Student s = new Student();
	
		System.out.println(s.rollno);
System.out.println(s);
	}
}
