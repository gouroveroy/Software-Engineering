public class CustomerServiceAgent {
    private Mediator serviceMediator;

    public CustomerServiceAgent(Mediator serviceMediator) {
        this.serviceMediator = serviceMediator;
    }

    public void handleInquiry(String inquiry, Department department) {
        serviceMediator.sendMessage(inquiry, department);
    }
}
