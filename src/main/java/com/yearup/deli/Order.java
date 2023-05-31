package com.yearup.deli;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Sandwich> sandwiches;
    private List<Drink> drinks;
    private List<Chips> chips;

    public Order() {
        this.sandwiches = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.chips = new ArrayList<>();
    }

    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }

    public void addDrinks(Drink drink) {
        drinks.add(drink);
    }

    public void addChips(Chips chip) {
        chips.add(chip);
    }
    public void displayCart () {
        System.out.println("==============CheckOut=============");
        for (Sandwich sandwich : sandwiches) {
            System.out.println(sandwich.toString());
        }
        for (Drink drink : drinks) {
            System.out.println(drink.toString());
        }
        for (Chips chips1 : chips) {
            System.out.println(chips1.toString());
        }
        System.out.println("===================================");
        System.out.println("\tSub Total: $" + grandTotal());
    }

    public double grandTotal() {
        double total = 0.0;
        for (Sandwich sandwich : sandwiches) {
            total += sandwich.getPrice();
        }
        for (Drink drink : drinks) {
              total += drink.getDrinkPrice();
        }
        for (Chips chips1 : chips) {
            total += chips1.getPrice();
        }
        return total;
    }
}
