import java.util.stream.IntStream;

public class StreamArrayDoubleLoop {
//	{2,5,6,9,8,7,10}
//
//	sum = 12
//
//	[2,10]

	public static void main(String[] args) {
		int[] input = { 2, 5, 6, 9, 8, 7, 10 };
		int sum = 12;
		IntStream.range(0, input.length).forEach(i -> IntStream.range(0, input.length)
				.filter(j -> i != j && input[i] + input[j] == sum).forEach(j -> addPairs(input[i], input[j]))
				);

	}

	private static Object addPairs(int i, int j) {
		System.out.println(i + " " + j);
		return i + j;
	}

	private void m1(int[] i) {

		for (int j = 0; j < i.length; j++) {
			for (int j2 = 0; j2 < i.length; j2++) {
				if (i[j] + i[j2] == 12) {
					System.out.println(i[j] + "," + i[j2]);
				}
			}
		}

		IntStream.of(i).sorted().map(e -> e).forEach(System.out::println);

	}

}
