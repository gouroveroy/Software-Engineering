public abstract class Account {
    protected double interestRate;
    protected String accountType;

    private double totalSimpleInterest;
    private double totalCompoundInterest;

    abstract void setInterestRate();

    abstract void setAccountType();

    public void calculateSimpleInterest(double amount, int timePeriod) {
        totalSimpleInterest = (amount * interestRate * timePeriod) / 100;
    }

    public void calculateCompoundInterest(double amount, int timePeriod, int compoundedPerYear) {
        totalCompoundInterest = amount
                * Math.pow(1 + interestRate / (compoundedPerYear * 100), compoundedPerYear * timePeriod) - amount;
    }

    public String showSimpleInterest() {
        return "The simple interest for " + accountType + " account is " + totalSimpleInterest;
    }

    public String showCompoundInterest() {
        return "The compound interest for " + accountType + " account is " + totalCompoundInterest;
    }
}
