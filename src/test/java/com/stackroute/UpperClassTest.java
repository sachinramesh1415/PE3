package com.stackroute;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class UpperClassTest {
    private static UpperClass upperClass;
    @BeforeClass
    public static void setup() {
        upperClass= new UpperClass();
    }
    @AfterClass
    public static void teardown() {
        upperClass = null;
    }
    @Test
    public void toUpperCase_ConvertsCase_PrintsFile() {
        String filePath = "../../../../../Files/TestFile.txt";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        upperClass.setFile(filePath);
        upperClass.toUpperCase();
        upperClass.printFile();
        assertEquals("LEVERAGE AGILE FRAMEWORKS TO PROVIDE A ROBUST SYNOPSIS FOR HIGH LEVEL OVERVIEWS. ITERATIVE APPROACHES TO CORPORATE STRATEGY FOSTER COLLABORATIVE THINKING TO FURTHER THE OVERALL VALUE PROPOSITION. ORGANICALLY GROW THE HOLISTIC WORLD VIEW OF DISRUPTIVE INNOVATION VIA WORKPLACE DIVERSITY AND EMPOWERMENT.",outContent.toString());
    }

    @Test
    public void toUpperCase_ConvertsCase_PrintsFileFailure() {
        String filePath = "../../../../../Files/TestFiles.txt";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        upperClass.setFile(filePath);
        upperClass.toUpperCase();
        upperClass.printFile();
        assertEquals("File Not Found",outContent.toString());
    }
}