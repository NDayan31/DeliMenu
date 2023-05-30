package com.yearup.deli;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }

    private static void homeScreen(Scanner scanner) {
        boolean running = true;
        while (running) {
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

    private static void newOrder(Scanner scanner) {
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

    private static void addSandwich(Scanner scanner) {
        boolean running = true;
        while (running) {
            System.out.println("Select your bread:");
            String breadType = scanner.nextLine();
            System.out.println("Sandwich size:");
            int sandwichSize = scanner.nextInt();
            System.out.println("Toppings:");
            System.out.println("Would you like your sandwich toasted?");
            System.out.println("Would you like a drink?");
            System.out.println("Would you like chips?");
        }
    }


    private static void addDrink() {

    }
    private static void addChips() {
    }
    private static void checkOut() {
    }
    private static void cancelOrder() {

    }
}









