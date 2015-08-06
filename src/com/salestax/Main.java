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
        while(true) {
            String input = console.input();
            if(input.equals("Quit"))
                break;
            String[] inputs = input.split(" at ");
            double rate = Double.parseDouble(inputs[1]);
            inputs = inputs[0].split(" ",2);
            int number = Integer.parseInt(inputs[0]);
            String item = inputs[1];
            String category;
            if(food.contains(item))
                category = "food";
            else if(books.contains(item))
                category = "book";
            else if(medicines.contains(item))
                category = "medicine";
            else
                category = "others";
            boolean imported;
            if(item.contains("imported"))
                imported = true;
            else
                imported = false;
        }
    }
}
