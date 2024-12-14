import java.util.Scanner;

import AFactory.*;

public class ComputerSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the type of computer you want to buy: ");
        String type = scanner.nextLine();
        ComputerFactory computerFactory = null;
        Computer computer = null;
        if (type.equalsIgnoreCase("WorkPro")) {
            computerFactory = new WorkPro();
            computer = new Computer("WorkPro", computerFactory.getProcessor(), computerFactory.getDisplay());
        } else if (type.equalsIgnoreCase("LiteMax")) {
            computerFactory = new LiteMax();
            computer = new Computer("LiteMax", computerFactory.getProcessor(), computerFactory.getDisplay());
        } else {
            System.out.println("Invalid computer type");
            System.exit(0);
        }
        computer.printDescription();
        scanner.close();
    }
}
