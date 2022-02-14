package java8.Codility;

public class PlayerCourt {
	 public int solution(int P, int C) {
		 int rounds = 0;
		 for (int i = 0; i < 1000; i++) {
			 
			 if(C == 0 ) {
				 break;
			 }
			 if(P <2 ) {
				 break;
			 }
			 
			 C = C-1;
			 P = P-2;
			 rounds +=1;
			
		}
		 
		 
		 return rounds;
	    }
	 public static void main(String[] args) {
		 System.out.println(new PlayerCourt().solution(12, 24));
		
	}
}
