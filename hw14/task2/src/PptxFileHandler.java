public class PptxFileHandler extends FileHandler {
    public void openFile(String file) {
        if (file.endsWith(".pptx")){
            System.out.println("Opening PPTX file: " + file);
        } else if (nextHandler != null){
            nextHandler.openFile(file);
        } else {
            System.out.println("Can`t open file: " + file);
        }
    }
}
