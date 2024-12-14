public class PaymentFactory {
    public PaymentMethod getPaymentMethod(String paymentMethod) {
        if (paymentMethod == null) {
            return null;
        }
        if (paymentMethod.equalsIgnoreCase("CREDITCARD")) {
            return new CreditCard();
        } else if (paymentMethod.equalsIgnoreCase("CRYPTOCURRENCY")) {
            return new CryptoCurrency();
        } else if (paymentMethod.equalsIgnoreCase("PAYPAL")) {
            return new PayPal();
        }
        return null;
    }
}
