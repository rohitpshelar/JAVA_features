package com.stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TestCapcoTest {

    public static Stream<Arguments> findProfitFromStock() {
        return Stream.of(
                Arguments.of(new int[]{3,3,5,0,0,3,1,0,4},6),
                Arguments.of(new int[]{3,3,5,0,0,3,1,3,4},7));
    }

    @ParameterizedTest
    @MethodSource
    void findProfitFromStock(int[] price, int expectedTotal) {
        TestCapco testCapco = new TestCapco();
        assertEquals(expectedTotal,testCapco.findProfitFromStock(price));
    }
}