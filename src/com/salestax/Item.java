package com.salestax;

public class Item {

    private String item;
    private int number;
    private double rate;
    private String category;
    private boolean imported;

    public Item(String item, int number, double rate, String category, boolean imported) {
        this.item = item;
        this.number = number;
        this.rate = rate;
        this.category = category;
        this.imported = imported;
    }
}
