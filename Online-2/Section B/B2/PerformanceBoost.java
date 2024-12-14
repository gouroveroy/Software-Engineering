public class PerformanceBoost extends FeatureDecorator {
    private final double boostPrice;

    public PerformanceBoost(Component component, double boostPrice) {
        super(component);
        this.boostPrice = boostPrice;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + boostPrice;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Performance Boost";
    }
}
