package com.stackroute;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class GenerateExceptionsTest {
    private static GenerateExceptions generateExceptions;
    @Rule
    public ExpectedException exp= ExpectedException.none();
    @BeforeClass
    public static void setup() {
        generateExceptions= new GenerateExceptions();
    }
    @AfterClass
    public static void teardown() {
        generateExceptions = null;
    }
    @Test
    public void negArrException_ThrowsException_ShowsErrorMessage() {
        exp.expect(NegativeArraySizeException.class);
        exp.expectMessage("Negative Array Size Exception is thrown");
        generateExceptions.negArrException();
    }
    @Test
    public void indOutBounException_ThrowsException_ShowsErrorMessage() {
        exp.expect(IndexOutOfBoundsException.class);
        exp.expectMessage("Index Out of Bounds Exception is thrown");
        generateExceptions.indOutBounException();
    }
    @Test
    public void nulPoiException_ThrowsException_ShowsErrorMessage() {
        exp.expect(NullPointerException.class);
        exp.expectMessage("Null Pointer Exception is thrown");
        generateExceptions.nulPoiException();
    }
}