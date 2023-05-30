package com.yearup.deli;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);


    private void homeScreen(Scanner scanner) {
        boolean running = true;
        while (running) {
            System.out.println("(っˆڡˆς) Welcome to Delicious Sandwiches! ( ˘▽˘)っ♨");
            System.out.println("1) New Order");
            System.out.println("0) Exit");

            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    newOrder(scanner);
                    break;
                case 0:
                    running = false;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }

    private void newOrder(Scanner scanner) {
        boolean running = true;
        while (running) {
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");

            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    addSandwich(scanner);
                    break;
                case 2:
                    addDrink();
                    break;
                case 3:
                    addChips();
                    break;
                case 4:
                    checkOut();
                    break;
                case 0:
                    cancelOrder();
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }

    private void checkOut() {
    }

    private void addChips() {

    }

    private void addDrink() {

    }

    private void cancelOrder() {

    }

    private void addSandwich(Scanner scanner) {
        boolean running = true;
        while (running) {
            System.out.println("Select your bread:");
            String breadType = scanner.nextLine();
            System.out.println("Sandwich size:");
            int sandwichSize = scanner.nextInt();
            toppings();
            System.out.println("Would you like your sandwich toasted?");
            System.out.println("Would you like a drink?");
            System.out.println("Would you like chips?");

        }

    }

    private void toppings() {
        boolean running = true;
        while (running) {
            System.out.println("Meat:");
            String meat = scanner.nextLine();
            System.out.println("Extra meat?(y/n):");
            String optionMeat = scanner.nextLine();
            System.out.println("Extra meat:");
            String extraMeat = scanner.nextLine();
        }
    }
}







