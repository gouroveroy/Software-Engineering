public class RegularCustomerFactory implements CustomerFactory {
    @Override
    public Account createAccount() {
        return new RegularAccount();
    }

    @Override
    public Loan createLoan() {
        return new RegularLoan();
    }
}
