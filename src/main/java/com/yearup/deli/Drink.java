package com.yearup.deli;

import java.time.LocalDateTime;

public class Drink extends Order{
    private int drinkQuantity;
    private String drinkType;

    private double drinkPrice;

    public Drink(int drinkQuantity, String drinkType,double drinkPrice) {
        this.drinkQuantity = drinkQuantity;
        this.drinkType = drinkType;
        this.drinkPrice = drinkPrice;
    }

    public int getDrinkQuantity() {
        return drinkQuantity;
    }

    public void setDrinkQuantity(int drinkQuantity) {
        this.drinkQuantity = drinkQuantity;
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
    public double getPrice() {
        return 0;
    }
}
