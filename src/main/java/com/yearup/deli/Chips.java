package com.yearup.deli;

public class Chips extends Order {

    private String kindOfChips;
    private int numberOfChips;

    private double price;

    public Chips(String kindOfChips, int numberOfChips, double price) {
        this.kindOfChips = kindOfChips;
        this.numberOfChips = numberOfChips;
        this.price = price;
    }

    public String getKindOfChips() {
        return kindOfChips;
    }

    public void setKindOfChips(String kindOfChips) {
        this.kindOfChips = kindOfChips;
    }

    public int getNumberOfChips() {
        return numberOfChips;
    }

    public void setNumberOfChips(int numberOfChips) {
        this.numberOfChips = numberOfChips;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
