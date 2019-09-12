package com.stackroute;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class FrequencyTest {
    private static Frequency frequency;
    @BeforeClass
    public void setup() {
        frequency = new Frequency();
    }
    @AfterClass
    public void teardown() {
        frequency = null;
    }
    @Test
    public void findFrequency_CheckOccurrence_ReturnString() {
        frequency.setFilepath("../../../../../Files/FileDemo.txt");
        assertEquals("i-3,am-1,a-2,man-1,like-1,to-1,sleep-1,have-1,home-1",frequency.findFrequency());
        assertNotEquals("i-2,am-1,a-2,man-1,like-1,to-1,sleep-1,have-1,home-1",frequency.findFrequency());
        frequency.setFilepath("../../../../../Files/FileDemos.txt");
        assertEquals("File Not Found", frequency.findFrequency());
    }
}