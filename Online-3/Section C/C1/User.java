public class User implements Observer {
    String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println(name + " has been notified: The price of " + stockName + " is now " + price);
    }
}
