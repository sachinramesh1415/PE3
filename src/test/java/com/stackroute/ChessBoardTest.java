package com.stackroute;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ChessBoardTest {
    private static ChessBoard chessBoard;
    @BeforeClass
    public void setup() {
        chessBoard = new ChessBoard();
    }
    @AfterClass
    public void teardown() {
        chessBoard = null;
    }
    @Test
    public void chessBoard_GeneratePattern_PrintPattern() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        chessBoard.chessBoard();
        assertEquals("My Chess Board\nWW|BB|WW|BB|WW|BB|WW|BB|\nBB|WW|BB|WW|BB|WW|BB|WW|\nWW|BB|WW|BB|WW|BB|WW|BB|\nBB|WW|BB|WW|BB|WW|BB|WW|\nWW|BB|WW|BB|WW|BB|WW|BB|\nBB|WW|BB|WW|BB|WW|BB|WW|\nWW|BB|WW|BB|WW|BB|WW|BB|\nBB|WW|BB|WW|BB|WW|BB|WW|",outContent.toString());
    }

    @Test
    public void chessBoard_GeneratePattern_PrintPatternFailure() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        chessBoard.chessBoard();
        assertNotEquals("My Chess Board\nWW|BB|WW|BB|WW|WW|BB|BB|\nBB|WW|BB|WW|WW|WW|BB|WW|\nWW|BB|WW|BB|BB|BB|WW|BB|\nBB|WW|BB|WW|BB|WW|BB|WW|\nWW|BB|WW|BB|WW|BB|WW|BB|\nBB|WW|BB|WW|BB|WW|BB|WW|\nWW|BB|WW|BB|WW|BB|WW|BB|\nBB|WW|BB|WW|BB|WW|BB|WW|",outContent.toString());
    }
}