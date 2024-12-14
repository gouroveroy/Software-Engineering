import java.util.ArrayList;

public class TicketingSystemDirector {
    private Builder builder;

    public TicketingSystemDirector(Builder builder) {
        this.builder = builder;
    }

    public ArrayList<String> buildTicketingSystem(String packageType, String internetOption, String frameWorkOption) {
        switch (packageType) {
            case "Basic":
                return basic(internetOption, frameWorkOption);

            case "Standard":
                return standard(internetOption, frameWorkOption);

            case "Advanced":
                return advanced(internetOption, frameWorkOption);

            case "Premium":
                return premium(internetOption, frameWorkOption);

            default:
                return null;
        }
    }

    public ArrayList<String> basic(String internetOption, String frameWorkOption) {
        MicroController microController = PackageFactory.createMicroController("ATMega32");
        Display display = PackageFactory.createDisplay("LCD");
        Identification identification = PackageFactory.createIdentification("RFID");
        PaymentTerminal paymentTerminal = PackageFactory.createPaymentTerminal("Cash");
        Internet internet = InternetFactory.createInternet(internetOption);
        Storage storage = PackageFactory.createStorage("SDcard");
        Controller controller = PackageFactory.createController("Separate");
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

    public ArrayList<String> standard(String internetOption, String frameWorkOption) {
        MicroController microController = PackageFactory.createMicroController("Arduino");
        Display display = PackageFactory.createDisplay("LED");
        Identification identification = PackageFactory.createIdentification("RFID");
        PaymentTerminal paymentTerminal = PackageFactory.createPaymentTerminal("Cash");
        Internet internet = InternetFactory.createInternet(internetOption);
        Storage storage = PackageFactory.createStorage("SDcard");
        Controller controller = PackageFactory.createController("Separate");
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

    public ArrayList<String> advanced(String internetOption, String frameWorkOption) {
        MicroController microController = PackageFactory.createMicroController("RaspberryPi");
        Display display = PackageFactory.createDisplay("OLED");
        Identification identification = PackageFactory.createIdentification("NFC");
        PaymentTerminal paymentTerminal = PackageFactory.createPaymentTerminal("Cash");
        Internet internet = InternetFactory.createInternet(internetOption);
        Storage storage = PackageFactory.createStorage("OnBoard");
        Controller controller = PackageFactory.createController("TouchScreen");
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

    public ArrayList<String> premium(String internetOption, String frameWorkOption) {
        MicroController microController = PackageFactory.createMicroController("RaspberryPi");
        Display display = PackageFactory.createDisplay("TouchScreen");
        Identification identification = PackageFactory.createIdentification("NFC");
        PaymentTerminal paymentTerminal = PackageFactory.createPaymentTerminal("Cash");
        Internet internet = InternetFactory.createInternet(internetOption);
        Storage storage = PackageFactory.createStorage("OnBoard");
        Controller controller = PackageFactory.createController("TouchScreen");
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
