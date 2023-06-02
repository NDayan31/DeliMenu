package com.yearup.deli;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChipsTest {
    @Test
    void getPriceShouldReturn1p5() {
        //Arrange
        var chips = new Chips("Lay's Potato Chips");


        //Act
        chips.getPrice();

        //Assert

    }

}