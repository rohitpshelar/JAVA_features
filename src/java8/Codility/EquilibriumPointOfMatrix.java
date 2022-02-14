package java8.Codility;

public class EquilibriumPointOfMatrix {
	public static void main(String[] args) {
		// five rows and three columns 
		// 0 <= P < N(30)
		// 0 <= Q < M(30)
		int[][] A = new int[][] { 
			//8, 17, 8
			{ 2, 7, 5 }, // 14
			{ 3, 1, 1 }, // 5
			{ 2, 1, -7 },// -4
			{ 0, 2, 1 }, // 3
			{ 1, 6, 8 } };// 15
			System.out.println(solution(A));
	}
	
	private static int solution(int[][] A) {
		
		int[] row = new int[A.length];
		int[] column = new int[A[0].length];
		int equiRow = 0;
		int equiColumn = 0;

		int position = 0;
		int num = 0;
		for (int i = 0; i < row.length; i++) {
			for (int j = 0; j < column.length; j++) {
				num += A[i][j];
			}
			row[position++] = num;
			num = 0;
		}
		position = 0;
		for (int i = 0; i < column.length; i++) {
			for (int j = 0; j < row.length; j++) {
				num += A[j][i];
			}
			column[position++] = num;
			num = 0;
		}
		
		for (int i = 0; i < row.length; i++) {
			int leftsum = 0; 	
			int rightsum = 0; 
			
			for (int j = 0; j < i; j++) { 
				leftsum += row[j];
			}
			
			for (int k = i + 1; k < row.length; k++) {
				rightsum += row[k];
			}
			
			if (leftsum == rightsum) {
				equiRow++;
				//return i;
			}
		}
		
		for (int i = 0; i < column.length; i++) {
			int leftsum = 0; 
			int rightsum = 0; 
			
			for (int j = 0; j < i; j++) {
				leftsum += column[j];
			}
			
			for (int k = i + 1; k < column.length; k++) {
				rightsum += column[k];
			}
			
			if (leftsum == rightsum) {
				equiColumn++;
				//return i;
			}
		}
		return equiRow * equiColumn;
	}
}
