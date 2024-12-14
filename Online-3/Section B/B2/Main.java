public class Main {
    public static void main(String[] args) {
        // Create the mediator
        Mediator mediator = new CustomerServiceMediator();

        // Create the departments
        Department inventory = new Inventory();
        Department billing = new Billing();
        Department shipping = new Shipping();

        // Register departments
        mediator.addDepartment(inventory);
        mediator.addDepartment(billing);
        mediator.addDepartment(shipping);

        // Create a customer service agent
        CustomerServiceAgent agent = new CustomerServiceAgent(mediator);

        // Agent handles inquiries
        agent.handleInquiry("Check product stock", inventory);
        agent.handleInquiry("Issue a refund", billing);
        agent.handleInquiry("Track my order", shipping);
    }
}
