public class PremiumCustomerFactory implements CustomerFactory {
    @Override
    public Account createAccount() {
        return new PremiumAccount();
    }

    @Override
    public Loan createLoan() {
        return new PremiumLoan();
    }
}
