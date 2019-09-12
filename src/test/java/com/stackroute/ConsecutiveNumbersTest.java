package com.stackroute;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ConsecutiveNumbersTest {
    private static ConsecutiveNumbers consecutiveNumbers;
    @BeforeClass
    public void setup() {
        consecutiveNumbers = new ConsecutiveNumbers();
    }
    @AfterClass
    public void teardown() {
        consecutiveNumbers = null;
    }

    @Test
    public void checkConsecutive_Check_Return() {
        consecutiveNumbers.setQuery("1 2 3 4 5 6 7");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        consecutiveNumbers.checkConsecutive();
        assertEquals("1 2 3 4 5 6 7 are consecutive numbers.",outContent.toString());
        consecutiveNumbers.setQuery("4 6 2 5 4 6 1");
        ByteArrayOutputStream outContent2 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent2));
        consecutiveNumbers.checkConsecutive();
        assertEquals("4 6 2 5 4 6 1 non consecutive numbers.",outContent2.toString());
    }
    @Test
    public void checkConsecutive_Check_ReturnFailure() {
        consecutiveNumbers.setQuery("1 2 3 4 5 6 7");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        consecutiveNumbers.checkConsecutive();
        assertNotEquals("1 2 3 4 5 6 7 non consecutive numbers.",outContent.toString());
    }
}