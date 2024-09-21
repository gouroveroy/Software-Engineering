public class RegularLoan extends Loan {
    @Override
    public void setInterestRate() {
        interestRate = 14.0;
    }

    @Override
    public void setLoanType() {
        loanType = "Regular";
    }
}
