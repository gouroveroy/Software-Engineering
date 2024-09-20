public class InternetFactory {
    public static Internet createInternet(String internet) {
        switch (internet) {
            case "WiFi":
                return new WIFI();

            case "Ethernet":
                return new Ethernet();

            case "GSM":
                return new GSM();

            default:
                return null;
        }
    }
}
