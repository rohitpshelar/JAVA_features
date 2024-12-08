package com.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmallestLetterOfLenghtN {
	
	public String[] solution(String inputString, int outStringLength, int combinations) {
		List<String> resultList = new ArrayList<>();
		dfs(resultList, inputString, outStringLength, combinations, new StringBuilder());

		return resultList.toArray(new String[0]);
	}

	private static void dfs(List<String> resultList, String inputString, int outStringLength, int combinations, StringBuilder sb) {
		if (resultList.size() == combinations)
			return;
		if (sb.length() == outStringLength) {
			resultList.add(sb.toString());
			return;
		}
		for (int i = 0; i < inputString.length(); i++) {
			if (sb.length() == 0 || sb.charAt(sb.length() - 1) != inputString.charAt(i)) {
				sb.append(inputString.charAt(i));
				dfs(resultList, inputString, outStringLength, combinations, sb);
				sb.deleteCharAt(sb.length() - 1);
			}
		}
	}

	public static void main(String[] args) {
		Arrays.stream(new SmallestLetterOfLenghtN().solution("abc",3, 25)).forEach(System.out::println);
	}
}
