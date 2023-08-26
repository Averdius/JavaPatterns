public class PdfFileHandler extends FileHandler {
    public void openFile(String file) {
        if (file.endsWith(".pdf")){
            System.out.println("Opening PDF file: " + file);
        } else if (nextHandler != null){
            nextHandler.openFile(file);
        } else {
            System.out.println("Can`t open file: " + file);
        }
    }
}
