public class DocumentFactory {
    public static DocumentProcessor recognizeFile(String file) {
        String fileType = "";
        if (file.contains("docx")) {
            fileType = "docx";
        }

        if (file.contains("pdf")) {
            fileType = "pdf";
        }

        if (file.contains("txt")) {
            fileType = "txt";
        }
        
        switch (fileType) {
            case "docx":
                return new DocxDocumentProcessor();

            case "pdf":
                return new PdfDocumentProcessor();

            case "txt":
                return new TxtDocumentProcessor();
        
            default:
                return null;
        }
    }
}
