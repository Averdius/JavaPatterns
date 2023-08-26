public class DocFileHandler extends FileHandler {
    public void openFile(String file) {
        if (file.endsWith(".doc")){
            System.out.println("Opening DOC file: " + file);
        } else if (nextHandler != null){
            nextHandler.openFile(file);
        } else {
            System.out.println("Can`t open file: " + file);
        }
    }
}
