import java.util.Scanner;

public class BankSystem {
    public static String getCustomerType(int option) {
        switch (option) {
            case 1:
                return "Regular";

            case 2:
                return "Premium";

            case 3:
                return "VIP";

            default:
                return null;
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the type of customer: ");
            System.out.println("1. Regular");
            System.out.println("2. Premium");
            System.out.println("3. VIP");
            int option = scanner.nextInt();
            String customerType = getCustomerType(option);

            AbstractFactory factory = FactoryProducer.getFactory(customerType);
            if (factory == null) {
                System.out.println("Invalid customer type");
                return;
            }

            Account account = factory.createAccount();
            Loan loan = factory.createLoan();

            account.setInterestRate();
            account.setAccountType();
            account.calculateSimpleInterest(10000, 2);
            System.out.println(account.showSimpleInterest());
            account.calculateCompoundInterest(10000, 2, 2);
            System.out.println(account.showCompoundInterest());

            loan.setInterestRate();
            loan.setLoanType();
            loan.calculateSimpleInterest(10000, 2);
            System.out.println(loan.showSimpleInterest());
            loan.calculateCompoundInterest(10000, 2, 2);
            System.out.println(loan.showCompoundInterest());
        }
    }
}
