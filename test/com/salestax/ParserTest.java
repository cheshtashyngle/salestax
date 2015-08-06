package com.salestax;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ParserTest {

    @Test
    public void shouldParse1ChocolateBarAt10() {
        String input = "1 chocolate bar at 0.85";
        ArrayList<String> food = new ArrayList<String>();
        food.add("chocolate bar");
        food.add("box of imported chocolates");
        food.add("box of imported chocolates");
        food.add("imported box of chocolates");
        ArrayList<String> books = new ArrayList<String>();
        books.add("book");
        ArrayList<String> medicines = new ArrayList<String>();
        medicines.add("packet of headache pills");
        Parser parser = new Parser(food, books, medicines);

        assertEquals(Item.class, parser.parseCommand(input).getClass());
    }
}
