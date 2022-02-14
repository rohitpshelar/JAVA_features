package java8.Codility;

//Partical is stable
public class ParticalIsSatble {
	public int solution(int[] A) {
		int tp = 0;
		int ps = A.length;
		for (int i = 0; i < ps; i++) {
			for (int count = 0; i + 2 < ps && A[i + 1] - A[i] == A[i + 2] - A[i + 1]; i++) {
				count++;
				tp += count;
			}
		}
		return tp < 1000000000 ? tp : -1;
	}

	public static void main(String[] args) {
		int[] A = { 1, 1, 3, 3, 0, 2, 3, 2, 1, 0 };
		System.out.println(new ParticalIsSatble().solution(A));
	}
}
