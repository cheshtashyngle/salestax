package com.salestax;

import java.util.ArrayList;

public class Parser {
    private ArrayList<String> food;
    private ArrayList<String> books;
    private ArrayList<String> medicines;

    public Parser(ArrayList<String> food, ArrayList<String> books, ArrayList<String> medicines) {
        this.food = food;
        this.books = books;
        this.medicines = medicines;
    }

    public Item parseCommand(String input) {
        String[] inputs = input.split(" at ");
        double rate = Double.parseDouble(inputs[1]);
        inputs = inputs[0].split(" ", 2);
        int number = Integer.parseInt(inputs[0]);
        String item = inputs[1];
        String category;
        if (food.contains(item))
            category = "food";
        else if (books.contains(item))
            category = "book";
        else if (medicines.contains(item))
            category = "medicine";
        else
            category = "others";
        boolean imported;
        if (item.contains("imported"))
            imported = true;
        else
            imported = false;
        return new  Item(item, number, rate, category, imported);
    }
}
