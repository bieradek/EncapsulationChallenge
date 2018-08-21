package com.timbuchalka;

public class Printer {
    private boolean duplex;
    private int tonerLevel; //percentage
    private int fuel; //initial 0
    private int pagesLeft; // initial 100;

    public Printer(boolean duplex, int tonerLevel, int pagesPrinted, int pagesLeft) {
        this.duplex = duplex;
        this.tonerLevel = tonerLevel;
        this.fuel = fuel;
        this.pagesLeft = pagesLeft;
    }

    public int getPagesLeft() {
        System.out.println("There are " + pagesLeft + " pages left");
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
        System.out.println("Toner percentage is " + tonerLevel);
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void fillUp() {
        this.tonerLevel += fuel;
        System.out.println("Filling up the toner");
    }

    public void printPage(int quantity) {
        if (duplex) {
            this.tonerLevel = this.tonerLevel - quantity * 2;
            this.pagesLeft -= quantity * 2;
            System.out.println("Printing " + quantity * 2 + " pages");
            fuel = fuel + 2;
        } else {
            this.tonerLevel = this.tonerLevel - quantity;
            this.pagesLeft -= quantity;
            System.out.println("Printing " + quantity + " pages");
            fuel++;
        }
    }
}
