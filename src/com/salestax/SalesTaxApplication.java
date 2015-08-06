package com.salestax;

public class SalesTaxApplication {
    private Console console;
    private Parser parser;

    public SalesTaxApplication(Console console, Parser parser) {
        this.console = console;
        this.parser = parser;
    }

    public void start() {
        String input = console.input();
        Item item = parser.parseCommand(input);
    }
}