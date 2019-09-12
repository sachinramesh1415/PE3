package com.stackroute;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class ThrowExceptionTest {
    private static ThrowException throwException;

    @BeforeClass
    public static void setup() {
        throwException = new ThrowException();
    }
    @AfterClass
    public static void teardown() {
        throwException = null;
    }
    @Test
    public void main_ThrowException_ReturnMessage() throws Exception {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        throwException.setMessage("This is an error");
        throwException.main(new String[]{"123"});
        assertEquals("This is an error\nThis is printed\n",outContent.toString());
    }
    @Test
    public void main_ThrowException_ReturnMessageFailure() throws Exception {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        throwException.setMessage("This is an error");
        throwException.main(new String[]{"123"});
        assertNotEquals("asdsda\nThis is printed\n",outContent.toString());
    }
}