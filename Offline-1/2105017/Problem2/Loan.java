public abstract class Loan {
    protected double interestRate;
    protected String loanType;

    private double totalSimpleInterest;
    private double totalCompoundInterest;

    abstract void setInterestRate();

    abstract void setLoanType();

    public void calculateSimpleInterest(double amount, int timePeriod) {
        totalSimpleInterest = (amount * interestRate * timePeriod) / 100;
    }

    public void calculateCompoundInterest(double amount, int timePeriod, int compoundedPerYear) {
        totalCompoundInterest = amount
                * Math.pow(1 + interestRate / (compoundedPerYear * 100), compoundedPerYear * timePeriod) - amount;
    }

    public String showSimpleInterest() {
        return "The simple interest for " + loanType + " loan is " + totalSimpleInterest;
    }

    public String showCompoundInterest() {
        return "The compound interest for " + loanType + " loan is " + totalCompoundInterest;
    }
}
