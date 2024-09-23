public class PackageFactory {
    public static MicroController createMicroController(String microControllerName) {
        switch (microControllerName) {
            case "ATMega32":
                return new ATMega32();

            case "Arduino":
                return new Arduino();

            case "RaspberryPi":
                return new RaspBerryPi();

            default:
                return null;
        }
    }

    public static Display createDisplay(String displayName) {
        switch (displayName) {
            case "LCD":
                return new LCD();

            case "LED":
                return new LED();

            case "OLED":
                return new OLED();

            case "TouchScreen":
                return new TouchScreen();

            default:
                return null;
        }
    }

    public static Identification createIdentification(String identificationStyle) {
        switch (identificationStyle) {
            case "RFID":
                return new RFID();

            case "NFC":
                return new NFC();

            default:
                return null;
        }
    }

    public static PaymentTerminal createPaymentTerminal(String paymentMethod) {
        switch (paymentMethod) {
            case "Cash":
                return new CashPaymentTerminal();
        
            default:
                return null;
        }
    }

    public static Storage createStorage(String storageType) {
        switch (storageType) {
            case "SDcard":
                return new SDCardStorage();

            case "OnBoard":
                return new OnBoardStorage();

            default:
                return null;
        }
    }

    public static Controller createController(String controllerType) {
        switch (controllerType) {
            case "Separate":
                return new SeparateController();

            case "TouchScreen":
                return new TouchScreenController();

            default:
                return null;
        }
    }
}
