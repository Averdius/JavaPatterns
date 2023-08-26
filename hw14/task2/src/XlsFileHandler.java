public class XlsFileHandler extends FileHandler {
    public void openFile(String file) {
        if (file.endsWith(".xls")){
            System.out.println("Opening XLS file: " + file);
        } else if (nextHandler != null){
            nextHandler.openFile(file);
        } else {
            System.out.println("Can`t open file: " + file);
        }
    }
}
