public class VIPFactory implements AbstractFactory {
    @Override
    public Account createAccount() {
        return new VIPAccount();
    }

    @Override
    public Loan createLoan() {
        return new VIPLoan();
    }
}
