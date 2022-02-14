package java8.Codility;

public class FrogJump {
    public int solution(int X, int Y, int D) {
        int count = 0;
        while(X<=Y){
            X +=D;
            count +=1;
        }
        return count;
    }
    
    public int solution1(int X, int Y, int D) {
        int count = 0;
    
        if(X!=Y && Y>X) {
        Y=Y-X;
        if(Y/D==0)
        	count  = 1;
        else
        	count +=Math.ceil((double) Y/D);
        }
        return count;
    }
    
    public static void main(String[] args) {
		System.out.println(new FrogJump().solution1(10, 85, 30));
		System.out.println(new FrogJump().solution1(1, 5, 2));
	}
}
