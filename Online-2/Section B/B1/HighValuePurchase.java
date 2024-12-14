public class HighValuePurchase extends Discount {
    public HighValuePurchase(Purchase purchase) {
        super(purchase);
    }

    public double calculatePrice() {
        if (super.calculatePrice() > 10000) {
            return super.calculatePrice() * 0.98;
        }
        return super.calculatePrice();
    }
}
