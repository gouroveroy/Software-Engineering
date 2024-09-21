import java.util.ArrayList;

public class TicketingSystemDirector {
    private TicketingSystemBuilder builder;

    public TicketingSystemDirector(TicketingSystemBuilder builder) {
        this.builder = builder;
    }

    public ArrayList<String> buildTicketingSystem(String packageType, String internetOption, String frameWorkOption) {
        MicroController microController = PackageFactory.createMicroController(packageType);
        Display display = PackageFactory.createDisplay(packageType);
        Identification identification = PackageFactory.createIdentification(packageType);
        PaymentTerminal paymentTerminal = PackageFactory.createPaymentTerminal(packageType);
        Internet internet = InternetFactory.createInternet(internetOption);
        Storage storage = PackageFactory.createStorage(packageType);
        Controller controller = PackageFactory.createController(packageType);
        WebServer framework = WebServerFactory.createFrameWork(frameWorkOption);

        return builder
                .addMicroController(microController)
                .addDisplay(display)
                .addIdentification(identification)
                .addPaymentTerminal(paymentTerminal)
                .addInternet(internet)
                .addStorage(storage)
                .addController(controller)
                .addFrameWork(framework)
                .build();
    }
}
