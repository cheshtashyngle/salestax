package com.salestax;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Console console = new Console();
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
        SalesTaxApplication salesTaxApplication = new SalesTaxApplication(console, parser);
        salesTaxApplication.start();
    }
}
