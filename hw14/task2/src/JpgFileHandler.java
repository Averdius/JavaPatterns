public class JpgFileHandler extends FileHandler {
    @Override
    public void openFile(String file) {
        if (file.endsWith(".jpg")){
            System.out.println("Opening JPG file: " + file);
        } else if (nextHandler != null){
            nextHandler.openFile(file);
        } else {
            System.out.println("Can`t open file: " + file);
        }
    }
}
