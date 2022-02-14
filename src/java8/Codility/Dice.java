package java8.Codility;

public class Dice {
	public static int solution(int[] A) {
		int count = 99;
		for (int i = 1; i < 7; i++) {
			int temp = 0;
			for (Integer val : A) {
				if (!val.equals(i)) {
					if ((val + i) == 7) {
						temp += 2;
					} else {
						temp += 1;
					}
				}
			}
			if (temp > count) {
				count = temp;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] A = { 2,3,4,5};
		System.out.println(solution(A));
	}
}
