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
    public void testShowMessage(){
        ConsoleHelper.showMessage("Test Message");
        assertEquals("Test Message", outContent.toString().trim());
    }

    @Test
    public void testGetUserInput(){
        ByteArrayInputStream inputContent = new ByteArrayInputStream("1".getBytes());
        System.setIn(inputContent);

        int input = ConsoleHelper.getUserInput("Insert a value");
        
        assertEquals("Insert a value", outContent.toString().trim());
        assertEquals(1, input);

        System.setIn(null);
    }
}
