public interface AbstractFactory {
    Account getAccount(String accountType);
    Loan getLoan(String loanType);
}
