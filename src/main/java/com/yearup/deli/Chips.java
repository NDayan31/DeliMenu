package com.yearup.deli;

public class Chips {
    private String kindOfChips;

    public Chips(String kindOfChips) {
        this.kindOfChips = kindOfChips;
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
        chip.append("\t<<Price: $").append(getPrice()).append(">>");
        return chip.toString();
    }

    public double getPrice() {
        return 1.5;
    }
}
