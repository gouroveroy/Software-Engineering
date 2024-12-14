public class DocumentProducer {
    public void produceDocument(String mode, String style) {
        if (mode.equalsIgnoreCase("formal") && style.equalsIgnoreCase("letter")) {
            Letter letter = new FormalLetter();
            System.out.println(letter.printContent());
        } else if (mode.equalsIgnoreCase("informal") && style.equalsIgnoreCase("letter")) {
            Letter letter = new InformalLetter();
            System.out.println(letter.printContent());
        } else if (mode.equalsIgnoreCase("formal") && style.equalsIgnoreCase("resume")) {
            Resume resume = new FormalResume();
            System.out.println(resume.printContent());
        } else if (mode.equalsIgnoreCase("informal") && style.equalsIgnoreCase("resume")) {
            Resume resume = new InformalResume();
            System.out.println(resume.printContent());
        }
    }
}
