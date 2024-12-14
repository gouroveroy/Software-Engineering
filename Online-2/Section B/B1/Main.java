import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // double basePrice = 12000; // Initial price of the product
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base price of the product: ");
        double basePrice = scanner.nextDouble();

        // Check and apply discounts
        System.out.print("Is the customer a premium member? (yes/no): ");
        String isPremium = scanner.next();

        System.out.print("Is it a seasonal promotion? (yes/no): ");
        String isSeasonal = scanner.next();

        // Create a base purchase
        Purchase purchase = new BasePurchase(basePrice);

        // Wrap the base purchase with discounts conditionally
        if (isPremium.equalsIgnoreCase("yes")) {
            purchase = new Loyalty(purchase);
        }

        if (isSeasonal.equalsIgnoreCase("yes")) {
            purchase = new Seasonal(purchase);
        }

        // Apply discounts conditionally
        Purchase discountedPurchase = new HighValuePurchase(purchase);
        // Calculate final price after all applicable discounts
        double finalPrice = discountedPurchase.calculatePrice();
        System.out.println("Final price after all discounts: " + finalPrice);
        scanner.close();
    }
}
