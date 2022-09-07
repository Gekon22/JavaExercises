package document;

public class DocumentChecker {
    public static void main(String[] args) {

        Document excelDocument = new ExcelDocument();
        Document pdfDocument = new PdfDocument();
        Document document = new ExcelDocument();

        excelDocument.getDescription();
        pdfDocument.getDescription();
        document.getDescription();
        ExcelDocument document2 = (ExcelDocument) document;
        document2.getDescription();

        }

    }

