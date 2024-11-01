import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import Composite.*;
import Decorator.*;

public class KhaidaiBistro {
    private static List<Menu> menu = new ArrayList<>();

    private static void displayCommands() {
        System.out.println("Available commands:");
        System.out.println("\033[1mAdd\033[0m [item]");
        System.out.println("\033[1mRemove\033[0m [item]");
        System.out.println("\033[1mFree\033[0m [item]");
        System.out.println("\033[1mDiscount\033[0m [percentage]");
        System.out.println("\033[1mDone\033[0m");
    }

    private static Menu findMenuItemByName(String name) {
        for (Menu item : menu) {
            if (item.getName().split("\\s*\\(")[0].equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }

    public static void createCombo(Scanner scanner) {
        System.out.println("Enter the name of the combo:");
        String name = scanner.nextLine();
        Menu combo = new Combo(name, 0);
        displayCommands();

        boolean condition = true;
        while (condition) {
            String command = scanner.nextLine();
            String[] tokens = command.split(" ", 2);
            Menu item = tokens.length > 1 ? findMenuItemByName(tokens[1]) : null;

            switch (tokens[0]) {
                case "Add":
                    if (item != null)
                        combo.add(item);
                    break;

                case "Remove":
                    if (item != null)
                        combo.remove(item);
                    break;

                case "Free":
                    if (item != null)
                        combo = new FreeItemDecorator(combo, item);
                    break;

                case "Discount":
                    combo.setDiscountPercentage(Float.parseFloat(tokens[1]));
                    break;

                case "Done":
                    condition = false;
                    break;

                default:
                    System.out.println("Invalid command");
            }
        }
        System.out.println("Your combo:\n\n" + name);
        combo.print();
        menu.add(combo);
    }

    public static void viewMenu() {
        System.out.println("\033[1mMenu\033[0m:\n");
        for (Menu item : menu) {
            System.out.println(item.getName() + " - " + item.getPrice() + "tk");
        }
    }

    public static void main(String[] args) {
        Menu Burger = new Item("Burger", 300);
        Menu Fries = new Item("Fries", 100);
        Menu Wedges = new Item("Wedges", 150);
        Menu Shawarma = new Item("Shawarma", 200);
        Menu Drink = new Item("Drink", 25);

        Menu Combo1 = new Combo("Combo1", 400);
        Combo1.add(Burger);
        Combo1.add(Fries);
        Combo1.add(Drink);

        Menu Combo2 = new Combo("Combo2", 215);
        Combo2.add(Shawarma);
        Combo2.add(Drink);

        menu.addAll(List.of(Burger, Fries, Wedges, Shawarma, Drink, Combo1, Combo2));

        try (Scanner scanner = new Scanner(System.in)) {
            viewMenu();
            boolean condition = true;
            while (condition) {
                System.out.println("\nPress 1 to create a combo, 2 to view menu, and 0 to exit");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 0:
                        condition = false;
                        break;

                    case 1:
                        createCombo(scanner);
                        break;

                    case 2:
                        viewMenu();
                        break;

                    default:
                        System.out.println("Invalid choice");
                }
            }
        }
    }
}
