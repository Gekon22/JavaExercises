package docs;

public class DocumentChecker {
    public static void main(String[] args) {

        Document excelDocument = new ExcelDocument();
        Document pdfDocuments = new PdfDocument();

        excelDocument.getDescription();
        pdfDocuments.getDescription();
    }
}
