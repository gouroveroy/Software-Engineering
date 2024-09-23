public class RegularFactory implements AbstractFactory {
    @Override
    public Account createAccount() {
        return new RegularAccount();
    }

    @Override
    public Loan createLoan() {
        return new RegularLoan();
    }
}
