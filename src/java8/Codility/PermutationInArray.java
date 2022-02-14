package java8.Codility;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PermutationInArray {
    public int solution(int[] A) {
        int sumV = 0;
        int sumK = 0;
        List<Integer> s = Arrays.stream(A).boxed().distinct().collect(Collectors.toList());
        if(s.size()!=A.length)
        	return 0;
        
        for(int i = 0;i<s.size();i++){
            sumV +=s.get(i);	
            sumK +=i+1;
        }
        if(sumK==sumV)
            return 1;
        
        return 0;
    
    }
    
	public  int solution1(int[] A) {
		// write your code in Java SE 8
		boolean[] seen = new boolean[A.length + 1];

		// repeated elements
		for (int i = 0; i < A.length; i++) {
			if(A[i] < 1 || A[i] > A.length) return 0;
			if(seen[A[i]] == true) return 0;
			else seen[A[i]] = true;
		}
		
		return 1;
	}
    
    public static void main(String[] args) {
    	int[] A = { 1, 2,3,4};
		System.out.println(new PermutationInArray().solution1(A));
	}
}
