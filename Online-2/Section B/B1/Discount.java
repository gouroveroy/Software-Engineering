public abstract class Discount implements Purchase {
    private Purchase purchase;

    public Discount(Purchase purchase) {
        this.purchase = purchase;
    }

    public double calculatePrice() {
        return purchase.calculatePrice();
    }
}
