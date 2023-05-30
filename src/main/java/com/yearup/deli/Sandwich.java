package com.yearup.deli;

public class Sandwich extends Order{
    private String breadType;
    private int breadSize;
    private boolean toasted;

    //private String premiumToppings;
    private String meatToppings;
    private String cheeseToppings;
    private String basicToppings;
    private double sandwichPrice;

    public Sandwich(String breadType, int breadSize, boolean toasted, String meatToppings, String cheeseToppings, String basicToppings, double sandwichPrice) {
        this.breadType = breadType;
        this.breadSize = breadSize;
        this.toasted = toasted;
        this.meatToppings = meatToppings;
        this.cheeseToppings = cheeseToppings;
        this.basicToppings = basicToppings;
        this.sandwichPrice = sandwichPrice;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public int getBreadSize() {
        return breadSize;
    }

    public void setBreadSize(int breadSize) {
        this.breadSize = breadSize;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public String getMeatToppings() {
        return meatToppings;
    }

    public void setMeatToppings(String meatToppings) {
        this.meatToppings = meatToppings;
    }

    public String getCheeseToppings() {
        return cheeseToppings;
    }

    public void setCheeseToppings(String cheeseToppings) {
        this.cheeseToppings = cheeseToppings;
    }

    public String getBasicToppings() {
        return basicToppings;
    }

    public void setBasicToppings(String basicToppings) {
        this.basicToppings = basicToppings;
    }

    public double getSandwichPrice() {
        return sandwichPrice;
    }

    public void setSandwichPrice(double sandwichPrice) {
        this.sandwichPrice = sandwichPrice;
    }
}
