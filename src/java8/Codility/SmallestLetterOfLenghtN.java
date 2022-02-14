package java8.Codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmallestLetterOfLenghtN {
	
	public String[] solution(int N, int K) {
		List<String> res = new ArrayList<>();
		String s = "abc";
		dfs(res, s, N, K, new StringBuilder());

		return res.toArray(new String[0]);
	}

	private static void dfs(List<String> res, String s, int n, int k, StringBuilder sb) {
		if (res.size() == k)
			return;
		if (sb.length() == n) {
			res.add(sb.toString());
			return;
		}
		for (int i = 0; i < s.length(); i++) {
			if (sb.length() == 0 || sb.charAt(sb.length() - 1) != s.charAt(i)) {
				sb.append(s.charAt(i));
				dfs(res, s, n, k, sb);
				sb.deleteCharAt(sb.length() - 1);
			}
		}
	}

	public static void main(String[] args) {
		Arrays.stream(new SmallestLetterOfLenghtN().solution(2, 5)).forEach(System.out::println);
	}
}
