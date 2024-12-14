import java.util.Scanner;

import Builder.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the type of meal you want (Bengali/Chinese):");
        String mealType = scanner.nextLine();
        IBuilder builder = null;
        if (mealType.equalsIgnoreCase("Bengali")) {
            builder = new Bengali();
        } else if (mealType.equalsIgnoreCase("Chinese")) {
            builder = new Chinese();
        } else {
            System.out.println("Invalid meal type");
            System.exit(0);
        }
        Director director = new Director(builder);
        System.out.println(director.construct());
        scanner.close();
    }
}
