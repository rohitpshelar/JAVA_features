package com.Interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MergeArraysDemoTest {

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 5, 7}, new int[]{2, 4, 6, 8},1),
                Arguments.of(new int[]{1, 3, 5, 7}, new int[]{2, 4, 6, 8},2),
                Arguments.of(new int[]{1, 3, 5, 7}, new int[]{2, 4, 6, 8},3)
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void mergeArrays(int[] arr1, int[] arr2, int type) {
        var expected = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        Assertions.assertArrayEquals(expected ,MergeArraysDemo.mergeArrays(arr1, arr2,type));
    }
}