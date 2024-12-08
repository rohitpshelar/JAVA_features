package com.codility;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.read.ListAppender;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import java.util.stream.IntStream;

public class StreamArrayDoubleLoop {
	static final Logger LOGGER = LoggerFactory.getLogger(StreamArrayDoubleLoop.class);
	//	{2,5,6,9,8,7,10}
	//
	//	sum = 12
	//
	//	[2,10]

    public static void main(String[] args) {
        int[] input = {2, 5, 6, 9, 8, 7, 10};
        int sum = 12;

        System.out.println("With Stream");
        System.out.println("--------------");
        withStream(input, sum);
        System.out.println(" ");
        System.out.println("With For Loop");
        System.out.println("--------------");
        withForLoop(input, sum);
    }

    private static void withStream(int[] inputArray, int sum) {
        IntStream.range(0, inputArray.length).forEach(i -> IntStream.range(0, inputArray.length)
                .filter(j -> inputArray[i] + inputArray[j] == sum).forEach(j -> System.out.println(inputArray[i] + "," + inputArray[j]))
        );
    }

    private static void withForLoop(int[] inputArray, int sum) {
		LOGGER.info(() -> "start");
        for (int j = 0; j < inputArray.length; j++) {
            for (int j2 = 0; j2 < inputArray.length; j2++) {
                if (inputArray[j] + inputArray[j2] == sum) {
                    System.out.println(inputArray[j] + "," + inputArray[j2]);
                }
            }
        }
    }


//	@Test
//	void doThat() throws Exception {
//		// get Logback Logger
//		Logger fooLogger = LoggerFactory.getLogger(StreamArrayDoubleLoop.class);
//
//		// create and start a ListAppender
//		ListAppender<ILoggingEvent> listAppender = new ListAppender<>();
//		listAppender.start();
//
//		// add the appender to the logger
//		// addAppender is outdated now
//		fooLogger.addAppender(listAppender);
//
//		// call method under test
//		Foo foo = new Foo();
//		foo.doThat();
//
//		// JUnit assertions
//		List<ILoggingEvent> logsList = listAppender.list;
//		assertEquals("start", logsList.get(0)
//				.getMessage());
//		assertEquals(Level.INFO, logsList.get(0)
//				.getLevel());
//
//		assertEquals("finish", logsList.get(1)
//				.getMessage());
//		assertEquals(Level.INFO, logsList.get(1)
//				.getLevel());
//	}
}
