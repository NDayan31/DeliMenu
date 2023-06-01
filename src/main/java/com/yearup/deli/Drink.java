package com.yearup.deli;

import java.time.LocalDateTime;

public class Drink {
    private String drinkType;
    private String drinkSize;

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

    public String getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
    }
    @Override
    public String toString() {
        return drinkType + " " + drinkSize +
                "\t<<Price: $" + getPrice() + ">>";
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
