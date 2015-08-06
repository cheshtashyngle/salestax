package com.salestax;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SalesTaxApplicationTest {

    @Test
    public void shouldCallConsoleAndParser() {
        Parser parser = mock(Parser.class);
        Console console = mock(Console.class);
        SalesTaxApplication salesTaxApplication = new SalesTaxApplication(console, parser);

        salesTaxApplication.start();

        verify(console).input();
        verify(parser).parseCommand(null);
    }

}
