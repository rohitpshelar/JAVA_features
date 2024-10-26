package com.codility;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Class for finding the length of the longest substring without repeating characters.
 */
final class FirstNonRepetativeChar {
    private FirstNonRepetativeChar() {
    }

    /**
     * Finds the length of the longest substring without repeating characters.
     *
     * @param s the input string
     * @return the length of the longest non-repetitive substring
     */
    public static Character findFirstNonRepetativeChar(String s) {
        int maxLength = 0;
        int start = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // If the character is already in the map and its index is within the current window
            if (charIndexMap.containsKey(currentChar) ) {
                // Move the start to the position right after the last occurrence of the current character
                charIndexMap.put(currentChar, charIndexMap.get(currentChar) + 1);
            }else {

                // Update the last seen index of the current character
                charIndexMap.put(currentChar, 0);
            }
            // Calculate the maximum length of the substring without repeating characters
            maxLength = Math.max(maxLength, i - start + 1);
        }
        return charIndexMap.entrySet().stream().sorted(Map.Entry.<Character, Integer>comparingByValue().reversed()).filter(c -> c.getValue()==0).findFirst().map(Map.Entry::getKey).get();
    }
}
