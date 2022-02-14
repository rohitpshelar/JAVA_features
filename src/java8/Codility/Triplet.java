package java8.Codility;

public class Triplet {
    public int solution(int[] A) {
	int N = A.length;
	if (N < 3)
		return -1;
	int max_product = Integer.MIN_VALUE;
        for(int i=0;i<N-2;i++){
            for(int j=i+1;j<N-1;j++){
                for(int k=j+1;k<N;k++){
                	   max_product = Math.max(max_product,
                               A[i] * A[j] * A[k]);
                }
            }
        }
        return max_product;
    }
    
    public int solution1(int[] A) {
int sum = -1000;
        for(int i=0;i<A.length-2;i++){
            for(int j=i+1;j<A.length-1;j++){
                for(int k=j+1;k<A.length;k++){
                    if(i>-1000 && i<j && j<k && k<1000){
                    	int p = A[i]*A[j]*A[k];
                        if(sum<p)
                            sum = p;
                    }
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
    	int[] A = { 10,10,10};
    	System.out.println(new Triplet().solution(A));
	}
}
