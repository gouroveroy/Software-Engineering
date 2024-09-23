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

    public TicketingSystemBuilder addMicroController(MicroController microController) {
        this.microController = microController;
        return this;
    }

    public TicketingSystemBuilder addDisplay(Display display) {
        this.display = display;
        return this;
    }

    public TicketingSystemBuilder addIdentification(Identification identification) {
        this.identification = identification;
        return this;
    }

    public TicketingSystemBuilder addPaymentTerminal(PaymentTerminal paymentTerminal) {
        this.paymentTerminal = paymentTerminal;
        return this;
    }

    public TicketingSystemBuilder addInternet(Internet internet) {
        this.internet = internet;
        return this;
    }

    public TicketingSystemBuilder addStorage(Storage storage) {
        this.storage = storage;
        return this;
    }

    public TicketingSystemBuilder addController(Controller controller) {
        this.controller = controller;
        return this;
    }

    public TicketingSystemBuilder addFrameWork(WebServer framework) {
        this.framework = framework;
        return this;
    }

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
