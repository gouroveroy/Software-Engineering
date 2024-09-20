public class RegularAccount implements Account {
    private double interest = 2.5;

    @Override
    public double calculateSimpleInterest(double amount, int timePeriod) {
        return (amount * interest * timePeriod) / 100;
    }

    @Override
    public double calculateCompoundInterest(double amount, int timePeriod, int compoundedPerYear) {
        return amount * Math.pow(1 + interest / (compoundedPerYear * 100), compoundedPerYear * timePeriod) - amount;
    } 
}
