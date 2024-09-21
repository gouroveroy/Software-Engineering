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
        if (microController != null) {
            system.add(microController.addMicroController());
        }

        if (display != null) {
            system.add(display.addDisplay());
        }

        if (identification != null) {
            system.add(identification.addTicketingSystem());
        }

        if (paymentTerminal != null) {
            system.add(paymentTerminal.addPaymentTerminal());
        }

        if (internet != null) {
            system.add(internet.addInternetConnection());
        }

        if (storage != null) {
            system.add(storage.addStorage());
        }

        if (controller != null) {
            system.add(controller.addController());
        }

        if (framework != null) {
            system.add(framework.addFrameWork());
        }

        return system;
    }
}
