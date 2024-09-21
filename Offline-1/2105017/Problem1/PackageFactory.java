public class PackageFactory {
    public static MicroController createMicroController(String packageType) {
        switch (packageType) {
            case "Basic":
                return new ATMega32();

            case "Standard":
                return new Arduino();

            case "Advanced":
                return new RaspBerryPi();

            case "Premium":
                return new RaspBerryPi();

            default:
                return null;
        }
    }

    public static Display createDisplay(String packageType) {
        switch (packageType) {
            case "Basic":
                return new LCD();

            case "Standard":
                return new LED();

            case "Advanced":
                return new OLED();

            case "Premium":
                return new TouchScreen();

            default:
                return null;
        }
    }

    public static Identification createIdentification(String packageType) {
        switch (packageType) {
            case "Basic":
                return new RFID();

            case "Standard":
                return new RFID();

            case "Advanced":
                return new NFC();

            case "Premium":
                return new NFC();

            default:
                return null;
        }
    }

    public static PaymentTerminal createPaymentTerminal(String packageType) {
        return new CashPaymentTerminal();
    }

    public static Storage createStorage(String packageType) {
        switch (packageType) {
            case "Basic":
                return new SDCardStorage();

            case "Standard":
                return new SDCardStorage();

            case "Advanced":
                return new OnBoardStorage();

            case "Premium":
                return new OnBoardStorage();

            default:
                return null;
        }
    }

    public static Controller createController(String packageType) {
        switch (packageType) {
            case "Basic":
                return new SeparateController();

            case "Standard":
                return new SeparateController();

            case "Advanced":
                return new TouchScreenController();

            case "Premium":
                return new TouchScreenController();

            default:
                return null;
        }
    }
}
