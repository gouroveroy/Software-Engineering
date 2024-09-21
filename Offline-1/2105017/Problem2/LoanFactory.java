public class LoanFactory implements AbstractFactory {
    @Override
    public Account getAccount(String accountType) {
        return null;
    }

    @Override
    public Loan getLoan(String loanType) {
        if (loanType == null) {
            return null;
        }
        
        switch (loanType) {
            case "Regular":
                return new RegularLoan();

            case "Premium":
                return new PremiumLoan();

            case "VIP":
                return new VIPLoan();
        
            default:
                return null;
        }
    }
}
