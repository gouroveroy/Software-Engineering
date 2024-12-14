import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the component type (1 for CPU, 2 for GPU, 3 for RAM, 4 for Storage):");
        int componentType = scanner.nextInt();
        System.out.println("Enter the component price:");
        int price = scanner.nextInt();
        Component component = null;
        switch (componentType) {
            case 1:
                component = new HardwareComponent("CPU", price);
                break;
            case 2:
                component = new HardwareComponent("GPU", price);
                break;
            case 3:
                component = new HardwareComponent("RAM", price);
                break;
            case 4:
                component = new HardwareComponent("Storage", price);
                break;
            default:
                System.out.println("Invalid component type");
                System.exit(1);
        }
        System.out.println("Do you want to add extended warranty? (y/n)");
        String choice = scanner.next();
        if (choice.equals("y")) {
            component = new ExtendedWarranty(component, 500);
        }
        System.out.println("Do you want to add installation service? (y/n)");
        choice = scanner.next();
        if (choice.equals("y")) {
            component = new InstallationService(component, 100);
        }
        System.out.println("Component Description: " + component.getDescription());
        System.out.println("Component Price: " + component.getPrice());
        scanner.close();
    }
}
