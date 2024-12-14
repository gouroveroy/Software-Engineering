import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the payment method (credit card, cryptocurrency, or PayPal):");
        String paymentMethod = scanner.nextLine();
        PaymentFactory paymentFactory = new PaymentFactory();
        PaymentMethod payment = paymentFactory.getPaymentMethod(paymentMethod);
        if (payment == null) {
            System.out.println("Invalid payment method.");
        } else {
            System.out.println(payment.processPayment());
        }
        scanner.close();
    }
}
