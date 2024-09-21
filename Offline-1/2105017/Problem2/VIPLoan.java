public class VIPLoan extends Loan {
    @Override
    public void setInterestRate() {
        interestRate = 10.0;
    }

    @Override
    public void setLoanType() {
        loanType = "VIP";
    }
}
