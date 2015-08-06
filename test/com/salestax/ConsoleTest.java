package com.salestax;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;


public class ConsoleTest {
    private ByteArrayInputStream is = new ByteArrayInputStream("My".getBytes());
    InputStream printStreamIn;

    @Before
    public void setUpStream() {
        printStreamIn = System.in;
        System.setIn(is);
    }

    @Test
    public void shouldReturnTheCorrectInput() {
        Console console = new Console();

        assertEquals("My", console.input());
    }

    @After
    public void cleanUpStream() {
        System.setIn(printStreamIn);
    }
}