public class PremiumFactory implements AbstractFactory {
    @Override
    public Account createAccount() {
        return new PremiumAccount();
    }

    @Override
    public Loan createLoan() {
        return new PremiumLoan();
    }
}
