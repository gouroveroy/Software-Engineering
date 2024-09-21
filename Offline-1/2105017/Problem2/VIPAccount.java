public class VIPAccount extends Account {
    @Override
    public void setInterestRate() {
        interestRate = 5.0;
    }

    @Override
    public void setAccountType() {
        accountType = "VIP";
    }
}
