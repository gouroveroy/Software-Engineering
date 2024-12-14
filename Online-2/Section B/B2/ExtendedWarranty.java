public class ExtendedWarranty extends FeatureDecorator {
    private final double warrantyPrice;

    public ExtendedWarranty(Component component, double warrantyPrice) {
        super(component);
        this.warrantyPrice = warrantyPrice;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + warrantyPrice;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Extended Warranty";
    }
}
