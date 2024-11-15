package com.stream;

import nl.altindag.log.LogCaptor;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;


class StreamTestTest {
    StreamTest test = new StreamTest();

    @ParameterizedTest
    @ValueSource(strings = {""})
    void m1(String value){
        LogCaptor logCaptor = LogCaptor.forClass(StreamTest.class);
        test.m1(value);
        assertThat(logCaptor.getInfoLogs())
                .contains("str");

    }
}