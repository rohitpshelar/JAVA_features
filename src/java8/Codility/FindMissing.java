package java8.Codility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class FindMissing {
    public int solution(int[] A) {
    	int r = 1;
    	HashSet<Integer> l = (HashSet<Integer>) Arrays.stream(A).boxed().collect(Collectors.toSet());
      for (int i = 1; i < 10000; i++) {
		if(!l.contains(i)) {
			return i;
			}
		}
		return r;
	}
    
    public static int solution1(int[] A) {
		// write your code in Java SE 8
		HashSet<Integer> seen = new HashSet<Integer>();
		int min = 1;

		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0) seen.add(A[i]);
		}
		
		for(int i = 1 ; i < Integer.MAX_VALUE; i++) {
			if(!seen.contains(i)) return i;
		}

		return min;
	}
    public static void main(String[] args) {
    	int[] A = { 2,3,4,5};
		System.out.println(new FindMissing().solution(A));
	}
}
