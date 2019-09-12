package com.stackroute;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AddMatrixTest {
    private static AddMatrix addMatrix;
    @BeforeClass
    public void setup() {
        addMatrix = new AddMatrix();
    }

    @AfterClass
    public void teardown() {
        addMatrix = null;
    }

    @Test
    public void addMatrix_Summation_ReturnSum() {
        addMatrix.setRow(2);
        addMatrix.setColumn(2);
        int[][] sum = {{6,8},{10,12}};
        addMatrix.setMat1(new int[][]{{1,2},{3,4}});
        addMatrix.setMat2(new int[][]{{5,6},{7,8}});
        assertEquals(sum,addMatrix.addMatrix());
        addMatrix.setRow(3);
        addMatrix.setColumn(2);
        int[][] sum2 = {{6,8},{10,12},{}};
        addMatrix.setMat1(new int[][]{{1,2},{3,4},{5,6}});
        addMatrix.setMat2(new int[][]{{7,8},{9,10},{11,12}});
        assertEquals(sum,addMatrix.addMatrix());
    }

    @Test
    public void addMatrix_Summation_ReturnSumFailure() {
        addMatrix.setRow(2);
        addMatrix.setColumn(2);
        int[][] sum = {{6,9},{10,12}};
        addMatrix.setMat1(new int[][]{{1,2},{3,4}});
        addMatrix.setMat2(new int[][]{{5,6},{7,8}});
        assertNotEquals(sum,addMatrix.addMatrix());
        addMatrix.setRow(3);
        addMatrix.setColumn(2);
        int[][] sum2 = {{6,2},{10,14},{}};
        addMatrix.setMat1(new int[][]{{1,2},{3,4},{5,6}});
        addMatrix.setMat2(new int[][]{{7,8},{9,10},{11,12}});
        assertNotEquals(sum,addMatrix.addMatrix());
    }
}