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
        return kindOfChips +
                "\t<<Price: $" + getPrice() + ">>";
    }

    public double getPrice() {
        return 1.5;
    }
}
