package com.stackroute;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class StudentMarksTest {
    private static StudentMarks studentMarks;
    @BeforeClass
    public void setup() {
        studentMarks = new StudentMarks();
    }
    
    @AfterClass      
    public void teardown() {
        studentMarks = null;
    }

    @Test
    public void isValidGrade_GradesInvalid_ShouldThrowException() {
        studentMarks.setNumber(5);
        studentMarks.setGrades(new int[]{20,50,60,80,40});
        assertEquals("The grades are valid", studentMarks.isValidGrade());
        studentMarks.setNumber(3);
        studentMarks.setGrades(new int[]{55,98,104});
        assertEquals("The grades are invalid", studentMarks.isValidGrade());
        studentMarks.setNumber(0);
        studentMarks.setGrades(null);
        assertNull(studentMarks.isValidGrade());
    }

    @Test
    public void isValidGrade_GradesInvalid_ShouldThrowExceptionFailure() {
        studentMarks.setNumber(3);
        studentMarks.setGrades(new int[]{55,98,34});
        assertNotEquals("The grades are invalid", studentMarks.isValidGrade());
        studentMarks.setNumber(5);
        studentMarks.setGrades(new int[]{20,50,60,80,40});
        assertNotNull(studentMarks.isValidGrade());
    }
}