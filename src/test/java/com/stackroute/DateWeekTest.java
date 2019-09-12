package com.stackroute;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;

public class DateWeekTest {
    private static DateWeek dateWeek;
    @BeforeClass
    public void setup(){
        dateWeek = new DateWeek();
    }
    @AfterClass
    public void teardown(){
        dateWeek = null;
    }
    @Test
    public void findFirstDate_FindFirstDate_ReturnDate() {
        dateWeek.setDate("19/09/2019");
        assertEquals("16/09/2019",dateWeek.findFirstDate());
        dateWeek.setDate("11/03/2016");
        assertEquals("7/03/2016",dateWeek.findFirstDate());
    }
    @Test
    public void findFirstDate_FindFirstDate_ReturnDateFailure() {
        dateWeek.setDate("19/09/2019");
        assertNotEquals("21/09/2019",dateWeek.findFirstDate());
        dateWeek.setDate("11/03/2016");
        assertNotEquals("30/03/2016",dateWeek.findFirstDate());
    }
    @Test
    public void findLastDate_FindLastDate_ReturnDate() {
        dateWeek.setDate("19/09/2019");
        assertEquals("22/09/2019",dateWeek.findLastDate());
        dateWeek.setDate("11/03/2016");
        assertEquals("13/03/2016",dateWeek.findLastDate());
    }
    @Test
    public void findLastDate_FindLastDate_ReturnDateFailure() {
        dateWeek.setDate("19/09/2019");
        assertNotEquals("21/09/2019",dateWeek.findLastDate());
        dateWeek.setDate("11/03/2016");
        assertNotEquals("30/03/2016",dateWeek.findLastDate());
    }
}