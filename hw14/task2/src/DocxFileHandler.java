public class DocxFileHandler extends FileHandler {
    public void openFile(String file) {
        if (file.endsWith(".docx")){
            System.out.println("Opening DOCX file: " + file);
        } else if (nextHandler != null){
            nextHandler.openFile(file);
        } else {
            System.out.println("Can`t open file: " + file);
        }
    }
}
