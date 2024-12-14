public class InstallationService extends FeatureDecorator {
    private final double installationPrice;

    public InstallationService(Component component, double installationPrice) {
        super(component);
        this.installationPrice = installationPrice;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + installationPrice;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Installation Service";
    }
}
