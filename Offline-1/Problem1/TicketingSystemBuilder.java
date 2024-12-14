import java.util.ArrayList;

public class TicketingSystemBuilder implements Builder {
    private MicroController microController;
    private Display display;
    private Identification identification;
    private PaymentTerminal paymentTerminal;
    private Internet internet;
    private Storage storage;
    private Controller controller;
    private WebServer framework;
    ArrayList<String> system = new ArrayList<>();

    @Override
    public TicketingSystemBuilder addMicroController(MicroController microController) {
        this.microController = microController;
        return this;
    }

    @Override
    public TicketingSystemBuilder addDisplay(Display display) {
        this.display = display;
        return this;
    }

    @Override
    public TicketingSystemBuilder addIdentification(Identification identification) {
        this.identification = identification;
        return this;
    }

    @Override
    public TicketingSystemBuilder addPaymentTerminal(PaymentTerminal paymentTerminal) {
        this.paymentTerminal = paymentTerminal;
        return this;
    }

    @Override
    public TicketingSystemBuilder addInternet(Internet internet) {
        this.internet = internet;
        return this;
    }

    @Override
    public TicketingSystemBuilder addStorage(Storage storage) {
        this.storage = storage;
        return this;
    }

    @Override
    public TicketingSystemBuilder addController(Controller controller) {
        this.controller = controller;
        return this;
    }

    @Override
    public TicketingSystemBuilder addFrameWork(WebServer framework) {
        this.framework = framework;
        return this;
    }

    @Override
    public ArrayList<String> build() {
        system.add(microController.addMicroController());

        system.add(display.addDisplay());

        system.add(identification.addTicketingSystem());

        system.add(paymentTerminal.addPaymentTerminal());

        system.add(internet.addInternetConnection());

        system.add(storage.addStorage());

        system.add(controller.addController());

        system.add(framework.addFrameWork());

        return system;
    }
}
