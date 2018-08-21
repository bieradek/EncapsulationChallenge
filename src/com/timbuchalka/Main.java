package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer("Duplex", 60, 20);
        printer.fillUp(2);
        printer.printPage();
    }
}
