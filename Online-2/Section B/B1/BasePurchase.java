public class BasePurchase implements Purchase {
    private double price;

    public BasePurchase(double price) {
        this.price = price;
    }

    public double calculatePrice() {
        return price;
    }
}
