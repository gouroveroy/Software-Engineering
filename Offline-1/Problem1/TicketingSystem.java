import java.util.ArrayList;
import java.util.Scanner;

public class TicketingSystem {
    private static String validateAndCreateConnection(String packageType, String internetOption, Scanner scanner) {
        while ((packageType.equals("Basic") || packageType.equals("Standard")) && internetOption.equals("Ethernet")) {
            System.out.println(
                    "Error: Ethernet is not supported for the package. Your package only supports WiFi or GSM.");
            System.out.print("Please choose a valid internet connection (1.WiFi/2.GSM): ");
            int option = scanner.nextInt();
            internetOption = selectInternetOption(option);
        }
        return internetOption;
    }

    private static String selectPackage(int option) {
        String packageType = "";
        switch (option) {
            case 1:
                packageType = "Basic";
                break;
            case 2:
                packageType = "Standard";
                break;
            case 3:
                packageType = "Advanced";
                break;
            case 4:
                packageType = "Premium";
                break;
            default:
                System.out.println("Invalid package type. Please enter a valid package type.");
                break;
        }
        return packageType;
    }

    private static String selectInternetOption(int option) {
        String internetOption = "";
        switch (option) {
            case 1:
                internetOption = "WiFi";
                break;
            case 2:
                internetOption = "GSM";
                break;
            case 3:
                internetOption = "Ethernet";
                break;
            default:
                System.out.println("Invalid internet option. Please enter a valid internet option.");
                break;
        }
        return internetOption;
    }

    private static String selectFrameworkOption(int option) {
        String frameWorkOption = "";
        switch (option) {
            case 1:
                frameWorkOption = "Django";
                break;
            case 2:
                frameWorkOption = "NodeJS";
                break;
            case 3:
                frameWorkOption = "Ruby";
                break;
            default:
                System.out.println("Invalid framework option. Please enter a valid framework option.");
                break;
        }
        return frameWorkOption;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("The company offers four packages. They are: ");
            System.out.println("1. Basic");
            System.out.println("2. Standard");
            System.out.println("3. Advanced");
            System.out.println("4. Premium");
            System.out.println("Enter the package type(1/2/3/4): ");
            int option = scanner.nextInt();
            String packageType = selectPackage(option);

            System.out.println("The company offers three internet options. They are: ");
            System.out.println("1. WiFi");
            System.out.println("2. GSM");
            System.out.println("3. Ethernet");
            System.out.println("Enter the internet option(1/2/3): ");
            option = scanner.nextInt();
            String internetOption = selectInternetOption(option);
            internetOption = validateAndCreateConnection(packageType, internetOption, scanner);

            System.out.println("The company offers three framework options. They are: ");
            System.out.println("1. Django");
            System.out.println("2. NodeJS");
            System.out.println("3. Ruby");
            System.out.println("Enter the framework option(1/2/3): ");
            option = scanner.nextInt();
            String frameWorkOption = selectFrameworkOption(option);

            TicketingSystemBuilder builder = new TicketingSystemBuilder();
            TicketingSystemDirector director = new TicketingSystemDirector(builder);

            ArrayList<String> system = director.buildTicketingSystem(packageType, internetOption, frameWorkOption);
            System.out.println("The ticketing system details are: ");
            for (String component : system) {
                System.out.println(component);
            }
            scanner.close();
        }
    }
}
