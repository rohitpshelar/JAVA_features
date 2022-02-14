package java8.Codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.UnaryOperator;

public class IncreaseCounter {
    public int[] solution(int N, int[] A) {

        List<Integer> l = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
			l.add(0);
			
		}
        for(int i =0;i<A.length;i++) {
        	if(A[i]>N) {
        		l.replaceAll(new UnaryOperator<Integer>() {
					@Override
					public Integer apply(Integer t) {
						// TODO Auto-generated method stub
						return l.stream().max(Comparator.naturalOrder()).orElseThrow(NoSuchElementException::new);
					}
				});
        	}else {
        		if(l.get(A[i])<=N && A[i]>=1) {
        			int c = l.get(A[i]-1)+1;
        			l.set(A[i]-1, c);
        		}
        		
        	}
        }
       A = l.stream().mapToInt(i->i).toArray();
        return A;
    }
    public static void main(String[] args) {
    	int[] A = { 3, 4, 4, 6, 1, 4, 4};
    	Arrays.stream(A).forEach(System.out::println);
		System.out.println(new IncreaseCounter().solution(5, A));
	}
}
