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
                    addDrink(scanner);
                    break;
                case 3:
                    addChips(scanner);
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


    private static void addDrink(Scanner scanner) {
        boolean exit = false;
        while (!exit) {
            System.out.println("=============Drinks=============");
            System.out.println("\t1. Coke");
            System.out.println("\t2. Sprite");
            System.out.println("\t3. Fruit Punch");
            System.out.println("\t4. Fanta");
            System.out.println("\t5. Ginger Ale");
            System.out.println("\t6. Root Beer");
            System.out.println("\t0. Return to main menu");
            System.out.print("What kind of chips would you like: ");
            int selection = scanner.nextInt();
            switch (selection){
                case 1: // Coke
                    // enters quantity
                    System.out.println("Added to cart");
                    //adds to orders array
                    break;
                case 2: // Sprite
                    // enters quantity
                    System.out.println("Added to cart");
                    //adds to orders array
                    break;
                case 3: // Fruit Punch
                    // enters quantity
                    System.out.println("Added to cart");
                    //adds to orders array
                    break;
                case 4: // Fanta
                    // enters quantity
                    System.out.println("Added to cart");
                    //adds to orders array
                    break;
                case 5: // Ginger Ale
                    // enters quantity
                    System.out.println("Added to cart");
                    //adds to orders array
                    break;
                case 6: // Root Beer
                    // enters quantity
                    System.out.println("Added to cart");
                    //adds to orders array
                    break;
                case 0:
                    System.out.println("Returning to main menu");
                    break;
                default:
                    System.out.println("Incorrect input");
                    break;
            }
        }
    }
    private static void addChips(Scanner scanner) {
        boolean exit = false;
        while (!exit) {
            System.out.println("=============Chips=============");
            System.out.println("\t1. Lay's Potato Chips");
            System.out.println("\t2. Tortilla Chips");
            System.out.println("\t3. Tortilla Chips");
            System.out.println("\t4. Salt & Vinegar Chips");
            System.out.println("\t5. Cheetos");
            System.out.println("\t6. Doritos");
            System.out.println("\t0. Return to main menu");
            System.out.print("What kind of chips would you like: ");
            int selection = scanner.nextInt();
            switch (selection){
                case 1: // Lay's Potato Chips
                    // enters quantity
                    System.out.println("Added to cart");
                    //adds to orders array
                    break;
                case 2: // Tortilla Chips
                    // enters quantity
                    System.out.println("Added to cart");
                    //adds to orders array
                    break;
                case 3: // Tortilla Chips
                    // enters quantity
                    System.out.println("Added to cart");
                    //adds to orders array
                    break;
                case 4: // Salt & Vinegar Chips
                    // enters quantity
                    System.out.println("Added to cart");
                    //adds to orders array
                    break;
                case 5: // Cheetos
                    // enters quantity
                    System.out.println("Added to cart");
                    //adds to orders array
                    break;
                case 6: // Doritos
                    // enters quantity
                    System.out.println("Added to cart");
                    //adds to orders array
                    break;
                case 0:
                    System.out.println("Returning to main menu");
                    break;
                default:
                    System.out.println("Incorrect input");
                    break;
            }
        }
    }
    private static void checkOut() {
    }
    private static void cancelOrder() {

    }
}









