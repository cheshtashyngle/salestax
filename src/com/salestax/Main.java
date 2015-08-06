package com.salestax;

public class Main {

    public static void main(String[] args) {
        Console console = new Console();
        while(true) {
            String input = console.input();
            if(input.equals("Quit"))
                break;
            String[] inputs = input.split(" at ");
            double rate = Double.parseDouble(inputs[1]);
            inputs = inputs[0].split(" ",2);
            int number = Integer.parseInt(inputs[0]);
            String item = inputs[1];
        }
    }
}
