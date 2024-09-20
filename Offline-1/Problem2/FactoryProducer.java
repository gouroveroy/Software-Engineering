public class FactoryProducer {
    public static CustomerFactory getFactory(String customerType) {
        switch (customerType) {
            case "Regular":
                return new RegularCustomerFactory();

            case "Premium":
                return new PremiumCustomerFactory();

            case "VIP":
                return new VIPCustomerFactory();
        
            default:
                return null;
        }
    }
}
