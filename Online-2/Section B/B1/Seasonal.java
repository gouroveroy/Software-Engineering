public class Seasonal extends Discount {
    public Seasonal(Purchase purchase) {
        super(purchase);
    }

    public double getPrice() {
        return super.calculatePrice() > 100 ? super.calculatePrice() - 100 : super.calculatePrice();
    }
}
