import java.util.Scanner;

public class DocumentSystem {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String file = scanner.nextLine();
            DocumentProcessor processor = DocumentFactory.recognizeFile(file);
            System.out.println(processor.LoadDocument());
            System.out.println(processor.SaveDocument());
        }
    }
}
