import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class CharCountString {
	static AtomicInteger a = new AtomicInteger(1);
	static String output = new String();

	public static <R> void main(String[] args) {
		String s = "sssspppqqrrrrrss";
		Object[] ints = s.chars().mapToObj(i -> (char) i).toArray();
		// char[] ch = s.toCharArray(); not working
		Stream.of(ints).forEach(e -> {

			if (output.contains(String.valueOf(e))) {
				a.incrementAndGet();
			} else {
				if (output.isEmpty())
					output = output.concat(String.valueOf(e));
				else {
					output = output.concat(String.valueOf(a.get())).concat(String.valueOf(e));
				}
				a.set(1);
			}

		});
		System.out.println(output);
	}

	@SuppressWarnings("unused")
	private static void m1(String s) {
		String output = "";
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			if (i + 1 == s.length()) {
				output = output + count + "" + s.charAt(i);
				break;
			} else if (s.charAt(i) == s.charAt(i + 1)) {
				count = count + 1;
			} else {
				output = output + count + "" + s.charAt(i);
				count = 1;
			}
		}
		System.out.println(output);// TODO Auto-generated method stub

	}

	@SuppressWarnings("unused")
	private void m2(String s) {
		String output = "";
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			if (output.contains(String.valueOf(s.charAt(i))))
				continue;

			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count = count + 1;
				}
			}
			output = output + count + "" + s.charAt(i);
			count = 1;

		}
		System.out.println(output);

	}

}
