import java.util.Scanner;

class Context {
    Strategy strategy;

    Context(Strategy strategy) {
        this.strategy = strategy;
    }

    void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    void payment() {
        strategy.paymentMethod();
    }
}

interface Strategy {
    void paymentMethod();
}

class CreditMethod implements Strategy {
    @Override
    public void paymentMethod() {
        System.out.println("Credit card payment method is activated.");
    }
}

class BkashMethod implements Strategy {
    @Override
    public void paymentMethod() {
        System.out.println("Bkash payment method is activated.");
    }
}

class CryptoMethod implements Strategy {
    @Override
    public void paymentMethod() {
        System.out.println("Crypto payment method is activated.");
    }
}

public class Main {
    public static void main(String[] args) {
        Strategy strategy;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your payment method");
        String paymentMethod = scanner.nextLine();
        if (paymentMethod.equalsIgnoreCase("credit")) {
            strategy = new CreditMethod();
        }
        else if (paymentMethod.equalsIgnoreCase("bkash")) {
            strategy = new BkashMethod();
        }
        else {
            strategy = new CryptoMethod();
        }

        Context ctx = new Context(strategy);

        ctx.payment();
        scanner.close();
    }
}
