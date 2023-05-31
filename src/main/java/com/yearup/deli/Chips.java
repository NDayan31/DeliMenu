package com.yearup.deli;

public class Chips {
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
    public String toString() {
        StringBuilder chip = new StringBuilder();
        chip.append(kindOfChips);
        chip.append("\t<<Price: $").append(price).append(">>");
        return chip.toString();
    }

    public double getPrice() {
        return 1.5;
    }
}
