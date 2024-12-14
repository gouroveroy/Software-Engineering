// Context Class
class Order {
    private OrderState state;

    public Order() {
        // Initial state
        this.state = new PlacedState();
    }
    
    public void setState(OrderState state) {
        this.state = state;
    }

    public void next() {
        state.next(this);
    }
    
    public void cancel() {
        state.cancel(this);
    }
    
    public void printStatus() {
        state.printStatus();
    }
}
// State Interface
interface OrderState {
    void next(Order order); // Transition to the next state

    void cancel(Order order); // Transition to the cancelled state

    void printStatus(); // Print the current state
}

// Concrete State: Placed
class PlacedState implements OrderState {
    @Override
    public void next(Order order) {
        order.setState(new ConfirmedState());
        System.out.println("Order has been confirmed.");
    }

    @Override
    public void cancel(Order order) {
        order.setState(new CancelledState());
        System.out.println("Order has been cancelled.");
    }

    @Override
    public void printStatus() {
        System.out.println("Order is in the 'Placed' state.");
    }
}

// Concrete State: Confirmed
class ConfirmedState implements OrderState {
    @Override
    public void next(Order order) {
        order.setState(new ShippedState());
        System.out.println("Order has been shipped.");
    }

    @Override
    public void cancel(Order order) {
        order.setState(new CancelledState());
        System.out.println("Order has been cancelled.");
    }

    @Override
    public void printStatus() {
        System.out.println("Order is in the 'Confirmed' state.");
    }
}

// Concrete State: Shipped
class ShippedState implements OrderState {
    @Override
    public void next(Order order) {
        order.setState(new DeliveredState());
        System.out.println("Order has been delivered.");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Cannot cancel. Order has already been shipped.");
    }

    @Override
    public void printStatus() {
        System.out.println("Order is in the 'Shipped' state.");
    }
}

// Concrete State: Delivered
class DeliveredState implements OrderState {
    @Override
    public void next(Order order) {
        System.out.println("Order is already delivered. No further transitions allowed.");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Cannot cancel. Order has already been delivered.");
    }

    @Override
    public void printStatus() {
        System.out.println("Order is in the 'Delivered' state.");
    }
}

// Concrete State: Cancelled
class CancelledState implements OrderState {
    @Override
    public void next(Order order) {
        System.out.println("Cannot proceed. Order has been cancelled.");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Order is already cancelled.");
    }

    @Override
    public void printStatus() {
        System.out.println("Order is in the 'Cancelled' state.");
    }
}

// Driver Code
public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        // Initial state
        order.printStatus();

        // Transition to confirmed
        order.next();
        order.printStatus();

        // Transition to shipped
        order.next();
        order.printStatus();

        // Attempt cancellation after shipping
        order.cancel();

        // Transition to delivered
        order.next();
        order.printStatus();

        // Attempt further transition
        order.next();

        // Cancel the delivered order (invalid)
        order.cancel();
    }
}
