package com.codility;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FirstNonRepetativeCharTest {

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
//                Arguments.of("abcea", "b")
                Arguments.of("jaeva", "j")
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testFirstNonRepetativeChar(String input, Character expectedLength) {
        assertEquals(expectedLength, FirstNonRepetativeChar.findFirstNonRepetativeChar(input));
    }
}