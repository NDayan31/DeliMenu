package com.yearup.deli;

import java.time.LocalDateTime;

public class Drink {
    private String drinkType;
    private String drinkSize;
    private double drinkPrice;

    public Drink(String drinkType, String drinkSize) {
        this.drinkType = drinkType;
        this.drinkSize = drinkSize;
    }

    public String getDrinkSize() {
        return drinkSize;
    }

    public void setDrinkSize(String drinkSize) {
        this.drinkSize = drinkSize;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

    public void setDrinkPrice(double drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    public String getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
    }

    @Override
    public String toString() {
        StringBuilder drink = new StringBuilder();
        drink.append(drinkType).append(" ").append(drinkSize);
        drink.append("\t<<Price: $").append(drinkPrice).append(">>");
        return drink.toString();
    }

    public double getPrice() {
        if (drinkSize.equalsIgnoreCase("s")) {
            return 2.0;
        } else if (drinkSize.equalsIgnoreCase("m")) {
            return 2.5;
        } else {
            return 3.0;
        }
    }
}
