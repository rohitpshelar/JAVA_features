package java8.Codility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class FindUnpaired {
	
	public int solution(int[] A) {
		LinkedList<Integer> l = (LinkedList<Integer>) Arrays.stream(A).boxed().collect(Collectors.toCollection(LinkedList::new));
		int size = l.size();
		for (int i = 0; i < size; i++) {
			for (int j = i+1; j < size; j++) {
				if (l.get(i) == l.get(j)) {
					l.remove(j);
					size--;
					l.remove(i);
					size--;
					i=-1;
					break;
				}
			}
		}

		return l.get(0);
	}
	
	public int solution1(int[] A) {
		List<Integer> l = Arrays.stream(A).boxed().collect(Collectors.toList());
		int size = l.size();
		for (int i = 0; i < size; i++) {
			for (int j = i+1; j < size; j++) {
				if (l.get(i) == l.get(j)) {
					l.remove(j);
					size--;
					l.remove(i);
					size--;
					i=-1;
					break;
				}
			}
		}

		return l.get(0);
	}
	
		// Time: O(N)
		// Space: O(1)
		public  int solution3(int[] A) {
			// write your code in Java SE 8
			int elem = 0;

			for (int i = 0; i < A.length; i++) {
				elem = elem^A[i];
			}
			return elem;
		}
		
		// Time: O(N)
		// Space: O(N)
		public  int solution4(int[] A) {
			// write your code in Java SE 8
			HashSet<Integer> dups = new HashSet<Integer>();
			int elem = -1;

			for (int i = 0; i < A.length; i++) {
				if (dups.add(A[i])) {
					elem = A[i];
				}else {
					dups.remove(A[i]);
					if(dups.iterator().hasNext()) {
						elem= dups.iterator().next();
					}
					
				}
			}
			return elem;
		}

		// Time: O(N^2)
		// Space: O(1)
		public  int solution5(int[] A) {
			// write your code in Java SE 8
			for (int i = 0; i < A.length; i++) {

				for (int j = 0; j < A.length; j++) {
					if (A[i] == A[j] && i != j) {
						A[i] = -1;
						A[j] = -1;
						j = A.length;
					}
				}
			}

			for (int i = 0; i < A.length; i++) {
				if (A[i] != -1)
					return A[i];
			}

			return 0; // should never happen
		}

	public static void main(String[] args) {
		int[] A = { 9, 3, 9, 3, 9, 7, 9};
		System.out.println(new FindUnpaired().solution4(A));
	}
}
