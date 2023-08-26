public class XlsxFileHandler extends FileHandler {
    public void openFile(String file) {
        if (file.endsWith(".xlsx")){
            System.out.println("Opening XLSX file: " + file);
        } else if (nextHandler != null){
            nextHandler.openFile(file);
        } else {
            System.out.println("Can`t open file: " + file);
        }
    }
}
