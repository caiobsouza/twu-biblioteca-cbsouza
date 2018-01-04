package com.twu.biblioteca.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ConsoleHelperTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() {

        System.setOut(null);
    }

    @Test
    public void testShowMessage() {
        ConsoleHelper.showMessage("Test Message");
        assertEquals("Test Message", outContent.toString().trim());
    }

    @Test
    public void testGetUserInput() {
        String mockInput = "1";
        String mockOutput = "Insert a value";

        ByteArrayInputStream inputContent = new ByteArrayInputStream(mockInput.getBytes());
        System.setIn(inputContent);

        int consoleInput = ConsoleHelper.getUserInput(mockOutput);

        assertEquals(mockOutput, outContent.toString().trim());
        assertEquals(Integer.parseInt(mockInput), consoleInput);

        System.setIn(null);
    }
}
