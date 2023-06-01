package com.yearup.deli;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    private Order order;
    ArrayList<Order> orders = new ArrayList<>();
    ReceiptFileManager receiptFileManager = new ReceiptFileManager();


    public void homeScreen(Scanner scanner) {
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
                    System.out.println("Have a nice day!");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }

    private void newOrder(Scanner scanner) {
        order = new Order();
        boolean running = true;
        while (running) {
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");

            int input = scanner.nextInt();
            scanner.nextLine();

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
                    checkOut(scanner);
                    break;
                case 0:
                    cancelOrder();
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }

    private void checkOut(Scanner scanner) {
        order.displayCart();
        System.out.println("====================================");
        System.out.println("\t1. Place Your Order");
        System.out.println("\t2. Cancel Your Order");
        System.out.println("\t3. Return to Main Menu");
        System.out.print("What would you like to do?: ");
        int command = scanner.nextInt();
        switch (command) {
            case 1:
                System.out.println("Thank you For your Order");
                receiptFileManager.createReceipt();
                order = null;
                homeScreen(scanner);
                break;
            case 2:
                cancelOrder();
                break;
            case 3:
                System.out.println("Returning to menu");
                break;
            default:
                System.out.println("Incorrect input");
                break;
        }
    }

    private void cancelOrder() {
        order.clearCart();
        System.out.println("Thank You, Come Again!");
    }

    private void addSandwich(Scanner scanner) {
        ArrayList<String> proteinInStock = new ArrayList<>(Arrays.asList("Steak", "Ham", "Salami", "RoastBeef", "Chicken", "Bacon"));
        ArrayList<String> cheeseInStock = new ArrayList<>(Arrays.asList("American", "Provolone", "Cheddar", "Swiss"));
        ArrayList<String> ToppingsInStock = new ArrayList<>(Arrays.asList("Lettuce", "Peppers", "Onions", "Tomatoes", "Jalapenos", "Cucumbers", "Pickles", "Guacamole", "Mushrooms"));
        ArrayList<String> saucesInStock = new ArrayList<>(Arrays.asList("Mustard", "Ketchup", "Mayonnaise", "Chipotle", "BBQ"));

        boolean extraMeat = false;
        boolean extraCheese = false;
        boolean isToasted = false;

        boolean exit = false;
        String breadType = "";
        while (!exit) {
            System.out.print("Select your bread (White, Wheat, Rye, Wrap): ");
            breadType = scanner.nextLine().toLowerCase();
            switch (breadType) {
                case "white", "wheat", "rye", "wrap":
                    exit = true;
                    break;
                default:
                    System.out.println("Incorrect entry, try again");
                    break;
            }
        }

        boolean exit2 = false;
        int sandwichSize = 0;
        while (!exit2) {
            System.out.print("Sandwich size (4, 8, 12): ");
            sandwichSize = scanner.nextInt();
            scanner.nextLine();
            switch (sandwichSize) {
                case 4, 8, 12:
                    exit2 = true;
                    break;
                default:
                    System.out.println("Incorrect entry, try again");
                    break;
            }
        }

        boolean exit3 = false;
        ArrayList<String> proteinToSandwich = new ArrayList<>();
        while (!exit3) {
            System.out.println("What protein would you like? (X when done selection):");
            for (String s : proteinInStock) {
                System.out.println(s);
            }
            System.out.println();
            String meat = scanner.nextLine();
            if (meat.equalsIgnoreCase("x")){
                exit3 = true;
            } else {
                for (String s : proteinInStock) {
                    if (meat.equalsIgnoreCase(s)) {
                        proteinToSandwich.add(s);
                        proteinInStock.remove(s);
                        break;
                    }
                }
            }
        }
            System.out.println("Would you Like extra protein in your sandwich?(y/n):");
            String extraMeatTopping = scanner.nextLine();
            if (extraMeatTopping.equalsIgnoreCase("y")) {
                extraMeat = true;
            }

        boolean exit5 = false;
        ArrayList<String> cheeseToSandwich = new ArrayList<>();
        while (!exit5) {
            System.out.println("What kind of cheese would you like? (x when done with selection):");
            for (String s5 : cheeseInStock) {
                System.out.println(s5);
            }
            System.out.println();
            String cheese = scanner.nextLine();
            if (cheese.equalsIgnoreCase("x")) {
                exit5 = true;
            } else {
                for (String s5 : cheeseInStock) {
                    if (cheese.equalsIgnoreCase(s5)) {
                        cheeseToSandwich.add(s5);
                        cheeseInStock.remove(s5);
                        break;
                    }
                }
            }
        }

        boolean exit6 = false;
        System.out.println("Would you like Extra cheese?(y/n):");
        String extraCheeseTopping = scanner.nextLine();
        if (extraCheeseTopping.equalsIgnoreCase("y")) {
            extraCheese = true;
        }


        boolean exit7 = false;
        ArrayList<String> ToppingsToSandwich = new ArrayList<>();
        while (!exit7) {
            System.out.println("What other toppings would you like? (x when done with selection):");
            for (String s7 : ToppingsInStock) {
                System.out.println(s7);
            }
            System.out.println();
            String basicToppings = scanner.nextLine();
            if (basicToppings.equalsIgnoreCase("x")) {
                exit7 = true;
            } else {
                for (String s7 : ToppingsInStock) {
                    if (basicToppings.equalsIgnoreCase(s7)) {
                        ToppingsToSandwich.add(s7);
                        ToppingsInStock.remove(s7);
                        break;
                    }
                }
            }
        }

        boolean exit8 = false;
        while (!exit8) {
            System.out.println("Would you like any sauce with your order?:");
            for (String s8 : saucesInStock) {
                System.out.println(s8);
            }
            String sauces = scanner.nextLine();
            System.out.println("What other Sauces would you like? (x when done with selection):");
            if (sauces.equalsIgnoreCase("x")) {
                exit8 = true;
            } else {
                for (String s8 : saucesInStock) {
                    if (sauces.equalsIgnoreCase(s8)) {
                        ToppingsInStock.add(s8);
                        saucesInStock.remove(s8);
                        break;
                    }
                }
            }
        }

        boolean exit9 = false;
        System.out.print("Would you like your sandwich toasted? (Y/N): ");
        String toastedOption = scanner.nextLine();
        if (toastedOption.equalsIgnoreCase("y")) {
            isToasted = true;
        }

        Sandwich sandwich = new Sandwich(breadType,sandwichSize,isToasted,proteinToSandwich,extraMeat,cheeseToSandwich,extraCheese,ToppingsToSandwich);
        order.addSandwich(sandwich);
    }


    private void addDrink(Scanner scanner) {
        boolean exit = false;
        String drinkSize = "";
        String drinkType = "";
        System.out.println("=============Drinks=============");
        System.out.println("\t1. Coke");
        System.out.println("\t2. Sprite");
        System.out.println("\t3. Fruit Punch");
        System.out.println("\t4. Fanta");
        System.out.println("\t5. Ginger Ale");
        System.out.println("\t6. Root Beer");
        System.out.println("\t0. Return to main menu");
        System.out.print("What kind of drink would you like: ");
        int selection = scanner.nextInt();
        scanner.nextLine();
        switch (selection) {
            case 1: // Coke
                drinkType = "Coke";
                System.out.print("Enter size(S,M,L): ");
                drinkSize = scanner.nextLine();
                drinkSize(drinkType, drinkSize);
                break;
            case 2: // Sprite
                drinkType = "Sprite";
                System.out.print("Enter size(S,M,L): ");
                drinkSize = scanner.nextLine();
                drinkSize(drinkType, drinkSize);
                break;
            case 3: // Fruit Punch
                drinkType = "Fruit Punch";
                System.out.print("Enter size(S,M,L): ");
                drinkSize = scanner.nextLine();
                drinkSize(drinkType, drinkSize);
                break;
            case 4: // Fanta
                drinkType = "Fanta";
                System.out.print("Enter size(S,M,L): ");
                drinkSize = scanner.nextLine();
                drinkSize(drinkType, drinkSize);
                break;
            case 5: // Ginger Ale
                drinkType = "Ginger Ale";
                System.out.print("Enter size(S,M,L): ");
                drinkSize = scanner.nextLine();
                drinkSize(drinkType, drinkSize);
                break;
            case 6: // Root Beer
                drinkType = "Root Beer";
                System.out.print("Enter size(S,M,L): ");
                drinkSize = scanner.nextLine();
                drinkSize(drinkType, drinkSize);
                break;
            case 0:
                System.out.println("Returning to main menu");
                break;
            default:
                System.out.println("Incorrect input");
                break;
        }

    }

    private void drinkSize(String drinkType, String drinkSize) {
        if (drinkSize.equalsIgnoreCase("s")) {
            Drink drink = new Drink(drinkType, drinkSize);
            order.addDrinks(drink);
            System.out.println("Added to cart");
        } else if (drinkSize.equalsIgnoreCase("m")) {
            Drink drink = new Drink(drinkType, drinkSize);
            order.addDrinks(drink);
            System.out.println("Added to cart");
        } else if (drinkSize.equalsIgnoreCase("l")) {
            Drink drink = new Drink(drinkType, drinkSize);
            order.addDrinks(drink);
            System.out.println("Added to cart");
        } else {
            System.out.println("Incorrect Input");

        }
    }

    private void addChips(Scanner scanner) {
        String chipType = "";

        boolean exit = false;
        while (!exit) {
            System.out.println("=============Chips=============");
            System.out.println("\t1. Lay's Potato Chips");
            System.out.println("\t2. Tortilla Chips");
            System.out.println("\t3. Lay's BBQ Chips");
            System.out.println("\t4. Salt & Vinegar Chips");
            System.out.println("\t5. Cheetos");
            System.out.println("\t6. Doritos");
            System.out.println("\t0. Return to main menu");
            System.out.print("What kind of chips would you like: ");
            int selection = scanner.nextInt();
            switch (selection) {
                case 1: // Lay's Potato Chips
                    chipType = "Lay's Potato Chips";
                    System.out.println("Added to cart");
                    exit = true;
                    break;
                case 2: // Tortilla Chips
                    chipType = "Tortilla Chips";
                    System.out.println("Added to cart");
                    exit = true;
                    break;
                case 3: // Lay's BBQ Chips
                    chipType = "Lay's BBQ Chips";
                    System.out.println("Added to cart");
                    exit = true;
                    break;
                case 4: // Salt & Vinegar Chips
                    chipType = "Salt & Vinegar Chips";
                    System.out.println("Added to cart");
                    exit = true;
                    break;
                case 5: // Cheetos
                    chipType = "Cheetos";
                    System.out.println("Added to cart");
                    exit = true;
                    break;
                case 6: // Doritos
                    chipType = "Doritos";
                    System.out.println("Added to cart");
                    exit = true;
                    break;
                case 0:
                    System.out.println("Returning to main menu");
                    exit = true;
                    break;
                default:
                    System.out.println("Incorrect input");
                    break;

            }
            Chips chip = new Chips(chipType);
            order.addChips(chip);
        }
    }
}