package com.yearup.deli;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    ArrayList<Order> orders = new ArrayList<>();




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
        ReceiptFileManager receiptFileManager = new ReceiptFileManager();
        Order order = new Order();
        order.displayCart();
        System.out.println("====================================");
        System.out.println("\t1. Place Your Order");
        System.out.println("\t2. Cancel Your Order");
        System.out.println("\t3. Return to Main Menu");
        System.out.print("What would you like to do?: ");
        int command = scanner.nextInt();
        switch (command) {
            case 1:

                receiptFileManager.createReceipt();
                System.out.println("Thank You for your Order");
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
        Order order = new Order();
        order.clearCart();
        System.out.println("Thank You, Come Again!");
    }

    private void addSandwich(Scanner scanner) {
        boolean extraMeat = false;
        boolean extraCheese = false;
        boolean isToasted = false;
        boolean exit = false;
        while (!exit) {
            System.out.print("Select your bread (White, Wheat, Rye, Wrap): ");
            String breadType = scanner.nextLine().toLowerCase();
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
        while (!exit2) {
            System.out.print("Sandwich size (4\", 8\", 12\"): ");
            int sandwichSize = scanner.nextInt();
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
        String[] proteinInStock = {"Steak", "Ham", "Salami", "RoastBeef", "Chicken", "Bacon"};
        ArrayList<String> proteinToSandwich = new ArrayList<>();
        while (!exit3) {
            System.out.println("What protein would you like? (X when done selection):");
            for (String s : proteinInStock) {
                System.out.print(s + " ");
            }
            String meat = scanner.nextLine();
            for (String s : proteinInStock) {
                if (meat.equalsIgnoreCase(s)) {
                    proteinToSandwich.add(s);
                }
            }

            boolean exit4 = false;
            System.out.println("Would you Like extra protein in your sandwich?(y/n):");
            String extraMeatTopping = scanner.nextLine();
            if (extraMeatTopping.equalsIgnoreCase("y")) {
                extraMeat = true;
            }

            boolean exit5 = false;
            String[] cheeseInStock = {"American", "Provolone", "Cheddar", "Swiss"};
            ArrayList<String> cheeseToSandwich = new ArrayList<>();
            while (!exit5) {
                System.out.println("What kind of cheese would you like? (x when done with selection):");
                for (String s5 : cheeseInStock) {
                    System.out.println(s5 + " ");
                }
                String cheese = scanner.nextLine();
                for (String s5 : proteinInStock) {
                    if (meat.equalsIgnoreCase(s5)) {
                        proteinToSandwich.add(s5);
                    }
                }

                boolean exit6 = false;
                System.out.println("Would you like Extra cheese?(y/n):");
                String extraCheeseTopping = scanner.nextLine();
                if (extraCheeseTopping.equalsIgnoreCase("y")) {
                    extraCheese = true;
                }
            }

            boolean exit7 = false;
            String[] bToppingsInStock = {"Lettuce", "Peppers", "Onions", "Tomatoes", "Jalapenos", "Cucumbers", "Pickles", "Guacamole", "Mushrooms"};
            ArrayList<String> bToppingsToSandwich = new ArrayList<>();
            while (!exit7) {
                System.out.println("What other toppings would you like? (x when done with selection):");
                for (String s7 : bToppingsInStock) {
                    System.out.println(s7 + " ");
                }
                String basicToppings = scanner.nextLine();
                for (String s7 : bToppingsInStock) {
                    if (basicToppings.equalsIgnoreCase(s7)) {
                        proteinToSandwich.add(s7);
                    }
                }
                boolean exit8 = false;
                String[] saucesInStock = {"Mustard", "Ketchup", "Mayonnaise", "Chipotle", "BBQ"};
                ArrayList<String> saucesToSandwich = new ArrayList<>();
                while (!exit8) {
                    System.out.println("Would you like any sauce with your order?:");
                    for (String s8 : saucesInStock) {
                        System.out.println(s8 + " ");
                    }
                   String sauces = scanner.nextLine();
                    for (String s8 : saucesInStock) {
                        if (basicToppings.equalsIgnoreCase(s8)) {
                            saucesToSandwich.add(s8);
                        }
                    }

            boolean exit9 = false;
            System.out.print("Would you like your sandwich toasted? (Y/N): ");
            String toastedOption = scanner.nextLine();
            if (toastedOption.equalsIgnoreCase("y")) {
                isToasted = true;
            }
        }




    private void addDrink(Scanner scanner) {
        boolean exit = false;
        String drinkSize = "";
        String drinkType = "";
        //while (!exit) {
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
        Order order = new Order();
        if (drinkSize.equalsIgnoreCase("s")) {
            Drink drink = new Drink(drinkType,drinkSize);
            order.addDrinks(drink);
            System.out.println("Added to cart");
        } else if (drinkSize.equalsIgnoreCase("m")) {
            Drink drink = new Drink(drinkType,drinkSize);
            order.addDrinks(drink);
            System.out.println("Added to cart");
        } else if (drinkSize.equalsIgnoreCase("l")) {
            Drink drink = new Drink(drinkType,drinkSize);
            order.addDrinks(drink);
            System.out.println("Added to cart");
        } else {
            System.out.println("Incorrect Input");

        }



    private void addChips(Scanner scanner) {
        String chipType = "";
        Order order = new Order();
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





