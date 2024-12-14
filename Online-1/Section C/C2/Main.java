import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your preferred mode(formal/informal): ");
        String mode = scanner.nextLine();
        System.out.println("Enter your preferred style(letter/resume): ");
        String style = scanner.nextLine();
        DocumentProducer producer = new DocumentProducer();
        producer.produceDocument(mode, style);
        scanner.close();
    }
}
