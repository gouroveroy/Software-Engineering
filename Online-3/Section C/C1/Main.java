public class Main {
    public static void main(String[] args) {
        // Create stocks
        Stock googleStock = new Stock("Google", 1500);
        Stock appleStock = new Stock("Apple", 1200);
        // Create users
        User user1 = new User("Alice");
        User user2 = new User("Bob");
        // Code for following stocks
        googleStock.addObserver(user1);
        googleStock.addObserver(user2);

        appleStock.addObserver(user1);
        // Simulate price changes
        System.out.println("Updating Google stock price...");
        googleStock.setPrice(1550);
        System.out.println("\nUpdating Apple stock price...");
        appleStock.setPrice(1250);
        googleStock.removeObserver(user1);
        System.out.println("\nUpdating Google stock price again...");
        googleStock.setPrice(1600);
    }
}
