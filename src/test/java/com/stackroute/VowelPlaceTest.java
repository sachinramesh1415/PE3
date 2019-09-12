package com.stackroute;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class VowelPlaceTest {
    private static VowelPlace vowelPlace;
    @BeforeClass
    public void setup() {
        vowelPlace = new VowelPlace();
    }

    @AfterClass
    public void teardown() {
        vowelPlace = null;
    }

    @Test
    public void removeVowels_CountriesWithoutVowels_ReturnValues() {
        vowelPlace.setPlaces(new String[]{"India", "Egypt", "Australia"});
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        vowelPlace.removeVowels();
        assertEquals("Place Name without Vowels:0 Ind\nPlace Name without Vowels:1 Egypt\nPlace Name without Vowels:2 Astrl",outContent.toString());
        vowelPlace.setPlaces(new String[]{"India", "United States", "Great Britain", "Russia"});
        ByteArrayOutputStream outContent2 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent2));
        vowelPlace.removeVowels();
        assertEquals("Place Name without Vowels:0 Ind\nPlace Name without Vowels:1 Untd Stts\nPlace Name without Vowels:2 Grt Brtn\nPlace Name without Vowels:3 Rss",outContent2.toString());
    }

    @Test
    public void removeVowels_CountriesWithoutVowels_ReturnValuesFailure() {
        vowelPlace.setPlaces(new String[]{"India", "Egypt", "Australia"});
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        vowelPlace.removeVowels();
        assertNotEquals("Place Name without Vowels:0 India\nPlace Name without Vowels:1 Egypt\nPlace Name without Vowels:2 Astrl",outContent.toString());
        vowelPlace.setPlaces(new String[]{"India", "United States", "Great Britain", "Russia"});
        ByteArrayOutputStream outContent2 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent2));
        vowelPlace.removeVowels();
        assertNotEquals("Place Name without Vowels:0 Ind\nPlace Name without Vowels:1 Unated Stits\nPlace Name without Vowels:2 Grt Brtn\nPlace Name without Vowels:3 Rss",outContent2.toString());
    }
}