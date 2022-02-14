package java8.Codility;

import java.util.HashSet;

public class frogJumpRiver {
	public int solution(int X, int[] A) {
		HashSet<Integer> fallen = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++) {
			if (A[i] <= X)
				fallen.add(A[i]);

			if (fallen.size() == X)
				return i;
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] A = { 1, 3, 1, 4, 2, 3, 5, 4 };
		System.out.println(new frogJumpRiver().solution(5, A));
	}
}
