public class Client {
        public static void main(String[] args) {

            String[] files = {
                    "image.jpg",
                    "image.png",
                    "document.docx",
                    "document.doc",
                    "table.xls",
                    "table.xlsx",
                    "presentation.pptx",
                    "document.pdf",
            };

            FileHandler jpgHandler = new JpgFileHandler();
            FileHandler pngHandler = new PngFileHandler();
            FileHandler docxHandler = new DocxFileHandler();
            FileHandler docHandler = new DocFileHandler();
            FileHandler xlsHandler = new XlsFileHandler();
            FileHandler xlsxHandler = new XlsxFileHandler();
            FileHandler pptxHandler = new PptxFileHandler();
            FileHandler pdfHandler = new PdfFileHandler();

            jpgHandler.setNextHandler(pngHandler);
            pngHandler.setNextHandler(docxHandler);
            docxHandler.setNextHandler(docHandler);
            docHandler.setNextHandler(xlsHandler);
            xlsHandler.setNextHandler(xlsxHandler);
            xlsxHandler.setNextHandler(pptxHandler);
            pptxHandler.setNextHandler(pdfHandler);

            // Create Chain of responsibility to open file by correct program according to the extension.
            for (String file : files) {
                // open file
                jpgHandler.openFile(file);
            }

        }
}
