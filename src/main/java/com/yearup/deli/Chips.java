package com.yearup.deli;

public class Chips extends Order {

    private String kindOfChips;
    private int nummberofChips;

    private double price;

    public Chips(String kindOfChips, int nummberofChips, double price) {
        this.kindOfChips = kindOfChips;
        this.nummberofChips = nummberofChips;
        this.price = price;
    }

    public String getKindOfChips() {
        return kindOfChips;
    }

    public void setKindOfChips(String kindOfChips) {
        this.kindOfChips = kindOfChips;
    }

    public int getNummberofChips() {
        return nummberofChips;
    }

    public void setNummberofChips(int nummberofChips) {
        this.nummberofChips = nummberofChips;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
