package com.yearup.deli;

import java.util.ArrayList;

public class Sandwich extends Order {
    private String breadType;
    private int breadSize;
    private boolean toasted;
    private ArrayList <String> meatToppings;
    private boolean extraMeatTopping;
    private ArrayList <String> cheeseToppings;
    private boolean extraCheeseTopping;
    private ArrayList<String> basicToppings;
    private double sandwichPrice;

    public Sandwich(String breadType, int breadSize, boolean toasted, ArrayList<String> meatToppings,boolean extraMeatTopping, ArrayList<String> cheeseToppings, boolean extraCheeseTopping, ArrayList<String> basicToppings, double sandwichPrice) {
        this.breadType = breadType;
        this.breadSize = breadSize;
        this.toasted = toasted;
        this.meatToppings = meatToppings;
        this.extraMeatTopping = extraMeatTopping;
        this.cheeseToppings = cheeseToppings;
        this.extraCheeseTopping = extraCheeseTopping;
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

    public ArrayList<String> getMeatToppings() {
        return meatToppings;
    }

    public boolean isExtraMeatTopping() {
        return extraMeatTopping;
    }

    public void setExtraMeatTopping(boolean extraMeatTopping) {
        this.extraMeatTopping = extraMeatTopping;
    }

    public void setMeatToppings(ArrayList<String> meatToppings) {
        this.meatToppings = meatToppings;
    }

    public ArrayList<String> getCheeseToppings() {
        return cheeseToppings;
    }

    public void setCheeseToppings(ArrayList<String> cheeseToppings) {
        this.cheeseToppings = cheeseToppings;
    }

    public boolean isExtraCheeseTopping() {
        return extraCheeseTopping;
    }

    public void setExtraCheeseTopping(boolean extraCheeseTopping) {
        this.extraCheeseTopping = extraCheeseTopping;
    }

    public ArrayList<String> getBasicToppings() {
        return basicToppings;
    }

    public void setBasicToppings(ArrayList<String> basicToppings) {
        this.basicToppings = basicToppings;
    }

    @Override
    public String toString() {
        StringBuilder sandwich = new StringBuilder();
        sandwich.append("Custom Sandwich:\n");
        sandwich.append(breadSize).append("\" ").append(breadType);
        if (toasted) {sandwich.append(" toasted");}
        sandwich.append("\nMeat");
        for (int i = 0; i < meatToppings.size(); i++){
            if (i % 3 == 0){sandwich.append("\n");}
            sandwich.append(meatToppings.get(i)).append(", ");
        }
        if (extraMeatTopping) {sandwich.append("\n\tExtra Meat");}

        sandwich.append("\nCheese");
        for (int i = 0; i < cheeseToppings.size(); i++){
            if (i % 3 == 0){sandwich.append("\n");}
            sandwich.append(cheeseToppings.get(i)).append(", ");
        }
        if (extraCheeseTopping) {sandwich.append("\n\tExtra Cheese");}

        sandwich.append("\nOther Toppings and Sauces");
        for (int i = 0; i < basicToppings.size(); i++){
            if (i % 3 == 0){sandwich.append("\n");}
            sandwich.append(basicToppings.get(i)).append(", ");
        }
        sandwich.append("\t<<Price: $").append(sandwichPrice).append(">>");


        return sandwich.toString();
    }

    @Override
    public double getPrice() {
        if (breadSize == 4) {
            sandwichPrice = 5.5 + (meatToppings.size() * 1.00) + (cheeseToppings.size() * 0.75);
            if (extraMeatTopping) {sandwichPrice += 0.5;}
            if (extraCheeseTopping) {sandwichPrice += 0.3;}
        } else if (breadSize == 8) {
            sandwichPrice = 7.0 + (meatToppings.size() * 2.00) + (cheeseToppings.size() * 1.5);
            if (extraMeatTopping) {sandwichPrice += 1.0;}
            if (extraCheeseTopping) {sandwichPrice += 0.6;}
        } else {
            sandwichPrice = 8.5 + (meatToppings.size() * 3.00) + (cheeseToppings.size() * 2.25);
            if (extraMeatTopping) {sandwichPrice += 1.5;}
            if (extraCheeseTopping) {sandwichPrice += 0.9;}
        }
        return sandwichPrice;
    }
}
