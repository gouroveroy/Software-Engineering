public class AccountFactory implements AbstractFactory {
    @Override
    public Account getAccount(String accountType) {
        if (accountType == null) {
            return null;
        }

        switch (accountType) {
            case "Regular":
                return new RegularAccount();

            case "Premium":
                return new PremiumAccount();

            case "VIP":
                return new VIPAccount();

            default:
                return null;
        }
    }

    @Override
    public Loan getLoan(String loanType) {
        return null;
    }
}
