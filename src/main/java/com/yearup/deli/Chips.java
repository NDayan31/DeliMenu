package com.yearup.deli;

public class Chips extends Order {
    private String kindOfChips;
    private double price;

    public Chips(String kindOfChips, double price) {
        this.kindOfChips = kindOfChips;
        this.price = price;
    }

    public String getKindOfChips() {
        return kindOfChips;
    }

    public void setKindOfChips(String kindOfChips) {
        this.kindOfChips = kindOfChips;
    }

    @Override
    public double getPrice() {
        return 1.5;
    }
}
