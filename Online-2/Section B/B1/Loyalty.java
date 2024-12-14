public class Loyalty extends Discount {
    public Loyalty(Purchase purchase) {
        super(purchase);
    }

    public double calculatePrice() {
        return super.calculatePrice() * 0.9;
    }
}
