package java8.Codility;

public class StringGenerate {
	public String solution(int A, int B) {
		String f = "";
		String a = "a";
		String b = "b";
		int ifa = 1;
		int ifb = 0;
		if(A<B) {
			int temp = A;
			A = B;
			B = temp;
			String temp2 = a;
			a = b;
			b = temp2;
		}else {
		}
		
		if(A==B) {
			ifa = 1;
			ifb = 1;
		}
		
		int count = 0;
		for (int i = 0; i <= A + B; i++) {
			for (int j = 0; j < A; j++) {
				count++;
				A = A - 1;
				f = f + a;
				if (count > ifa) {
					count = 0;
					break;
				}
			}
			for (int K = 0; K < B; K++) {
				count++;
				B = B - 1;
				f = f + b;
				if (count > ifb) {
					count = 0;
					break;
				}
			}
			i = 0;
		}
		return f;
	}

	public static void main(String[] args) {
		System.out.println(new StringGenerate().solution(2, 3));
	}
}
