package com.junit;

import com.stream.FindPalindromesFromString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;

class CsvSource {

    FindPalindromesFromString t = new FindPalindromesFromString();
    @ParameterizedTest
    @org.junit.jupiter.params.provider.CsvSource({
            "aahhhhxyxtptndyyhb, 1, 9",
            "aahhhhxyxtptndyyhb, 2, 3",
            "aahhhhxyxtptndyyhb, 3, 3",
            "aahhhhxyxtptndyyhb, 4, 1",
            "aahhhhxyxtptndyyhb, 5, 0"
    })
    void filterNewWay(String s, int i, int expected) {
        var l = t.filterNewWay(s,i);
        Assertions.assertEquals(expected,l.size());
    }

}