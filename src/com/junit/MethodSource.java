package com.junit;

import com.stream.TestCapcoFindProfitFromStock;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MethodSource {

    public static Stream<Arguments> findProfitFromStock() {
        return Stream.of(
                Arguments.of(new int[]{3,3,5,0,0,3,1,0,4},6),
                Arguments.of(new int[]{3,3,5,0,0,3,1,3,4},7));
    }

    @ParameterizedTest
    @org.junit.jupiter.params.provider.MethodSource
    void findProfitFromStock(int[] price, int expectedTotal) {
        TestCapcoFindProfitFromStock testCapcoFindProfitFromStock = new TestCapcoFindProfitFromStock();
        assertEquals(expectedTotal, testCapcoFindProfitFromStock.findProfitFromStock(price));
    }
}