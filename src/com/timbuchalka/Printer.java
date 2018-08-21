package com.timbuchalka;

public class Printer {
    private String type;
    private int tonerLevel; //percentage
    private int pagesLeft;
    private int pagesPrinted;

    public void fillUp() {
        System.out.println("Filling up the toner");
    }

    public void printPage() {
        System.out.println("Printing a page");
    }
}
