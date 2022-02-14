package java8.Codility;

import java.util.Set;
import java.util.TreeSet;

public class MinimalDiff {
	 public int solution(int[] A) {
	        int f = 0;
	        int s = 0;
	        int minD =1000;
	        for(int i = 1;i<=A.length;i++){
	            for(int j = 0;j<A.length;j++){
	                if(i>j){
	                    f+=A[j];
	                }
	                if(i<=j){
	                    s+=A[j];
	                }
	            }
	            int num = f-s;
	            if(num<0) {
	            	num = num * -1;
	            }
	            
	            if(num<minD){
	                minD = num;
	                f = 0;
	                s = 0;
	            }
	        }

	        return minD;
	    }
	 
	public int solution1(int[] A) {
		int f = 0;
		int s = 0;
		Set<Integer> so = new TreeSet<Integer>();
		int counter = 1;
		for (int i = 0; i <= A.length; i++) {
			while (i < counter) {
				f += A[i];
			}
			while (i <= counter) {
				s += A[i];
			}

			counter++;
			int num = f - s;
			if (num < 0) {
				num = num * -1;
			}

			so.add(num);
		}

		return so.iterator().next();
	}
	
	public  int solution2(int[] A) {
		// write your code in Java SE 8
		int total = 0;

		for (int i = 0; i < A.length; i++)
			total += A[i];

		int diff = Integer.MAX_VALUE;
		int prev = 0;
		int next = total;

		for (int p = 1; p < A.length; p++) {
			prev += A[p - 1];
			next = total - prev;
			diff = Math.min(diff, Math.abs(prev - next));
		}

		return diff;
	}
	 
	 public static void main(String[] args) {
		 int[] A = { 3, 1, 2, 4, 3};
		System.out.println(new MinimalDiff().solution2(A));
	}
}
