public abstract class FeatureDecorator implements Component {
    private Component component;

    public FeatureDecorator(Component component) {
        this.component = component;
    }

    @Override
    public double getPrice() {
        return component.getPrice();
    }

    @Override
    public String getDescription() {
        return component.getDescription();
    }
}
