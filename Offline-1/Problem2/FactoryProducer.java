public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryType) {
        if (factoryType == null) {
            return null;
        }

        switch (factoryType) {
            case "Regular":
                return new RegularFactory();

            case "Premium":
                return new PremiumFactory();

            case "VIP":
                return new VIPFactory();

            default:
                return null;
        }
    }
}
