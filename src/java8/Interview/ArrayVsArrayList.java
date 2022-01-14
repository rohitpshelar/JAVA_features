package java8.Interview;

import java.util.ArrayList;
import java.util.List;

public class ArrayVsArrayList {

	public static void main(String[] args) {
		
		//Array - premitice
		int[] a = {1,4,2,5};
		
		a[3]=9;
		//a[5]=9; - Array index out of bound
		
		System.out.println(a.length);
		
		for (int i : a) {
			System.out.println(i);
		}
		
		//Array - Object
		Integer[] ia = new Integer[]{1,4,2,5};
		
		ia[3]=9;
		//a[5]=9; - Array index out of bound
		
		System.out.println(a.length);
		
		for (int i : ia) {
			System.out.println(i);
		}
		
		//Arraylist - only works with object
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(4);
		l.add(2);
		l.add(5);
		
		System.out.println(l.size());
		
		for (Integer integer : l) {
			System.out.println(integer);
		}
		
		
	}

}
