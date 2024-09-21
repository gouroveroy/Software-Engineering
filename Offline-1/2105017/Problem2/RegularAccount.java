public class RegularAccount extends Account {
    @Override
    void setInterestRate() {
        interestRate = 2.5;
    }

    @Override
    void setAccountType() {
        accountType = "Regular";
    }
}
