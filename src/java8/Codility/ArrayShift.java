package java8.Codility;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayShift {
	 public int[] solution(int[] A, int K) {
		 if(A.length>0) {
		   List<Integer> l = IntStream.of(A).boxed().collect(Collectors.toList());
		   Collections.reverse(l);
			 for (int i = 0; i < K; i++) {
				 int temp = l.get(0);
				 l.remove(0);
				 l.add(temp);
				
			}
			 Collections.reverse(l);
			 A = l.stream().mapToInt(i->i).toArray();
		        
		 }
			 return A;
	    }
	 
	 public static void main(String[] args) {
		 int[] A = { 3, 8, 9, 7, 6 };
		A = new ArrayShift().solution(A, 3);
		IntStream.of(A).forEach(System.out::println);
	}
}
