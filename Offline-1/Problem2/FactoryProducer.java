public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryType) {
        if (factoryType == null) {
            return null;
        }

        switch (factoryType) {
            case "Account":
                return new AccountFactory();

            case "Loan":
                return new LoanFactory();

            default:
                return null;
        }
    }
}
