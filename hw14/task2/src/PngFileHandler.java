public class PngFileHandler extends FileHandler {
        public void openFile(String file) {
            if (file.endsWith(".png")){
                System.out.println("Opening PNG file: " + file);
            } else if (nextHandler != null){
                nextHandler.openFile(file);
            } else {
                System.out.println("Can`t open file: " + file);
            }
        }
}
