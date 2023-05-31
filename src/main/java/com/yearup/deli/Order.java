package com.yearup.deli;

public class Order {
    private double price;

    public Order() {
    }

    public Order(double price) {
        this.price = price;
    }

    public static double getPrice() {
        return price;
    }
}

