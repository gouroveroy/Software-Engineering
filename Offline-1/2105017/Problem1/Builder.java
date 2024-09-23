public interface Builder {
    public TicketingSystemBuilder addMicroController(MicroController microController);

    public TicketingSystemBuilder addDisplay(Display display);

    public TicketingSystemBuilder addIdentification(Identification identification);

    public TicketingSystemBuilder addPaymentTerminal(PaymentTerminal paymentTerminal);

    public TicketingSystemBuilder addInternet(Internet internet);

    public TicketingSystemBuilder addStorage(Storage storage);

    public TicketingSystemBuilder addController(Controller controller);

    public TicketingSystemBuilder addFrameWork(WebServer frameWork);
}
