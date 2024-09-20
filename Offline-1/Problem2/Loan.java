public interface Loan {
    double calculateSimpleInterest(double amount, int timePeriod);
    double calculateCompoundInterest(double amount, int timePeriod, int compoundedPerYear);
}
