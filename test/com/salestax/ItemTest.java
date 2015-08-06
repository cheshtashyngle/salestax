package com.salestax;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    @Test
    public void shouldCalculate0TaxForBook() {
        String itemName = "book";
        int number = 1;
        double rate = 12.49;
        String category = "others";
        boolean imported = false;
        Item item = new Item(itemName, number, rate, category, imported);

        assertEquals(0, item.calculateTax(), 0.005);
    }

}
