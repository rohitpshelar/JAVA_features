package java8.Codility;

public class PassingCar {

	public int solution(int[] A) {
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if (A[i] == 0 && A[j] == 1)
					count += 1;
			}
		}
		if (count > 1000000000)
			return -1;
		return count;
	}

	public int solution1(int[] A) {
		int count = 0;
		int multiply = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0) {
				multiply = multiply + 1;
			}
			if (multiply > 0) {
				if (A[i] == 1) {
					count = count + multiply;
					if (count > 1000000000) {
						return -1;
					}
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] A = { 0, 1, 0, 1, 1 };
		System.out.println(new PassingCar().solution1(A));
	}
}
