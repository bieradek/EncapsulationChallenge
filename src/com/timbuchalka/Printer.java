package com.timbuchalka;

public class Printer {
    private boolean duplex;
    private int tonerLevel; //percentage
    private int pagesPrinted;
    private int pagesLeft;

    public Printer(boolean duplex, int tonerLevel, int pagesPrinted, int pagesLeft) {
        this.duplex = duplex;
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.pagesLeft = pagesLeft;
    }

    public int getPagesLeft() {
        return pagesLeft;
    }

    public void setPagesLeft(int pagesLeft) {
        this.pagesLeft = pagesLeft;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public void setPagesPrinted(int pagesPrinted) {
        this.pagesPrinted = pagesPrinted;
    }

    public void fillUp(int ink) {
        System.out.println("Filling up the toner");
        this.tonerLevel += ink;
    }

    public void printPage(int quantity, boolean duplex) {
        if (duplex) {
            this.tonerLevel = this.tonerLevel - quantity * 2;
            this.pagesLeft -= quantity * 2;
            System.out.println("Printing a page");
        } else {
            this.tonerLevel = this.tonerLevel - quantity;
            this.pagesLeft -= quantity;
            System.out.println("Printing a page");
        }
    }
}
