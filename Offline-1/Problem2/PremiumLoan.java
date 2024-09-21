public class PremiumLoan extends Loan {
    @Override
    public void setInterestRate() {
        interestRate = 12.0;
    }

    @Override
    public void setLoanType() {
        loanType = "Premium";
    }
}
