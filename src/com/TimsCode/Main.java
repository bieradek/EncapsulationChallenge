package com.TimsCode;

public class Main {

    public static void main(String[] args) {
        Printer somePrinter = new Printer(50, false); // true
        System.out.println("Initial page count = " + somePrinter.getPagesPrinted());
        int pagesPrinted = somePrinter.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer " + somePrinter.getPagesPrinted());
        pagesPrinted = somePrinter.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer " + somePrinter.getPagesPrinted());
    }
}