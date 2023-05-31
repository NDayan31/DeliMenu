package com.yearup.deli;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    //ArrayList<Order> orders = new ArrayList<>();


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
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }

    private void checkOut() {

        //Print final price, Create a Receipt File, and go back to the homescreen

        System.out.println("Your Total is " + "$" + Order.getPrice() + "Would You Be Paying Cash or Card");
        String paymentMethod = scanner.next();

        System.out.println("Thank You, Come Again");

    }

    private void cancelOrder() {
        System.out.println("Thank You, Come Again!");
    }

    private void addSandwich(Scanner scanner) {
        boolean isToasted = false;
        boolean running = true;
        while (running) {
            System.out.print("Select your bread (White, Wheat, Rye, Wrap): ");
            String breadType = scanner.nextLine();
            System.out.print("Sandwich size (4\", 8\", 12\"): ");
            int sandwichSize = scanner.nextInt();
            toppings();

            System.out.print("Would you like your sandwich toasted? (Y/N): ");
            String toastedOption = scanner.nextLine();
            if (toastedOption.equalsIgnoreCase("y")) {isToasted = true;}

        }
    }

    private void addDrink(Scanner scanner) {
        boolean exit = false;
        String drinkSize = "";
        String drinkType = "";
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
    }

    private void drinkSize(String drinkType, String drinkSize) {
        if (drinkSize.equalsIgnoreCase("s")) {
            //adds to orders array
            System.out.println("Added to cart");
        } else if (drinkSize.equalsIgnoreCase("m")) {
            //adds to orders array
            System.out.println("Added to cart");
        } else if (drinkSize.equalsIgnoreCase("l")) {
            //adds to orders array
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
                    //adds to orders array
                    break;
                case 2: // Tortilla Chips
                    chipType = "Tortilla Chips";
                    System.out.println("Added to cart");
                    //adds to orders array
                    break;
                case 3: // Lay's BBQ Chips
                    chipType = "Lay's BBQ Chips";
                    System.out.println("Added to cart");
                    //adds to orders array
                    break;
                case 4: // Salt & Vinegar Chips
                    chipType = "Salt & Vinegar Chips";
                    System.out.println("Added to cart");
                    //adds to orders array
                    break;
                case 5: // Cheetos
                    chipType = "Cheetos";
                    System.out.println("Added to cart");
                    //adds to orders array
                    break;
                case 6: // Doritos
                    chipType = "Doritos";
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

    private void toppings() {

        boolean extraMeat = false;
        boolean extraCheese = false;

        boolean running = true;
        while (running) {
            System.out.println("What Protein Would You Like? (Steak, Ham, Salami, RoastBeef, Chicken, Bacon):");
            String meat = scanner.nextLine();

            System.out.println("Would you Like Extra Portion In Your Sandwich?(y/n):");
            String extraMeatTopping = scanner.nextLine();
            boolean extraMeatToppingBoolean = extraMeatTopping.equalsIgnoreCase("y");
            if (extraMeatToppingBoolean){
                extraMeat = true;
            }

            System.out.println("Please Select Your Cheese(American, Provolone, Cheddar, Swiss):");
            String cheese = scanner.nextLine();

            System.out.println("Would you like Extra cheese(y/n):");
            String cheeseOption = scanner.nextLine();
            boolean extraCheeseOption = cheeseOption.equalsIgnoreCase("y");
            if (extraCheeseOption){
                extraCheese = true;
            }

            System.out.println("Please Select From our Free Toppings(Lettuce, Peppers, Onions, Tomatoes, Jalapenos, Cucumbers, Pickles, Guacamole, Mushrooms):");
            String basicToppings = scanner.nextLine();
            System.out.println("Would you Like Any Sauce With your Order");

        }
            //print arraylist
        /*private void diplayOrder() {
            for (Order order : orders) {
                if (order instanceof Sandwich) {*/


                }
            }






