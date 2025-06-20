public class Main{
	public static void main(String[] args) {
		Document_factory wordFactory= new WordDocument_factory();
        document wordDoc= wordFactory.create_document();
        wordDoc.open();
        
        Document_factory PDFFactory= new PdfDocument_factory();
        document PDFDoc= PDFFactory.create_document();
        PDFDoc.open();
        
        Document_factory excelFactory= new ExcelDocument_factory();
        document excelDoc= excelFactory.create_document();
        excelDoc.open();
	}
}