package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        Printer duplexPrinter = new Printer(true,100,0,100);
        Printer normalPrinter = new Printer(false,100,0,100);

        duplexPrinter.printPage(5);
        duplexPrinter.getPagesLeft();
        duplexPrinter.fillUp();
        duplexPrinter.getTonerLevel();
    }
}