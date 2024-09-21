public class PremiumAccount extends Account {
    @Override
    public void setInterestRate() {
        interestRate = 3.5;
    }

    @Override
    public void setAccountType() {
        accountType = "Premium";
    }
}
